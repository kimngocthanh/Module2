package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài mảng");
        int doDai = Integer.parseInt(scanner.nextLine());
        int[] mang = new int[doDai];
        int[] mangChen = new int[doDai + 1];
        for (int i = 0; i < doDai; i++) {
            System.out.print("nhập phần tử thứ " + (i + 1)+":");
            mang[i] = scanner.nextInt();
        }
        System.out.println("nhập số muốn chèn :");
        int x = scanner.nextInt();
        System.out.println("nhập vị trí muốn chèn");
        int viTri = scanner.nextInt();
        for (int i = 0; i <doDai ; i++) {
            if(i==viTri){
                for (int j = viTri; j < mangChen.length-1; j++) {
                    mangChen[i]=x;
                    mangChen[j]=mang[j];
                }
            }else {
                mangChen[i]=mang[i];
            }
        }
        System.out.println(Arrays.toString(mangChen));

    }
}
