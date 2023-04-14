package ss11.bai_tap.dao_nguoc_phan_tu_trong_mang.dao_nguoc_chuoi;

import java.util.Stack;

public class PhanTuChuoi {
    public static void showPush(Stack<String> stack, String a) {
        stack.push(a);
        System.out.println("stack:" + stack);
    }

    public static void showPop(Stack<String> stack, Stack<String> stack1) {
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            String a = stack.pop();
            stack1.push(a);
        }
        System.out.println(stack1);
    }
}
