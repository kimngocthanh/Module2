package ss11.bai_tap.dao_nguoc_phan_tu_trong_mang.dao_nguoc_so;

import java.util.Stack;

public class PhanTuSoNguyen {
    public static void showPush(Stack<Integer> stack, int a) {
        stack.push(a);
        System.out.println("stack:" + stack);
    }

    public static void showPop(Stack<Integer> stack, Stack<Integer> stack1) {
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            int a = stack.pop();
            stack1.push(a);
        }
        System.out.println(stack1);
    }


}
