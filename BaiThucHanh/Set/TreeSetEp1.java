package Set;
import java.util.TreeSet;
import java.util.Scanner;

public class TreeSetEp1 {
    public static void main(String[] args) {
        int num;
        TreeSet<Integer> tree = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        tree.add(0);
        tree.add(3);
        tree.add(1);
        tree.add(4);
        tree.add(2);
        tree.add(8);
        System.out.println("Cac phan tu: ");
        System.out.println(tree);
        System.out.println("Nhap phan tu can them ");
        num = sc.nextInt();
        sc.close();
        if(tree.contains(num))
        {
            System.out.println("Phan tu "+ num + " da ton tai");
        }
        else
        {
            tree.add(num);
            System.out.println("Them thanh cong");
            System.out.println("Cac phan tu trong tree sau khi them");
            System.out.println(tree);}

    }
}