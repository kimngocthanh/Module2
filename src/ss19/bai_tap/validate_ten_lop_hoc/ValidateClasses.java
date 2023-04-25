package ss19.bai_tap.validate_ten_lop_hoc;

import java.util.regex.Pattern;

public class ValidateClasses {
    private static  final String CLASSES_REGEX = "^[ACP][0-9]{4}[GHIK]$";

    public ValidateClasses(){

    }

    public boolean validateClass(String regex){
        return Pattern.matches(CLASSES_REGEX,regex);
    }

}
