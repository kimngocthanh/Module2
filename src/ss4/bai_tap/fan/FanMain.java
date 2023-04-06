package ss4.bai_tap.fan;

public class FanMain {
    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.SLOW, false, 5, "red");
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }

}
