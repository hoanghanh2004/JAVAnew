package Lab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap day so nguyen: ");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        for (String part : parts) {
            numbers.add(Integer.parseInt(part));
        }

        // Tìm số nguyên có giá trị lớn nhất
        int maxNumber = findMaxNumber(numbers);
        System.out.println("So nguyen lon nhat: " + maxNumber);

        // Xoá các phần tử có giá trị bằng số nguyên vừa nhập
        int numberToDelete = getNumberToDelete(scanner);
        deleteNumberFromList(numbers, numberToDelete);
        System.out.println("Day so sau khi xoa: " + numbers);

        // Sắp xếp dãy số và in dãy số ra màn hình
        sortNumberList(numbers);
        System.out.println("Day so sau khi sap xep: " + numbers);
    }

    // Tìm số nguyên có giá trị lớn nhất trong danh sách
    private static int findMaxNumber(ArrayList<Integer> numbers) {
        return Collections.max(numbers);
    }

    // Nhập số nguyên cần xoá từ người dùng
    private static int getNumberToDelete(Scanner scanner) {
        System.out.print("Nhap so nguyen can xoa: ");
        return scanner.nextInt();
    }

    // Xoá các phần tử có giá trị bằng số nguyên vừa nhập
    private static void deleteNumberFromList(ArrayList<Integer> numbers, int numberToDelete) {
        numbers.removeIf(n -> n == numberToDelete);
    }

    // Sắp xếp dãy số
    private static void sortNumberList(ArrayList<Integer> numbers) {
        Collections.sort(numbers);
    }
}