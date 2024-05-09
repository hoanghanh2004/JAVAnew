package ArrayListClass;

import java.util.ArrayList;
public class forcaitien2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(7);
        arr.add(1);
        arr.add(9);
        System.out.println("Cac phan tu co trong arrList la ");
        for(int number : arr)
        {
            System.out.println(number + "\t");
        }
    }
}