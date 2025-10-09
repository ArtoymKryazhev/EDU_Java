public class Lab_1_Task_1 {
    public static void main(String[] args) {
        // Проверяем, что передано ровно два аргумента
        if (args.length != 2) {
            System.out.println("Ошибка: нужно передать два числа a и b.");
            return;
        }

        try {
            // Преобразуем аргументы в числа
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);

            double result;

            if (a * b > 100) {
                result = 3 * Math.tan(b); // утроенный тангенс второго числа
            } else {
                result = a * 5; // первое число умножаем на 5
            }

            System.out.println("Результат: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: аргументы должны быть числами.");
        }
    }
}
