import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, SinhVienn> map1 = new HashMap<>();
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i<n; i++){
            SinhVienn sv = new SinhVienn();
            sv.nhapMSV();
            sv.nhapHoTen();
            sv.nhapLop();
            map1.put(sv.msv, sv);
        }

        System.out.print("Nhap lop can tim: ");
        String lop = sc.nextLine();
        System.out.println("Nhung sinh vien tron lop " + lop + ": ");
        boolean timLop = false;
        for (Map.Entry<Integer, SinhVienn> entry : map1.entrySet()) {
            if (entry.getValue().lop.equals(lop)) {
                System.out.println("Ho va ten: " + entry.getValue().hoten);
                System.out.println("----------------------");
                timLop = true;
            }
        }
        if (!timLop) {
            System.out.println("Khong tim thay lop do!");
        }

        System.out.print("Nhap ma sinh vien can tim: ");
        int maSv = Integer.parseInt(sc.nextLine());
        boolean timMaSV = false;
        for (Map.Entry<Integer, SinhVienn> entry : map1.entrySet()) {
            if (entry.getKey() == maSv) {
                System.out.println("Ho va ten: " + entry.getValue().hoten);
                System.out.println("Lop: " + entry.getValue().lop);
                timMaSV = true;
                break;
            }
        }
        if (!timMaSV) {
            System.out.println("Khong tim thay ma sinh vien do!");
        }

        sc.close();
    }
}