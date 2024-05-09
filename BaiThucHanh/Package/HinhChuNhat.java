package Package;

import java.util.Scanner;

public class HinhChuNhat {
    float dai;
    float rong;
    float cv;
    float dt;
    public void nhapChieuDai()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap vao chieu dai hinh chu nhat: ");
        dai = sc.nextFloat();

    }
    public void nhapChieuRong()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap vao chieu dai hinh chu nhat: ");
        rong = sc.nextFloat();
        sc.close();
    }
    public void tinhChuvi()
    {
        cv = 2*(dai+rong);
    }
    public void tinhDientich()
    {
        dt = dai*rong;
    }
    public void inChUVi()
    {
        System.out.println("Chu vi hinh chu nhat: " + cv);
    }
    public void inDIenTich()
    {
        System.out.println("Dien tich hinh chu nhat: " + dt);
    }
}