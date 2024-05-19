package Linkedlist;
import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        LinkedList<String> listt = new LinkedList<>();
        listt.add("Java");
        listt.add("C++");
        listt.add("PHP");
        listt.add("Java");
        System.out.println("Vi du su dung phuong thuc addAll() ");
        System.out.println("-----------------------------------");
        LinkedList<String> listA = new LinkedList<>();
        listA.addAll(listt);
        System.out.println("listA");
        showList(listA);
        System.out.println("\nvi du su dung phuong thuc retainAll()");
        System.out.println("---------------------------------------");
        LinkedList<String> listB = new LinkedList<>();
        listA.retainAll(listB);
        System.out.println("List A:");
        showList(listA);

        System.out.println("\nvi du su dung phuong thuc removeAll()");
        System.out.println("---------------------------------------");
        listt.removeAll(listB);
        System.out.println("list: ");
        showList(listt);
    }
    public static void showList(LinkedList<String> list)
    {
        for( String obj : list)
        {
            System.out.println("\t" +obj + ",");
        }
        System.out.println();
    }
}