package ss3.bai_tap;

public class TimMaxTrongMangHaiChieu {
    public static void main(String[] args) {
        int[][] mang = {
                {1, 2, 3},
                {5, 6, 8},
                {9, 2, 3}
        };
        boolean flag = false;
        int max = mang[0][0];
        for (int i = 0; i < mang.length; i++) {
            for (int j = 0; j < mang[i].length; j++) {
                if (mang[i][j] > max) {
                    max = mang[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
