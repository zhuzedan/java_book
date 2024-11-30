import javax.swing.*;

public class NotePad11_2 extends JFrame {
    JMenu file, edit;
    JMenuItem build, open, save, all, exit, copy, paste, shear;
    JTextArea textArea;

    public NotePad11_2() {
        setTitle("记事本");
        setSize(500, 400);
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        file = new JMenu("文件");
        edit = new JMenu("编辑");
        build = new JMenuItem("新建");
        open = new JMenuItem("打开");
        save = new JMenuItem("保存");
        all = new JMenuItem("全选");
        exit = new JMenuItem("退出");
        copy = new JMenuItem("复制");
        paste = new JMenuItem("粘贴");
        shear = new JMenuItem("剪切");
        textArea = new JTextArea();
        file.add(build);
        file.add(open);
        file.add(save);
        file.add(exit);
        edit.add(all);
        edit.add(copy);
        edit.add(paste);
        edit.add(shear);
        menuBar.add(file);
        menuBar.add(edit);
        add(textArea);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NotePad11_2();
    }
}
