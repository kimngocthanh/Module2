package ss6.bai_tap.point2d_point3d;

import java.util.Arrays;

public class Point3d extends Point2d {
    private float z = 0.0f;
    private float[] array = new float[3];

    public Point3d() {

    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
        setXYZ(x, y, z);
    }

    public void setXYZ(float x, float y, float z) {
        array[0] = x;
        array[1] = y;
        array[2] = z;
        this.array = array;

    }

    @Override
    public float[] getArray() {
        return array;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "x=" + getX() + " y=" + getY() + " z=" + z + " array = " + Arrays.toString(array);
    }
}

