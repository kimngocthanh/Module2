package ss19.bai_tap.validate_so_dien_thoai;

import java.util.Scanner;

public class ValidateTelephoneTest {
    public static void main(String[] args) {
        ValidateTelephone validateTelephone = new ValidateTelephone();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số điện thoại");
        String telephoneNumber = scanner.nextLine();
        System.out.println(validateTelephone.ValidateTelephone(telephoneNumber));
    }
}
