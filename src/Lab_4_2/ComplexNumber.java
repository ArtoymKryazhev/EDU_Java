package Lab_4_2;

public class ComplexNumber {
    private double real;   // действительная часть
    private double imaginary;  // мнимая часть

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Метод для получения модуля (радиуса)
    public double getMagnitude() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    // Метод для получения аргумента (угла) в радианах
    public double getAngle() {
        return Math.atan2(imaginary, real);
    }

    // Метод для вывода полярной формы в удобочитаемом виде
    public String toPolarString() {
        double magnitude = getMagnitude();
        double angle = getAngle();
        return String.format("Полярная форма: %.3f(cos(%.3f) + i*sin(%.3f))", magnitude, angle, angle);
    }

    // Переопределение toString для алгебраической формы
    @Override
    public String toString() {
        return String.format("Алгебраическая форма: %.3f + %.3fi", real, imaginary);
    }
}

