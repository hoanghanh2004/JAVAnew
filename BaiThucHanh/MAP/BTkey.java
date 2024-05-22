package MAP;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class BTkey {
    public static void main(String[] args) {
    HashMap<String, String> map2 = new HashMap<>();

    map2.put("QNg", "Quang Ngai");
    map2.put("QN", "Quang Nam");
    map2.put("QN","Quang Ninh");
    map2.put("HCM", "Thanh pho Ho Chi Minh");
    System.out.println("Danh sach cac thanh pho trong map2: ");
    Set<Map.Entry<String, String>> setCity = map2.entrySet();
    System.out.println(setCity);
    System.out.println("QNg " + map2.get("QNg"));
    System.out.println("NT: " + map2.get("NT"));
    if(map2.containsKey("Thanh pho Ho Chi Minh"))
        System.out.println("Co thanh pho HCM trong map 2");
    }
}