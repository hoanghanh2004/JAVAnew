import java.util.Scanner;

public class HinhTron001 {
    public float banKinh;
    public float chuVi;
    public float dienTich;
    public final float Pi = 3.14f;

    public void nhapBanKinh() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ban kinh (R): ");
        banKinh = scanner.nextFloat();
    }

    public void tinhChuVi() {
        chuVi = 2 * Pi * banKinh;
    }

    public void tinhDienTich() {
        dienTich = Pi * banKinh * banKinh;
    }

    public void hienThiChuVi() {
        System.out.println("Chu vi hinh tron la: " + chuVi);
    }

    public void hienThiDienTich() {
        System.out.println("Dien tich hinh tron la: " + dienTich);
    }

    public static void main(String[] args) {
        HinhTron hinhTron = new HinhTron();
        hinhTron.nhapBanKinh();
        hinhTron.tinhChuVi();
        hinhTron.tinhDienTich();
        hinhTron.hienThiChuVi();
        hinhTron.hienThiDienTich();
    }
}
