package Lab_7_1;

public class Main {
    public static void main(String[] args) {
        PlayerView view = new PlayerView();
        PlayerController controller = new PlayerController(view);

        System.out.println("MVC Музыкальный плеер\n");

        controller.nextTrack();
        controller.togglePlay();
        controller.nextTrack();
        controller.togglePlay();
        controller.prevTrack();
    }
}
