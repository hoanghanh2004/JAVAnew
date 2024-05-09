package Thuchanhchuong3;

public class NhanVien {
    protected String ten;
    protected long luong;
    public NhanVien(){

    }
    public NhanVien(String ten)
    {
        this.ten = ten;
    }
    protected String loaiNhanVien()
    {
        return " ";
    }
    public void xuatThongTin()
    {
        System.out.println("===== Nhan vien: " + ten + " =====");
        System.out.println("- Loai chuc vu: " + loaiNhanVien());
        System.out.println("-Luong "+ luong + " VND");
    }
}
