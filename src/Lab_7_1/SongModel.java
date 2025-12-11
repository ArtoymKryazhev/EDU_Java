package Lab_7_1;

public class SongModel {
    private String title;
    private String artist;
    private boolean isPlaying;

    public SongModel(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.isPlaying = false;
    }

    // Геттеры/сеттеры
    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public boolean isPlaying() { return isPlaying; }
    public void setPlaying(boolean playing) { isPlaying = playing; }
}

