package ss4.bai_tap.stop_watch;

import java.time.LocalTime;
import java.util.Scanner;

public class StopWatch {
    private LocalTime startTime, endTime;

    public StopWatch(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public int getElapsedTime() {
        int milisecond = ((endTime.getMinute()*60+endTime.getSecond()) - (startTime.getSecond()+startTime.getMinute()*60));
        return milisecond;
    }


}
