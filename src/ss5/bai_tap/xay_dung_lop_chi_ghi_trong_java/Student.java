package ss5.bai_tap.xay_dung_lop_chi_ghi_trong_java;

public class Student {
    private String name = "john";
    private String classes = "C02";

    public Student() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    
    @Override
    public String toString() {
        return "name='" + name + '\'' + ", classes='" + classes + '\'';
    }
}
