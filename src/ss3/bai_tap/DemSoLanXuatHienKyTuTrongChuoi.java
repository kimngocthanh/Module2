package ss3.bai_tap;

public class DemSoLanXuatHienKyTuTrongChuoi {
    public static void main(String[] args) {
        String mang = "abcbabcbsbcabsbca";
        int cout = 0;
        char kyTu = 'a';
        for (int i = 0; i < mang.length(); i++) {
            if (kyTu == mang.charAt(i)) {
                cout++;
            }
        }
        System.out.println(cout);
    }
}
