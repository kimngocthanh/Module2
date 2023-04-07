package ss6.bai_tap.point_moveablepoint;

import java.util.Arrays;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;
    private float[] array = new float[2];

    public Point() {

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
        setXY(x, y);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        array[0] = x;
        array[1] = y;
        this.array = array;
    }

    public float[] getArray() {
        return array;
    }

    @Override
    public String toString() {
        return "x= " + x + ", y= " + y + "array =" + Arrays.toString(array);
    }
}
