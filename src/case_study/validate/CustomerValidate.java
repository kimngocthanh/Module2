package case_study.validate;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidate {
    private static final String REGEX_ID_CUSTOMER = "^KH-[0-9]{4}$";
    private static final String REGEX_NAME_CUSTOMER = "^^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$$";
    private static final String REGEX_OLD_CUSTOMER = "^[0-9]{4}-[0-9]{2}-[0-9]{2}$";
    private static final String REGEX_CMND_CUSTOMER = "^([0-9]{12}|[0-9]{9})$";
    private static final String REGEX_TELEPHONE_CUSTOMER = "^0[0-9]{9}$";

    public static boolean checkidCustomer(String idCustomer) {
        return idCustomer.matches(REGEX_ID_CUSTOMER) ? true : false;
    }

    public static boolean checkNameCustomer(String nameCustomer) {
        return nameCustomer.matches(REGEX_NAME_CUSTOMER) ? true : false;
    }

    public static boolean checkOld(String old) {
        if (old.matches(REGEX_OLD_CUSTOMER)) {
            LocalDate dob = LocalDate.parse(old);
            LocalDate curDate = LocalDate.now();
            return Period.between(dob, curDate).getYears() >= 18;
        }
        return false;
    }

    public static boolean checkCmndCustomer(String cmndCustomer) {
        return cmndCustomer.matches(REGEX_CMND_CUSTOMER) ? true : false;
    }

    public static boolean checkTelephoneCustomer(String telephoneCustomer) {
        return telephoneCustomer.matches(REGEX_TELEPHONE_CUSTOMER) ? true : false;
    }
}


