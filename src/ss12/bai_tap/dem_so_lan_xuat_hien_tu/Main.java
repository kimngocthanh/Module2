package ss12.bai_tap.dem_so_lan_xuat_hien_tu;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi để kiểm tra");
        String str = scanner.nextLine();
        String[] newArray = str.split(" ");
        for (String s : newArray) {
            String str1 = s.toLowerCase(Locale.ROOT);
            if (map.containsKey(str1)) {
                map.put(str1, map.get(str1) + 1);
            } else {
                map.put(str1, 1);
            }
        }
        System.out.println(map);

    }
}
