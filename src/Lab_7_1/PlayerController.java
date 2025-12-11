package Lab_7_1;

import java.util.List;
import java.util.Arrays;

public class PlayerController {
    private List<SongModel> playlist;
    private int currentIndex = 0;
    private PlayerView view;

    public PlayerController(PlayerView view) {
        this.view = view;
        this.playlist = Arrays.asList(
                new SongModel("Bohemian Rhapsody", "Queen"),
                new SongModel("Hotel California", "Eagles"),
                new SongModel("Stairway to Heaven", "Led Zeppelin")
        );
    }

    // Обработка событий
    public void nextTrack() {
        currentIndex = (currentIndex + 1) % playlist.size();
        updateView();
    }

    public void prevTrack() {
        currentIndex = (currentIndex + 1) % playlist.size();
        updateView();
    }

    public void togglePlay() {
        SongModel currentSong = getCurrentSong();
        currentSong.setPlaying(!currentSong.isPlaying());
        updateView();
    }

    private SongModel getCurrentSong() {
        return playlist.get(currentIndex);
    }

    private void updateView() {
        view.showCurrentSong(getCurrentSong());
    }
}

