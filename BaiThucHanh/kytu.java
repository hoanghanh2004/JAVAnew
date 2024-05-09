import java.util.Scanner;

public class kytu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi ky tu: ");
        String s = sc.nextLine();
        System.out.print("in ra ky tu thu k = ");
        int k = sc.nextInt();
        System.out.print("ky tu thu "+ k + " la: " +s.charAt(k-1));

    }
    
}
