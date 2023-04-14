package ss11.bai_tap.kiem_tra_dau_ngoac;

import java.util.Arrays;
import java.util.Stack;

public class KiemTraDauNgoac {
    public static void main(String[] args) {
        String str = "s*(s–a)*(s–b))*(s–c)";
        Stack<String> lStack = new Stack<>();
        String[] arrStr = str.split("");
        System.out.println(Arrays.toString(arrStr));
        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i].equals("(")) {
                lStack.push(arrStr[i]);
            }
            else if( arrStr[i].equals(")")){
                if(lStack.isEmpty()){
                    System.out.println("no");
                }else {
                    lStack.pop();
                }
            }
        }if (lStack.isEmpty()){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
