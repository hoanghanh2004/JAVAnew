import java.util.HashSet;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String traicay, traicay1, tim_traicay;

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Trai cay: ");
            traicay = sc.nextLine();
            if( traicay == "")
                break;
            set.add(traicay);
        }

        System.out.println(set);
        System.out.print("Nhap loai trai cay can tim kiem: ");
        tim_traicay = sc.nextLine();
        if(set.contains(tim_traicay))
            System.out.println("->Tim thay!");
        else
            System.out.println("->Khong tim thay!");
        
        System.out.print("Nhap loai trai cay can xoa: ");
        String xoa = sc.nextLine();
        if(set.remove(xoa))
            System.out.println("*Da xoa!*");
        else
            System.out.println("*Khong co trai cay nay*");

        System.out.println("Phan tu con lai:");
        System.out.println(set);

        sc.close();
    }
}