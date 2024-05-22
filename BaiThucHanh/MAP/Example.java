package MAP;
import java.util.Set;
import java.util.LinkedHashMap;

public class Example {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map3 = new LinkedHashMap<>();
        map3.put(1, "Java");
        map3.put(2, "C++");
        map3.put(3, "PHO");
        map3.put(4, "Python");
        System.out.println("Before: ");
        show(map3);
        map3.remove(2);
        System.out.println("After: ");
        show(map3);
    }
    public static void show(LinkedHashMap<Integer, String> map3)
    {
        Set<Integer> key = map3.keySet();
        for(Integer key1 : key)
        {
            System.out.println(key1 +" " + map3.get(key1));
        }
    }
}