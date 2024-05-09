package ArrayListClass;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        ArrayList<Float> arrFloat = new ArrayList<>();
        arrFloat.add(0.7f);
        arrFloat.add(7.26f);
        arrFloat.add(1.02f);
        arrFloat.add(9.3f);
        Iterator<Float> it = arrFloat.iterator();
        System.out.println("Cac phan tu co trong arrFloat la: ");
        while (it.hasNext()) {
            System.out.println(it.next()+"\t");
        }
    }
}
