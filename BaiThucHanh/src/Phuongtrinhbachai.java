import java.util.Scanner;

public class Phuongtrinhbachai {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2, x;
        Scanner sc= new Scanner (System.in);
        System.out.print("Nhap he so a: ");
        a = sc.nextDouble();
        System.out.print("Nhap he so b: ");
        b = sc.nextDouble();
        System.out.print("Nhap he so c: ");
        c = sc.nextDouble();
        delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println(" Phuong trinh vo nghiem!");
        } else if (delta == 0) {
            x = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep: x = " + x);
        } else {
             x1 = (-b + Math.sqrt(delta)) / (2 * a);
             x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co hai nghiem phan biet:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }



}
