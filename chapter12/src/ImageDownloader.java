import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class ImageDownloader extends JFrame {
    private final JTextField urlTextField;
    private final JLabel imageLabel;
    private static final String IMAGE_FILE_PATH = "downloaded_image.jpg";

    public ImageDownloader() {
        setTitle("Image Downloader");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        urlTextField = new JTextField(30);
        JButton downloadButton = new JButton("Download Image");
        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        downloadButton.addActionListener(this::downloadImage);

        setLayout(new BorderLayout());
        add(urlTextField, BorderLayout.NORTH);
        add(downloadButton, BorderLayout.CENTER);
        add(imageLabel, BorderLayout.SOUTH);

        setImageFromLocalFile();
    }

    private void downloadImage(ActionEvent e) {
        try {
            String imageUrl = urlTextField.getText();
            if (imageUrl == null || imageUrl.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a valid URL.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            URL url = new URL(imageUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                InputStream in = connection.getInputStream();
                ByteArrayOutputStream out = new ByteArrayOutputStream();

                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = in.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }
                in.close();

                FileOutputStream fos = new FileOutputStream(IMAGE_FILE_PATH);
                fos.write(out.toByteArray());
                fos.close();

                setImageFromLocalFile();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to download the image. HTTP error code: " + responseCode, "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void setImageFromLocalFile() {
        File imageFile = new File(ImageDownloader.IMAGE_FILE_PATH);
        if (imageFile.exists()) {
            ImageIcon icon = new ImageIcon(imageFile.getAbsolutePath());
            Image scaledImage = icon.getImage().getScaledInstance(500, 400, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(scaledImage));
        } else {
            imageLabel.setText("No image available.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ImageDownloader frame = new ImageDownloader();
            frame.setVisible(true);
        });
    }
}