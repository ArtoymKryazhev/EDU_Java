package Lab_4_3;

public class Point3D extends Point{

    private int z;

    public Point3D() {
        super();
        z = 0;
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setLocation(int x, int y, int z) {
        super.setLocation(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
    }

    public double distanceFromOrigin() {
        return Math.sqrt(getX() * getX() + getY() * getY() + z * z);
    }

    public boolean isInBox(Point3D corner1, Point3D corner2) {
        int minX = Math.min(corner1.getX(), corner2.getX());
        int maxX = Math.max(corner1.getX(), corner2.getX());
        int minY = Math.min(corner1.getY(), corner2.getY());
        int maxY = Math.max(corner1.getY(), corner2.getY());
        int minZ = Math.min(corner1.getZ(), corner2.getZ());
        int maxZ = Math.max(corner1.getZ(), corner2.getZ());

        return (getX() >= minX && getX() <= maxX) &&
                (getY() >= minY && getY() <= maxY) &&
                (z >= minZ && z <= maxZ);
    }

    public boolean isInSphere(Point3D center, double radius) {
        double dx = this.getX() - center.getX();
        double dy = this.getY() - center.getY();
        double dz = z - center.getZ();
        return dx * dx + dy * dy + dz * dz <= radius * radius;
    }

    public void rotate(double alpha, double beta, double gamma) {
        // Вращение вокруг X
        double y1 = getY() * Math.cos(alpha) - z * Math.sin(alpha);
        double z1 = getY() * Math.sin(alpha) + z * Math.cos(alpha);

        // Вращение вокруг Y (используем уже новые значения y1, z1)
        double x2 = getX() * Math.cos(beta) + z1 * Math.sin(beta);
        double z2 = -getX() * Math.sin(beta) + z1 * Math.cos(beta);

        // Вращение вокруг Z (используем x2, y1)
        double x3 = x2 * Math.cos(gamma) - y1 * Math.sin(gamma);
        double y3 = x2 * Math.sin(gamma) + y1 * Math.cos(gamma);

        // Сохраняем результат, приводим к int если надо
        super.setLocation((int) Math.round(x3), (int) Math.round(y3));
        this.z = (int) Math.round(z2);
    }


}
