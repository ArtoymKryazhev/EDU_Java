import java.util.Arrays;

public class Lab_2_Task_2 {
    public static void main(String[] args) {
        // 1️⃣ Создаём исходный массив b
        int[] b = {5, -3, 8, 0, -7, 2, -1};
        printArray(b, "Исходный массив b:");

        // 2️⃣ Формируем массив C из отрицательных элементов b (со сжатием)
        int[] c = getNegativeElements(b);
        printArray(c, "Массив C (только отрицательные элементы):");

        // 3️⃣ Сортируем массив C методом выбора (Selection Sort)
        selectionSort(c);
        printArray(c, "Массив C после сортировки по возрастанию:");
    }

    // 🔹 Метод отбора отрицательных элементов
    public static int[] getNegativeElements(int[] array) {
        int count = 0;

        // Считаем количество отрицательных элементов
        for (int num : array) {
            if (num < 0) count++;
        }

        // Создаём массив нужного размера
        int[] negatives = new int[count];
        int index = 0;

        // Заполняем массив только отрицательными числами
        for (int num : array) {
            if (num < 0) {
                negatives[index++] = num;
            }
        }

        return negatives;
    }

    // 🔹 Метод сортировки "выбором" (Selection Sort)
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            // ищем индекс минимального элемента в оставшейся части
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // если нашли элемент меньше — меняем местами
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    // 🔹 Метод для печати массива
    public static void printArray(int[] array, String message) {
        System.out.println(message);
        System.out.println(Arrays.toString(array));
        System.out.println();
    }
}
