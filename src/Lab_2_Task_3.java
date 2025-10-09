import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Lab_2_Task_3 {

    public static void main(String[] args) {
        // 1️⃣ Создаём исходный массив b
        int[][] A = {{1, 3, 5, 1, 5, 6, 8}, {2, 4, 7, 2, 5, 7, 8}, {0, 5, 8, 3, 5, 7, 2}, {2, 4, 6, 1, 4, 6, 8}, {4, 6, 8, 3, 2, 5, 6}, {1, 4, 6, 7, 8, 3, 7}};

        Scanner input = new Scanner(System.in);

        int number = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print("Введите число: ");
                number = input.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: нужно ввести именно ЧИСЛО, а не букву или слово!");
                input.nextLine(); // ⚠️ очищаем буфер ввода, чтобы не зациклиться
            }
        }


        int cout = 0;
        ArrayList<Integer> vector = new ArrayList<>();

        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < A[row].length; col++) {
                if (!(number == A[row][col])) {
                    vector.add(A[row][col]);
                }
            }
        }

        System.out.println(vector);

        input.close();
    }
}
