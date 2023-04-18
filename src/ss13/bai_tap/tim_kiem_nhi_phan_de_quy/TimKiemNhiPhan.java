package ss13.bai_tap.tim_kiem_nhi_phan_de_quy;

import java.util.ArrayList;
import java.util.Scanner;

public class TimKiemNhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều dài mảng");
        int numLength = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < numLength; i++) {
            System.out.println("nhập phần tử arrayList[" + i + "]");
            int arr = Integer.parseInt(scanner.nextLine());
            arrayList.add(arr);
        }
        arrayList.sort(((o1, o2) -> o1 - o2));
        System.out.println(arrayList);
        System.out.println("nhập số muốn tìm");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(binarySearch(arrayList, 0, arrayList.size() - 1, number));
    }

    public static int binarySearch(ArrayList<Integer> arrayList, int left, int right, int value) {
        int middle = (left + right) / 2;
        if (arrayList.get(middle) == value) {
            return middle;
        } else if (arrayList.get(middle) < value) {
            return binarySearch(arrayList, middle + 1, right, value);
        }
        return binarySearch(arrayList, left, middle - 1, value);
    }
}
