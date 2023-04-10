package ss7.thuc_hanh.MayTinhBoTuiInterface;

public class SapXepChon implements SapXepInterface{
    @Override
    public void sapXepTang(double[] arr) {
        int n = arr.length;
        int i ,j , min_idx;
        for(i=0; i<n; i++){
            min_idx = i;
            for (j = i+1;j<n;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx = j;
                }
                double temp = arr[min_idx];
                arr[min_idx]= arr[i];
                arr[i]=temp;
            }
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
