import java.util.Scanner;

public class Baihai {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print(" Nhap so can kiem tra:");
     double x = sc.nextDouble();
     if (x%2==0){
     System.out.print(x+ " la so chan");
     }
     else {
     System.out.print(x+" la so le");
     }
    }
    
}
