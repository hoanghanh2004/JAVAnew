package getandset;

public class Mainclass {
    public static void main(String[] args) {
        HinhTron hinhTron = new HinhTron();

        hinhTron.setBanKinh(10);

        float chuVi = hinhTron.tinhChuvi();
        float dienTich = hinhTron.tinhDienTich();

        System.out.println("Chu vi hinh tron: " + chuVi + " va dien tich: " + dienTich );
    }
    
}
