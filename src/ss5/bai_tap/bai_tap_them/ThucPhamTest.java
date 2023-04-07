package ss5.bai_tap.bai_tap_them;

public class ThucPhamTest {
    public static void main(String[] args) {
        ThucPham thucPham = new ThucPham();
        System.out.println(thucPham.toString());

        ThucPham thucPham1 = new ThucPham("2", "mì tôm", 50000, 2,3,2020,4,5,2023);
        System.out.println(thucPham1.toString());

        ThucPham thucPham2 = new ThucPham("2", "mì tôm", 50000, 2,3,2024,4,5,2023);
        System.out.println(thucPham2.toString());

        ThucPham thucPham3 = new ThucPham("", "mì tôm", 50000, 2,3,2021,4,5,2023);
        System.out.println(thucPham3.toString());
    }
}
