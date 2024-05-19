package Set;
import java.util.HashSet;
import java.util.Scanner;
public class HashRemove {
    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hash.add("Wilson");
        hash.add("Nike");
        hash.add("Volvo");
        hash.add("Kia");
        hash.add("Lenovo");
        hash.add("Lenovo");
        System.out.println("Cac phan tu trong hash");
        System.out.println(hash);
        System.out.println("Nhap phan tu can xoa");
        String name = sc.nextLine();
        sc.close();
        if(hash.contains(name))
        {
            hash.remove(name);
            System.out.println("Xoa thanh cong");
            System.out.println("Cac phan tu trong hash sau khi xoa");
            System.out.println(hash);
        }
        else
            System.out.println("Xoa khong thanh cong");
    } 
}
