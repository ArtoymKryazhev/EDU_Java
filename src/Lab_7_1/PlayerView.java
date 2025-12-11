package Lab_7_1;

public class PlayerView {
    public void showCurrentSong(SongModel song) {
        System.out.println("Сейчас играет:");
        System.out.printf("  %s - %s", song.getTitle(), song.getArtist());
        System.out.println(song.isPlaying() ? "PLAYING" : "PAUSED");
        System.out.println();
    }
}
