import java.util.Scanner;

public class person01 {
    public String ten;
    public int tuoi;
    public String diachi;
    public void nhapThongtin()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhap ten: ");
        ten = scanner.nextLine();
        System.out.print(" Nhap dia chi: ");
        diachi = scanner.nextLine();
        System.out.print(" Nhap tuoi: ");
        tuoi = scanner.nextInt();

    }
    public void xuatThongtin()
    {
        System.out.println("ten: " + ten);
        System.out.println("diachi: " + diachi);
        System.out.println("tuoi: " + tuoi);
    }
    public person ()
    {
    this.ten = " Hoang";
    this.diachi = " 123 Co Nhue ";
    this.tuoi = 20;
    }
    public void nhapThongtin( String hoten, int tuoitac, String diachinha)
    {
        ten = hoten;
        tuoi = tuoitac;
        diachi = diachinha;
    }


}