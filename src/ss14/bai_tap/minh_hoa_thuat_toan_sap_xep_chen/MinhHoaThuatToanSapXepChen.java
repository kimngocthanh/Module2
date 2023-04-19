package ss14.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;

import java.util.Arrays;

public class MinhHoaThuatToanSapXepChen {
    public static void SapXepChen(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Bắt đầu vòng lặp" + (i + 1));
            int key = arr[i];
            System.out.print("Gán 1 giá trị key = arr[" + i + "] = " + key);
            int j;
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                System.out.println("Lúc này j = " + j);
                arr[j + 1] = arr[j];
                System.out.println("Nếu j >= 0 và giá trị array[j] lớn hơn key thì gán " + "arr[" + (j + 1) + "]= arr[" + j + "]");
                System.out.println("Mảng sau khi thay đổi và gán giá trị mới cho các phần tử là: " + Arrays.toString(arr));
            }
            arr[j + 1] = key;
            System.out.println("Sau khi thực hiện hết vòng lặp kiểm tra ta tìm được vị trí của phần tử nhỏ hơn key là j = " + (j + 1) + " và gán giá trị cho vị trí đó là arr[j+1] = " + key);
            System.out.println("Lúc này mảng sau khi thực hiện " + i + "vòng lặp là: " + Arrays.toString(arr));
        }
    }



    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 3, 5};
        SapXepChen(array);
    }
}
