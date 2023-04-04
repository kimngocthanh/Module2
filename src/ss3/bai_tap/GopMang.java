package ss3.bai_tap;
import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,5,6,7};
        int[] array2 = {3,4,6,7,8,9};
        int[] array3 = new int[12];
        int cout = 0;
        for (int j : array1) {
            array3[cout] = j;
            cout++;
        }
        for (int j : array2) {
            array3[cout] = j;
            cout++;
        }
        System.out.println(Arrays.toString(array3));
    }
}
