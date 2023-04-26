package case_study.validate;

public class EmployeeValidate {
    private static final String REGEX_ID_EMPLOYEE = "^NV-[0-9]{4}$";
    private static final String REGEX_NAME_EMPLOYEE = "^([A-Z][a-z]+\\s[A-Z][a-z]+)+$";
    private static final String REGEX_CMND_EMPLOYEE = "^([0-9]{12}|[0-9]{9})$";
    private static final String REGEX_TELEPHONE_EMPOLYEE = "^0[0-9]{9}$";
    public static boolean checkidEmployee(String idEmpoyee) {
        return idEmpoyee.matches(REGEX_ID_EMPLOYEE) ? true : false;
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
