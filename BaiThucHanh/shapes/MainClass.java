package shapes;

public class MainClass {
    public static void main(String[] args) {
 
        HinhTron hinhTron = new HinhTron();
        hinhTron.inTen();
        hinhTron.nhapBanKinh();
        hinhTron.tinhChuVi();
        hinhTron.tinhDienTich();
        hinhTron.inChuVi();
        hinhTron.inDienTich();

        HinhTru hinhTru = new HinhTru();
        hinhTru.inTen();
        hinhTru.nhapChieuCao();
        hinhTru.tinhTheTich();
        hinhTru.intheTich();
        

        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.inTen();
        hinhChuNhat.nhapChieuDai();
        hinhChuNhat.nhapChieuRong();
        hinhChuNhat.tinhChuVi();
        hinhChuNhat.tinhDienTich();
        hinhChuNhat.inChuVi();
        hinhChuNhat.inDienTich();
    

        HinhVuong hinhVuong = new HinhVuong();
        hinhVuong.inTen();
        hinhVuong.nhapCanh();
        hinhVuong.tinhChuVi();
        hinhVuong.tinhDienTich();
        hinhVuong.inChuVi();
        hinhVuong.inDienTich();
    }
}
