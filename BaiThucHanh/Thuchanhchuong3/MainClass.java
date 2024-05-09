package Thuchanhchuong3;

public class MainClass {
    public static void main(String[] args) {
        NhanVienFullTime sep = new NhanVienFullTime("Tran Van Sep");
        sep.setloaiChucVu(Configs.NHAN_VIEN_SEP);
        NhanVienFullTime linh1 = new NhanVienFullTime("Nguyen Van Linh");
        NhanVienFullTime linh2 = new NhanVienFullTime("Le thi Linh",3);
        NhanVienPartTime thoivu = new NhanVienPartTime("Phan Thi Thoi Vu",240);
        sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        thoivu.tinhLuong();
        sep.xuatThongTin();
        linh1.xuatThongTin();
        linh2.xuatThongTin();
        thoivu.xuatThongTin();
    }
}
