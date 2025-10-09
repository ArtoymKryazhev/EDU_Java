import java.util.Arrays;

public class Lab_2_Task_1 {
    public static void main(String[] args) {

        int[] array = fillRandomIntVector(20, -99, 99);
        printVector(array, "Исходный массив:");

        double[] reciprocalArray = CreateReciprocalFraction(array);
        printVector(reciprocalArray, "Массив обратных значений (1 / n_i):");

        int[] uniqueArray = getUniqueElements(array);
        printVector(uniqueArray, "Массив из неповторяющихся элементов:");
    }


    public static int[] fillRandomIntVector(int size, int min, int max) {
        int[] vector = new int[size];
        for (int i = 0; i < size; i++) {
            vector[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return vector;
    }

    public static void printVector(int[] vector, String message) {
        System.out.println(message);
        System.out.println(Arrays.toString(vector));
    }

    public static void printVector(double[] vector, String message) {
        System.out.println(message);
        System.out.println(Arrays.toString(vector));
    }

    public static double[] CreateReciprocalFraction(int[] array) {
        double[] result = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            try {
                result[i] = 1.0 / array[i];
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: деление на ноль в элементе с индексом " + i);
                result[i] = 0;
            }
        }
        return result;
    }

    public static int[] getUniqueElements(int[] array) {
        int[] temp = new int[array.length];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {


                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[count++] = array[i];
            }
        }
        return Arrays.copyOf(temp, count);
    }
}
