package Lab4;
import java.util.ArrayList;
import java.util.Scanner;
public class Baio11 {
    public static void main(String[] args) {
        ArrayList<Integer> arrInt = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Nhap so phan tu : ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            System.out.print("Nhap phan tu thu " + i + ": " );
            number = sc.nextInt();
            arrInt.add(number);
        }
        int max = arrInt.get(0);
        for(int i = 1; i< arrInt.size() ; i++)
        {
            if(arrInt.get(i).compareTo(max) > 0)
                max = arrInt.get(i);
        }
        System.out.println("Phan tu lon nhat trong day so nguyen la : " + max);

        System.out.print("Nhap so nguyen can xoa: ");
        int socanxoa = sc.nextInt();
        deleteNumberFromList(arrInt, socanxoa);
        System.out.println("Day so sao khi xoa: " + arrInt);

        sortNumberList(arrInt);
        System.out.println("Day so sau khi sap xep: " + arrInt);
        }
  
        private static void deleteNumberFromList(ArrayList<Integer> numbers, int numberToDelete) {
        numbers.removeIf(n -> n == numberToDelete);
        }

        private static void sortNumberList(ArrayList<Integer> numbers) {
            numbers.sort((a, b) -> a.compareTo(b));

    }
}
    
