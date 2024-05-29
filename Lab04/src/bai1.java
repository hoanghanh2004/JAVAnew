import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        ArrayList <Integer> num = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        for (int i = 0; i<n; i++){
            System.out.print("Nhap phan tu thu "+i+": ");
            number = sc.nextInt();
            num.add(number);
        }

        int max = num.get(0);
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i).compareTo(max)>0) {
                max = num.get(i);
            }
        }
        System.out.print("Phan tu lon nhat trong mang la: "+max+"\n");

        System.out.print("Nhap vao mot so nguyen de xoa khoi danh sach: ");
        int xoa = sc.nextInt();
        num.removeIf(soxoa -> soxoa == xoa);
        System.out.println("Danh sach sau khi xoa cac phan tu co gia tri bang " + xoa + ": " + num);

        Collections.sort(num);
        System.out.println("Day so sau khi sap xep: "+num);

        sc.close();
    }
}
