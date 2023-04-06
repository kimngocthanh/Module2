package ss6.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class CricleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "red", false);
        System.out.println(circle);
    }

}
