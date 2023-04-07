package ss6.bai_tap.circle_cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder.toString());

        Cylinder cylinder1 = new Cylinder(20, 7, "red");
        System.out.println(cylinder1.toString());
    }
}
