package case_study.validate;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class EmployeeValidate {
    private static final String REGEX_ID_EMPLOYEE = "^NV-[0-9]{4}$";
    private static final String REGEX_NAME_EMPLOYEE = "^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$";
    private static final String REGEX_OLD_EMPLOYEE = "^[0-9]{4}-[0-9]{2}-[0-9]{2}$";
    private static final String REGEX_CMND_EMPLOYEE = "^([0-9]{12}|[0-9]{9})$";
    private static final String REGEX_TELEPHONE_EMPOLYEE = "^0[0-9]{9}$";

    public static boolean checkidEmployee(String idEmpoyee) {
        return idEmpoyee.matches(REGEX_ID_EMPLOYEE) ? true : false;
    }

    public static boolean checkOld(String old) {
        if(old.matches(REGEX_OLD_EMPLOYEE)){
            LocalDate dob = LocalDate.parse(old);
            LocalDate curDate = LocalDate.now();
            return Period.between(dob, curDate).getYears() >= 18;
        }return false;

    }

    public static boolean checkNameEmployee(String nameEmployee) {
        return nameEmployee.matches(REGEX_NAME_EMPLOYEE) ? true : false;
    }

    public static boolean checkCmndEmployee(String cmndEmployee) {
        return cmndEmployee.matches(REGEX_CMND_EMPLOYEE) ? true : false;
    }

    public static boolean checkTelephoneEmployee(String telephoneEmployee) {
        return telephoneEmployee.matches(REGEX_TELEPHONE_EMPOLYEE) ? true : false;
    }
}
