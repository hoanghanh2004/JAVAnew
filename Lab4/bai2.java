import java.util.LinkedList;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        LinkedList<Integer> link = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int number, tong = 0, dem = 0;
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Nhap phan tu thu " + i + ": " );
            number = sc.nextInt();
            link.add(number);}
        sc.close();
        for(int i = 0; i < link.size(); i++)
        {
            if (link.get(i) %2 == 0) {
                dem++;
                tong = tong + link.get(i);
            }
        }
        int tbc = tong/dem;
        System.out.println("Trung binh cong = "+ tbc);

        sc.close();
    }
}