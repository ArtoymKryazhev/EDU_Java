package Lab_6_1;

public class Main {
    public static void main(String[] args) {
        InputManager im = InputManager.getInstance();
        InputManager im_2 = InputManager.getInstance();

        im.registerKeyBinding("jump", "SPACE");
        im.registerKeyBinding("shoot", "LMB");

        String jumpKey = im.getKeyForAction("jump");
        System.out.println("Jump key: " + jumpKey);


    }
}

