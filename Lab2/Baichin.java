import java.util.Scanner;
public class Baichin {
    public static void main(String[] args) {
        String chuoi;
        int demInHoa = 0, demThuong = 0, demSo = 0, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi bat ky: ");
        chuoi = sc.nextLine();
        sc.close();
        for (i = 0; i < chuoi.length(); i++) {
            char kytu = chuoi.charAt(i);
            int asciiValue = (int) kytu;
            if (asciiValue >= 48 && asciiValue <= 57)
                demSo = demSo + 1;
            else if (asciiValue >= 65 && asciiValue <= 90)
                demInHoa = demInHoa + 1;
            else if (asciiValue >= 97 && asciiValue <= 122)
                demThuong = demThuong + 1;
            System.out.println(kytu);
        }
        System.out.println("So ky tu so la " + demSo);
        System.out.println("So ky tu in hoa la " + demInHoa);
        System.out.println("So ky tu thuong la " + demThuong);
    }
}