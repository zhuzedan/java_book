package ktv_8_11;

public class Song {
    private String id; // 歌曲编号
    private String title; // 歌曲名称

    public Song(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "歌曲编号: " + id + ", 歌曲名称: " + title;
    }
}
