package ss19.bai_tap.validate_ten_lop_hoc;

import java.util.Scanner;

public class ValidateClassesTest {
    public static void main(String[] args) {
        ValidateClasses validateClasses = new ValidateClasses();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập lớp cần kiểm tra: ");
        String classes = scanner.nextLine();
        boolean isClasses = validateClasses.validateClass(classes);
        System.out.println(isClasses);
    }
}
