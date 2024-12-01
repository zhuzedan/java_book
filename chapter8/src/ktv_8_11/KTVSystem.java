package ktv_8_11;

import java.util.*;

public class KTVSystem {
    private List<Song> playlist = new ArrayList<>(); // 播放列表
    private Map<String, Song> allSongs = new HashMap<>(); // 所有歌曲
    private Scanner scanner = new Scanner(System.in);

    public KTVSystem() {
        // 初始化歌曲库
        initializeSongs();
    }

    private void initializeSongs() {
        allSongs.put("001", new Song("001", "青花瓷"));
        allSongs.put("002", new Song("002", "稻香"));
        allSongs.put("003", new Song("003", "夜曲"));
        allSongs.put("004", new Song("004", "晴天"));
        allSongs.put("005", new Song("005", "七里香"));
    }

    // 显示歌曲列表
    public void displaySongs() {
        System.out.println("歌曲列表:");
        for (Song song : allSongs.values()) {
            System.out.println(song);
        }
    }

    // 添加歌曲到播放列表
    public void addSongToPlaylist() {
        System.out.print("请输入要添加的歌曲编号: ");
        String id = scanner.nextLine();
        if (allSongs.containsKey(id)) {
            Song song = allSongs.get(id);
            playlist.add(song);
            System.out.println("歌曲 " + song.getTitle() + " 已添加到播放列表。");
        } else {
            System.out.println("未找到编号为 " + id + " 的歌曲。");
        }
    }

    // 置顶歌曲
    public void pinSongToTop() {
        System.out.print("请输入要置顶的歌曲编号: ");
        String id = scanner.nextLine();
        if (allSongs.containsKey(id)) {
            Song song = allSongs.get(id);
            if (playlist.contains(song)) {
                playlist.remove(song);
                playlist.add(0, song);
                System.out.println("歌曲 " + song.getTitle() + " 已置顶。");
            } else {
                System.out.println("播放列表中不存在编号为 " + id + " 的歌曲。");
            }
        } else {
            System.out.println("未找到编号为 " + id + " 的歌曲。");
        }
    }

    // 将歌曲前移一位
    public void moveSongForward() {
        System.out.print("请输入要前移的歌曲编号: ");
        String id = scanner.nextLine();
        for (int i = 0; i < playlist.size(); i++) {
            if (playlist.get(i).getId().equals(id)) {
                if (i > 0) {
                    Collections.swap(playlist, i, i - 1);
                    System.out.println("歌曲 " + playlist.get(i - 1).getTitle() + " 已前移一位。");
                } else {
                    System.out.println("歌曲已在第一位，无法前移。");
                }
                return;
            }
        }
        System.out.println("未找到编号为 " + id + " 的歌曲。");
    }

    // 显示播放列表
    public void displayPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("播放列表为空。");
        } else {
            System.out.println("播放列表:");
            for (int i = 0; i < playlist.size(); i++) {
                System.out.println((i + 1) + ". " + playlist.get(i));
            }
        }
    }

    // 主菜单
    public void showMenu() {
        while (true) {
            System.out.println("\nKTV点歌系统");
            System.out.println("1. 显示歌曲列表");
            System.out.println("2. 添加歌曲到播放列表");
            System.out.println("3. 置顶歌曲");
            System.out.println("4. 将歌曲前移一位");
            System.out.println("5. 显示播放列表");
            System.out.println("6. 退出系统");
            System.out.print("请选择操作: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    displaySongs();
                    break;
                case "2":
                    addSongToPlaylist();
                    break;
                case "3":
                    pinSongToTop();
                    break;
                case "4":
                    moveSongForward();
                    break;
                case "5":
                    displayPlaylist();
                    break;
                case "6":
                    System.out.println("感谢使用KTV点歌系统，再见！");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("无效的选择，请重新选择。");
            }
        }
    }
}
