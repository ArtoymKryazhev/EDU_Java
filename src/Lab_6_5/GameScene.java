package Lab_6_5;

class GameScene {
    private ResourceCache cache;

    public GameScene(ResourceCache cache) {
        this.cache = cache;
    }

    public void addObject(String textureName, int x, int y) {
        Resource texture = cache.getResource(textureName);
        texture.display(x, y);
    }

    public void playSound(String soundName) {
        Resource sound = cache.getResource(soundName);
        sound.play();
    }
}