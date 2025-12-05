package Lab_6_5;

public class FlyweightDemo {
    public static void main(String[] args) {
        System.out.println("=== Демонстрация паттерна Flyweight ===\n");

        // Создаем кэш ресурсов
        ResourceCache cache = new ResourceCache();

        // Создаем игровую сцену
        GameScene scene = new GameScene(cache);

        System.out.println("--- Создаем объекты с текстурами ---");

        // Первый раз текстура загружается
        scene.addObject("grass_texture", 10, 20);

        // Второй раз используем ту же текстуру из кэша
        scene.addObject("grass_texture", 30, 40);
        scene.addObject("grass_texture", 50, 60);

        System.out.println("\n--- Создаем объекты с другими текстурами ---");

        // Новая текстура - загружается
        scene.addObject("water_texture", 15, 25);

        // Опять старая текстура - берем из кэша
        scene.addObject("grass_texture", 70, 80);

        // Новая текстура - загружается
        scene.addObject("stone_texture", 25, 35);

        System.out.println("\n--- Используем звуки ---");

        // Звуки тоже кэшируются
        scene.playSound("explosion_sound");
        scene.playSound("explosion_sound");
        scene.playSound("jump_sound");
        scene.playSound("explosion_sound");

        System.out.println("\n--- Статистика ---");
        System.out.println("Всего загружено уникальных ресурсов: " + cache.getCacheSize());
        System.out.println("(grass_texture, water_texture, stone_texture, explosion_sound, jump_sound)");

        System.out.println("\nБез кэширования пришлось бы создать 9 объектов ресурсов");
        System.out.println("С кэшированием создано только 5 объектов");
    }
}