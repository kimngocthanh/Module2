package ss4.bai_tap.fan;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    public int speed = 1;
    public boolean on = false;
    public double radius = 5;
    public String color = "blue";

    public final int getSlow() {
        return SLOW;
    }

    public final int getMedium() {
        return MEDIUM;
    }

    public final int getFast() {
        return FAST;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean getOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }


    public String toString() {
        if (this.on) {
            return this.color + " " + this.radius + " fan is off";
        }
        return this.speed + " " + this.color + " " + this.radius + " fan is on";
    }


}
