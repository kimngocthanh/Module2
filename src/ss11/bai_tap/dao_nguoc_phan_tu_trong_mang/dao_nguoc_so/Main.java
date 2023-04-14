package ss11.bai_tap.dao_nguoc_phan_tu_trong_mang.dao_nguoc_so;

import ss11.bai_tap.dao_nguoc_phan_tu_trong_mang.dao_nguoc_so.PhanTuSoNguyen;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Stack stack1 = new Stack();
        System.out.println("stack:" + stack);
        PhanTuSoNguyen.showPush(stack, 1);
        PhanTuSoNguyen.showPush(stack, 2);
        PhanTuSoNguyen.showPush(stack, 3);
        PhanTuSoNguyen.showPush(stack, 4);
        PhanTuSoNguyen.showPop(stack,stack1);

    }
}
