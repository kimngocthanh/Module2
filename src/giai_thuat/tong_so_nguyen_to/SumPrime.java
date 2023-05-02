package giai_thuat.tong_so_nguyen_to;

import java.util.Scanner;

public class SumPrime {
    public boolean checkPrime(int prime){
        if(prime<1){
            return false;
        }
        else if(prime==2){
            return true;
        }else {
            for (int i = 2; i < prime; i++) {
                if(prime%i==0){
                    return false;
                }
            }
        }return true;
    }
    public static void main(String[] args) {
        SumPrime sumPrime = new SumPrime();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số lượng số nguyên tố muốn in");
        int number = Integer.parseInt(scanner.nextLine());
        int cout =0;
        int sum = 0;
        int prime = 2;
        do{
            if(sumPrime.checkPrime(prime)){
                sum+= prime;
                cout++;
            }
            prime++;
        }while (cout<number);
        System.out.println(sum);
    }
}
