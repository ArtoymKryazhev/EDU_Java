import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите x (в радианах): ");
        double x = sc.nextDouble();

        double Y = computeY(x);
        double F = computeF(x);

        System.out.println("Y = " + Y);
        System.out.println("F = " + F);
    }

    private static double computeY(double x) {
        if (x <= -3) {
            return Math.pow(x, 3) + 1;
        } else if (x <= 4) { // -3 < x <= 4
            return x * (1 + Math.pow(2, x));
        } else { // x > 4
            double cosx = Math.cos(x);
            if (Math.abs(cosx) < 1e-12) {
                System.out.println("Warning: tan(x) не определён (cos(x)≈0). Возвращаю NaN для Y.");
                return Double.NaN;
            }
            return Math.tan(x);
        }
    }

    private static double computeF(double x) {
        if (x <= -3) {
            return Math.exp(Math.sin(x));
        } else if (x <= 4) { // -3 < x <= 4
            return Math.pow(x, 4);
        } else { // x > 4 → 5-й корень из tan(x)
            double cosx = Math.cos(x);
            if (Math.abs(cosx) < 1e-12) {
                System.out.println("Warning: tan(x) не определён (cos(x)≈0). Возвращаю NaN для F.");
                return Double.NaN;
            }
            double t = Math.tan(x);

            // если tan(x) < 0 → вещественный 5-й корень существует
            return Math.copySign(Math.pow(Math.abs(t), 1.0 / 5), t);
        }
    }

}
