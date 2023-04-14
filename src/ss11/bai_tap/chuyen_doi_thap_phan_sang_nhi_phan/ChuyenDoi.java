package ss11.bai_tap.chuyen_doi_thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("nhập n: ");
        int n = Integer.parseInt(scanner.nextLine());
        while (n != 0) {
            int nhiPhan = n % 2;
            stack.push(nhiPhan);
            n /= 2;
        }
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            System.out.print(stack.pop());
        }
    }
}
