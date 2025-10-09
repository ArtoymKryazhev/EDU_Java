public class Lab_2_Task_4 {

    public static void main(String[] args) {
        // 1️⃣ Создаём исходный массив b
        int[][] A = {
                {1, 3, 5, 1, 5, 6, 8},
                {2, 4, 7, 2, 5, 7, 8},
                {0, 5, 8, 3, 5, 7, 2},
                {2, 4, 6, 1, 4, 6, 8},
                {4, 6, 8, 3, 2, 5, 6},
                {2, 4, 7, 2, 5, 7, 8},
                {1, 4, 6, 7, 8, 3, 7}
        };

        int product = 1;

        for (int row = 0; row < A.length - 1; row++) {
            int col = row + 1;
            System.out.println(A[row][col]);
            product = product * A[row][col];
        }

        System.out.println(product);
    }
}


