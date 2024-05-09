import java.util.Scanner;
public class Slide47 {
  public static void main(String[] args) {
    int number, sum = 0;
    Scanner scanner = new Scanner(System.in);      
    do {
     System.out.print("Nhap vao so nguyen bat ki: ");
       number = scanner.nextInt();
       sum += number;
   } while (sum < 100); 
     System.out.print ("Tong cac so nguyen vua nhap = "+sum);
    } 
}
