package ss11.bai_tap.dao_nguoc_phan_tu_trong_mang.dao_nguoc_chuoi;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Stack stack1 = new Stack();
        System.out.println("stack:" + stack);
        PhanTuChuoi.showPush(stack, "a");
        PhanTuChuoi.showPush(stack, "b");
        PhanTuChuoi.showPush(stack, "c");
        PhanTuChuoi.showPush(stack, "d");
        PhanTuChuoi.showPop(stack,stack1);

    }
}
