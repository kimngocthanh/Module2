package ss7.thuc_hanh.MayTinhBoTuiInterface;

public class MayTinhCasioFx500 implements MayTinhBoTuiInterface{


    @Override
    public double congHaiSo(double a, double b) {
        return a+b;
    }

    @Override
    public double truHaiSo(double a, double b) {
        return a-b;
    }

    @Override
    public double nhanHaiSo(double a, double b) {
        return a*b;
    }

    @Override
    public double chiaHaiSo(double a, double b) {
        return a/b;
    }
}
