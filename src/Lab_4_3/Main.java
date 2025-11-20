package Lab_4_3;

public class Main {

    public static void main(String[] args) {

        Point3D point3D_1 = new Point3D();

        System.out.println(point3D_1.toString());

        Point3D point3D_2 = new Point3D();

        point3D_2.setLocation(1, 2, 3);
        System.out.println(point3D_2.toString());

        Point3D point3D_3 = new Point3D();
        point3D_3.setLocation(2, 3);
        System.out.println(point3D_3.toString());


        Point3D point3D_4 = new Point3D(1, 2, 3);
        Point3D point3D_5 = new Point3D(4, 8, 10);
        Point3D point3D_6 = new Point3D(20, 20, 20);

        System.out.println(point3D_6.isInBox(point3D_4, point3D_5));

        point3D_2.rotate(Math.PI / 2, 0, 0); // Вращение вокруг X на 90°
        System.out.println("After rotate around X by 90°: " + point3D_2);

        point3D_3.rotate(0, Math.PI / 2, 0); // Вращение вокруг Y на 90°
        System.out.println("After rotate around Y by 90°: " + point3D_3);

        point3D_4.rotate(0, 0, Math.PI / 2); // Вращение вокруг Z на 90°
        System.out.println("After rotate around Z by 90°: " + point3D_4);

        Point3D center = new Point3D(0, 0, 0);
        double radius = 25;
        System.out.println("point3D_6 is in sphere: " + point3D_6.isInSphere(center, radius));
    }

}
