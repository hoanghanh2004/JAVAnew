package ArrayListClass;

import java.util.ArrayList;

public class forcaitien {
    public class TeenClass {
    public static void main(String[] args) {
        ArrayList<String> arrayListString = new ArrayList<>();

    arrayListString.add("JAVA");
    arrayListString.add("PHD");
    arrayListString.add("C#");
    arrayListString.add("C++");

    System.out.println("Cac phan tu co trong arrListString la: ");
    for (int i = 0; i < arrayListString.size(); i++)
    {
        System.out.print(arrayListString.get(i) + "\t");
    }
    }  
}
}
