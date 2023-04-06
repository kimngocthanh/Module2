package ss4.bai_tap.stop_watch;

import java.time.LocalTime;
import java.util.Scanner;

public class StopWatchMain {
    public static void main(String[] args) {
        LocalTime start = LocalTime.now();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập năm muốn kiểm tra :");
        int month = scanner.nextInt();
        if ((month % 4 == 0 && month % 100 != 0) || (month % 400 == 0)) {
            System.out.println(month + " là năm nhuận");
        } else {
            System.out.println(month + " ko là năm nhuận");
        }
        LocalTime end = LocalTime.now();
        StopWatch stopWatch = new StopWatch(start, end);
        System.out.println("Time: " + stopWatch.getElapsedTime() + "s");

    }
}
