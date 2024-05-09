package ArrayListClass;

import java.util.ArrayList;
import java.util.ListIterator;
public class listiterator {
    public static void main(String[] args) {
        ArrayList<Character> arrChar = new ArrayList<>();
        arrChar.add('a');
        arrChar.add('e');
        arrChar.add('b');
        arrChar.add('c');
        ListIterator<Character> list = arrChar.listIterator();
        System.out.println("Cac phan tu co trong arrChar la: ");
        while(list.hasNext())
        {
            System.out.println(list.next() + "\t" );
        }
    }
}