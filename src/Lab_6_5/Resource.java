package Lab_6_5;

class Resource {
    private String name;
    private byte[] data; // Имитация данных ресурса (текстура, звук и т.д.)

    public Resource(String name) {
        this.name = name;
        // Имитируем загрузку ресурса из файла
        this.data = new byte[1024 * 1024]; // 1 MB данных
        System.out.println("Загружаем ресурс: " + name + " (создаем новый объект)");
    }

    public void display(int x, int y) {
        System.out.println("Отображаем ресурс '" + name + "' в позиции (" + x + ", " + y + ")");
    }

    public void play() {
        System.out.println("Воспроизводим ресурс: " + name);
    }
}
