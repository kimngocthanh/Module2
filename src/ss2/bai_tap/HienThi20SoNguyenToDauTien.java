package ss2.bai_tap;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        //boolean flag = true;
        while (count != 20) {
            boolean flag = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}
