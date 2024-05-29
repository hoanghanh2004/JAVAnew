package BaiThucHanh.chuong05;
import java.io.IOException;

public class TestThrow3 {
    void m() throws IOException {
        throw new IOException("Loi thiet bi"); // checked exception
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("ngoai le duoc xu ly");
        }


    public static void main(String args[]) {
        TestThrow1 obj = new TestThrow1();
        obj.p();
        System.out.println("luong binh thuong");
    }
}
