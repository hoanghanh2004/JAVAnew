import java.util.Scanner;
public class Slide30 {
    public static void main(String[] args) {
        int n, SoDu, Tong=0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap vao so nguyen duong bat ki:");
        n = scanner.nextInt();
        while(n>0){
            SoDu = n%10;
            n=n/10;
            Tong += SoDu;
        }
        System.out.println( " Tong cac chu so:" + Tong);
    }
}
