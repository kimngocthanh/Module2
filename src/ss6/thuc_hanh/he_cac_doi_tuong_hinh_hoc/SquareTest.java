package ss6.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square.toString());

        Square square1 = new Square(20);
        System.out.println(square1.toString());

        Square square2 = new Square(25, "blue", true);
        System.out.println(square2.toString());
    }
}
