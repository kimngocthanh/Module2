package ss11.bai_tap.kiem_tra_chuoi_su_dung_queue;

import java.util.*;

public class KiemTraChuoiQueue {
    public static void main(String[] args) {
        String str1 = "abc cba";
        String str = str1.toLowerCase(Locale.ROOT);
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        String[] arrStr = str.split(" ");
        System.out.println(Arrays.toString(arrStr));
        for (String s : arrStr) {
            stack.push(s);
            queue.add(s);
        }
        boolean flag = true;
        for (String a : arrStr) {
            if (stack.pop().equals(queue.remove())) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("palindrome");
        } else {
            System.out.println("no palindrome");
        }

    }
}
