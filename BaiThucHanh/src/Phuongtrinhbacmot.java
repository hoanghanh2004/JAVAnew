import java.util.Scanner;
public class Phuongtrinhbacmot {
    public static void main(String[] args) {
        double a, b, x;
        Scanner sc= new Scanner (System.in);
        System.out.print("Nhap he so a: ");
        a = sc.nextDouble();
        System.out.print("Nhap he so b: ");
        b = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo");
            }
        } else {
            x = -b / a;
            System.out.println("Nghiem cua phuong trinh la: " + x);
        }
    }
}