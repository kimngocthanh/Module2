package ss3.bai_tap;

import java.util.Scanner;

public class TimMinTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int doDai = scanner.nextInt();
        int[] mang = new int[doDai];
        for (int i = 0; i < mang.length; i++) {
            System.out.println("nhập phần tử thứ "+(i+1)+":");
            mang[i] = scanner.nextInt();
        }
        int min = mang[0];
        for (int i = 0; i < mang.length; i++) {
            if(min>mang[i]){
                min=mang[i];
            }
        }System.out.println(min);
    }
}
