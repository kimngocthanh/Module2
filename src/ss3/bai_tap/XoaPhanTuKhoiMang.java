package ss3.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] mang = {10, 21, 31, 59, 59, 16, 27, 38};
        int temp,i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập phần tử bạn muốn xóa");
        int x = Integer.parseInt(scanner.nextLine());
        for (temp=0, i = 0; i < mang.length; i++) {
            if(mang[i]!=x){
                mang[temp]=mang[i];
                temp++;
            }
        }
//        for (int j = 0; j < mang.length; j++) {
//            while (temp==0){
//                mang[mang.length-j]=0;
//                temp--;
//                j++;
//            }
//        }
        for ( i = 0; i < mang.length; i++) {
            System.out.print(mang[i]+ "\t");
        }
    }
}
