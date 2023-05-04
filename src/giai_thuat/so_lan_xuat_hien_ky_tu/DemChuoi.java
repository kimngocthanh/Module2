package giai_thuat.so_lan_xuat_hien_ky_tu;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DemChuoi {
    public static void main(String[] args) {
        String str = "kim ngoc thanh";
        String[] arr=str.split("");
        int cout =0;
        for (int i = 0; i < arr.length; i++) {
            if(!arr[i].equals("")){
                cout=0;
                for (int j = 0; j < arr.length; j++) {
                    if(arr[i].equals(arr[j])){
                        cout++;
                    }
                }
            }
            System.out.println(arr[i]+" "+ cout);
        }

    }
}
