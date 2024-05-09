import java.util.Scanner;

public class Baimot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        double num1 = scanner.nextDouble();

        System.out.print("Nhap so thu hai: ");
        double num2 = scanner.nextDouble();
        
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        double remainder = num1 % num2;
        System.out.println("Tong: " + sum);
        System.out.println("Hieu: " + difference);
        System.out.println("Tich: " + product);
        System.out.println("Thuong: " + quotient);
        System.out.println("Chia lay du: " + remainder);

        if (num1 == num2) {
            System.out.println("Hai so bang nhau.");
        } else if (num1 > num2) {
            System.out.println("So thu nhat lon hon so thu hai.");
        } else {
            System.out.println("So thu nhat nho hon so thu hai.");
        }
    }
}

