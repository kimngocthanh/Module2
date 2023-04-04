package ss2.bai_tap;

public class HIenThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int number = 2;
        boolean flag = true;
        while (number < 100) {
            flag = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = false;
                }
            }if(flag){
                System.out.println(number);
            }number++;
        }
    }
}
