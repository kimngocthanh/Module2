package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongDuongCheoChinh {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập độ dài của mảng");
        int doDai = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int[][] mang = new int[doDai][doDai];
        for (int i = 0; i < doDai; i++) {
            for (int j = 0; j < doDai; j++) {
                System.out.print("nhập phần tử trong mảng :");
                mang[i][j]= Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0; i < mang.length; i++) {
            for (int j = 0; j < mang[i].length; j++) {
                if(i==j||((i+j)==(doDai-1))){
                    sum+= mang[i][j];
                    System.out.println(mang[i][j]);
                }
            }

        }
        System.out.println(Arrays.deepToString(mang));
        System.out.println(sum);
    }
}
