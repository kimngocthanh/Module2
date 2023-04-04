package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TongCacSoCotXacDinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập hàng");
        int hang = scanner.nextInt();
        System.out.println("nhập cột");
        int cot = scanner.nextInt();
        System.out.println("nhập cột muốn tính tổng");
        int tinh = scanner.nextInt();
        int sum = 0;
        int[][] mang = new int[hang][cot];
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("nhập phần tử trong mảng");
                mang[i][j]= scanner.nextInt();
            }
        }
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.println(mang[i][j]);
                if(j==tinh){
                    sum+= mang[i][tinh];
                }
            }
        }System.out.println("tổng bằng :"+ sum);
    }
}
