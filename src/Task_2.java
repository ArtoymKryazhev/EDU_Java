public class Task_2 {
    public static void main(String[] args) {
        // Проверяем, что переданы два аргумента
        if (args.length != 2) {
            System.out.println("Ошибка: нужно передать два числа a и b.");
            return;
        }

        try {
            // Преобразуем аргументы в числа
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);

            // Находим max и min
            double max = Math.max(a, b);
            double min = Math.min(a, b);

            // Проверка: чтобы не было деления на 0
            if (min == 0) {
                System.out.println("Ошибка: min(a, b) = 0, деление на ноль невозможно.");
                return;
            }

            // Вычисляем d по формуле
            double d = (max - 2 * Math.sqrt(min) + 4.2 * min) / (1 + (max / min));

            System.out.println("Результат d = " + d);

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: аргументы должны быть числами.");
        }
    }
}
