package Set;
import java.util.HashSet;
import java.util.Scanner;
public class HashAdd {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hash.add(0);
        hash.add(3);
        hash.add(1);
        hash.add(4);
        hash.add(2);
        hash.add(8);
        System.out.println("Cac phan tu trong hash: ");
        System.out.println(hash);
        System.out.println("Nhap phan tu can them:");
        int num = sc.nextInt();
        sc.close();
        if(hash.contains(num))
        {
            System.out.println("Phan tu "+ num + " da ton tai");
        }
        else
        {
            hash.add(num);
            System.out.println("Them thanh cong");
            System.out.println("Cac phan tu trong hash sau khi them");
            System.out.println(hash);}
    } 
}