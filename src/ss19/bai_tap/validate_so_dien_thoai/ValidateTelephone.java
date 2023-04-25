package ss19.bai_tap.validate_so_dien_thoai;

import ss19.bai_tap.validate_ten_lop_hoc.ValidateClasses;

import java.util.regex.Pattern;

public class ValidateTelephone {
    private static final String TELEPHONE_REGEX = "^[0-9]{2}-0[0-9]{9}$";

    public ValidateTelephone(){

    }

    public boolean ValidateTelephone(String regex){
        return Pattern.matches(TELEPHONE_REGEX, regex);
    }
}
