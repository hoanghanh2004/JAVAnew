package lopperson;

import java.util.Scanner;

class Person {
    String ten;
    int tuoi;

    public Person(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        ten = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = scanner.nextInt();

        scanner.close();
    }

    public void hienThiThongTin() {
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
    }
}
