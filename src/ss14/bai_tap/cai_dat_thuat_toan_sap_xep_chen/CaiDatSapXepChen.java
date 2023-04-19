package ss14.bai_tap.cai_dat_thuat_toan_sap_xep_chen;

import java.util.Arrays;

public class CaiDatSapXepChen {
    public static void main(String[] args) {
        int[] array = {1,5,3,4,6,9,8,3,5};
        insertionSort(array);
    }
    public static void insertionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int flag =array[i];
            int k;
            for (k = i-1; k >=0 && array[k] > flag;k--) {
                array[k+1] = array[k];
            }
            array[k+1] = flag;
        }
        System.out.println(Arrays.toString(array));
    }
}
