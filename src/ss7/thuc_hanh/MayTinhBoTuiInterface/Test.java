package ss7.thuc_hanh.MayTinhBoTuiInterface;

public class Test {
    public static void main(String[] args) {
        System.out.println("test :");
        MayTinhCasioFx500 mayTinhCasioFx500= new MayTinhCasioFx500();
        System.out.println(mayTinhCasioFx500.congHaiSo(5,3));
        System.out.println(mayTinhCasioFx500.truHaiSo(5,3));
        System.out.println(mayTinhCasioFx500.nhanHaiSo(5,3));
        System.out.println(mayTinhCasioFx500.chiaHaiSo(5,3));

        System.out.println("sắp xếp");
        double[] arr = {1,2,3,4,2,1,2,6,2,7,3};
        double[] ar2 = {4,5,2,6,8,6,3,3,4,5,4};
        SapXepChen sapXepChen = new SapXepChen();
        SapXepChon sapXepChon = new SapXepChon();
        sapXepChen.sapXepTang(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        sapXepChon.sapXepTang(ar2);
        for (int i = 0; i < ar2.length; i++) {
            System.out.print(ar2[i]);
        }

        PhanMemMayTinh phanMemMayTinh = new PhanMemMayTinh();
        System.out.println(phanMemMayTinh.congHaiSo(3,5));
        System.out.println(phanMemMayTinh.truHaiSo(3,5));
        System.out.println(phanMemMayTinh.chiaHaiSo(3,5));
        System.out.println(phanMemMayTinh.nhanHaiSo(3,5));
        double[] arr3 = {2,3,4,5,2,1,4,5};
        phanMemMayTinh.sapGiamTang(arr3);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
        }
    }
}
