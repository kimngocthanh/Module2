package ss5.bai_tap.xay_dung_lop_chi_ghi_trong_java;

public class Students {
    private String name = "john";
    private String classes = "C02";

    public Students() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getClasses() {
        return classes;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", classes='" + classes + '\'';
    }
}
