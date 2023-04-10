package ss5.bai_tap.xay_dung_lop_chi_ghi_trong_java;

public class TestStudents {
    public static void main(String[] args) {
        Student students = new Student();
        students.setName("kim ngọc thành");
        students.setClasses("C0223G1");
        System.out.println(students.toString());
        Student students1 = new Student();
        System.out.println(students1.toString());
    }
}
