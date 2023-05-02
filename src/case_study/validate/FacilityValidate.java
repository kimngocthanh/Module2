package case_study.validate;

import java.util.regex.Pattern;

public class FacilityValidate {
    private static final String REGEX_IDHOUSE_VALIDATE = "HO-[0-9]{4}$";
    private static final String REGEX_IDVILLA_VALIDATE = "VI-[0-9]{4}$";
    private static final String REGEX_IDROOM_VALIDATE = "RO-[0-9]{4}$";
    private static final String REGEX_NAME_VALIDATE = "^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$";

    public static boolean checkIdHouse(String idHouse) {
        return idHouse.matches(REGEX_IDHOUSE_VALIDATE) ? true : false;
    }



    public static boolean checkIdVilla(String idVilla) {
        return idVilla.matches(REGEX_IDVILLA_VALIDATE) ? true : false;
    }

    public static boolean checkIdRoom(String idRoom) {
        return idRoom.matches(REGEX_IDROOM_VALIDATE) ? true : false;
    }

    public static boolean checkName(String name) {
        return name.matches(REGEX_NAME_VALIDATE) ? true : false;
    }
}
