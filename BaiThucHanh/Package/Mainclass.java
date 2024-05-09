package Package;
public class Mainclass {
        public static void main(String[] args) {
            HinhTron ht = new HinhTron();
            ht.nhapBK();
            ht.tinhChuVi();
            ht.inChuVi();
            ht.tinhDienTich();
            ht.inDienTich();

            HinhChuNhat hcn1 = new HinhChuNhat();
            hcn1.nhapChieuDai();
            hcn1.nhapChieuRong();
            hcn1.tinhChuvi();
            hcn1.tinhDientich();
            hcn1.inChUVi();
            hcn1.inDIenTich();
        }
    }