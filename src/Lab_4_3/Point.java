package Lab_4_3;

public class Point {

    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public boolean isInRectangle(Point top_left, Point bottom_right) {
        int x = this.getX();
        int y = this.getY();
        return (x >= top_left.getX() && x <= bottom_right.getX() &&
                y >= bottom_right.getY() && y <= top_left.getY());
    }

    public boolean isInCircle(Point center, double radius) {
        double dx = this.getX() - center.getX();
        double dy = this.getY() - center.getY();
        return dx * dx + dy * dy <= radius * radius;
    }

    public void rotate(double theta) {
        // Сохраняем старые значения
        double oldX = x;
        double oldY = y;
        // Новые значения по формуле поворота
        x = (int) Math.round(oldX * Math.cos(theta) - oldY * Math.sin(theta));
        y = (int) Math.round(oldX * Math.sin(theta) + oldY * Math.cos(theta));
    }

}
