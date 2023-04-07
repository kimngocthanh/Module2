package ss6.bai_tap.point2d_point3d;


import java.util.Arrays;


public class Point2d {
    private float x = 0.0f;
    private float y = 0.0f;
    private float[] array = new float[2];

    public Point2d() {

    }

    public Point2d(float x, float y) {
        this.x = x;
        this.y = y;
        setXY(x, y);
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        array[0] = getX();
        array[1] = getY();
        this.x = x;
        this.y = y;
    }

    public float[] getArray() {
        return array;
    }

    @Override
    public String toString() {
        return "Point2d{" +
                "x=" + x +
                ", y=" + y +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
