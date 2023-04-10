package ss7.thuc_hanh.MayTinhBoTuiInterface;

public class PhanMemMayTinh implements MayTinhBoTuiInterface, SapXepInterface{
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

    @Override
    public void sapXepTang(double[] arr) {
        int n = arr.length;
        int i, j;
        double key;
        for (i = 0; i < n; i++) {
            key = arr[i];
            j = i - 1;

            while (j > 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    @Override
    public void sapGiamTang(double[] arr) {
        int n = arr.length;
        int i ,j , min_idx;
        for(i=0; i<n; i++){
            min_idx = i;
            for (j = i+1;j<n;j++){
                if(arr[j]>arr[min_idx]){
                    min_idx = j;
                }
                double temp = arr[min_idx];
                arr[min_idx]= arr[i];
                arr[i]=temp;
            }
        }
    }
}
