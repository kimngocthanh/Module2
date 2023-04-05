package ss2.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chonHinh = -1;
        while (chonHinh != 0) {
            System.out.println("1: In hình chữ nhật");
            System.out.println("2: In hình tam giác vuông, có cạnh góc vuông ở botton-left");
            System.out.println("3: In hình tam giác vuông, có cạnh góc vuông ở top-left   ");
            System.out.println("4: In hình tam giác cân");
            System.out.println("0: thoát khỏi chọn hình");
            System.out.println("chọn menu muốn in");
            chonHinh = Integer.parseInt(scanner.nextLine());
            switch (chonHinh) {
                case 1:
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 5; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    for (int i = 7; i >= 1; i--) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 0; j <= 10; j++) {
                            if (i == 5 || (j >= (5 - i) && j <= (5 + i))) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println("");
                    }
                    break;
                case 0:
                    break;
            }
        }
    }
}
