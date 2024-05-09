package ArrayListClass;

import java.util.ArrayList;
import java.util.Scanner;
public class Max {
    public static void main(String[] args) {
        ArrayList<Integer> arrInt = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Nhap so phan tu cua ArrInt: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            System.out.println("Nhap phan tu thu " + i + ": " );
            number = sc.nextInt();
            arrInt.add(number);
        }
        sc.close();
        int max = arrInt.get(0);
        for(int ii = 1; ii< arrInt.size();ii++)
        {
            if(arrInt.get(ii).compareTo(max) > 0)
                max = arrInt.get(ii);
        }
        System.out.println("Phan tu lon nhat trong arrInt = " + max);
    }
}