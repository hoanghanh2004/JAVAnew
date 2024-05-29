import java.util.ArrayList;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        int i=0, dem = 0, n;
        Scanner sc = new Scanner(System.in);
        ArrayList<sinhvien> svien = new ArrayList<>();
        System.out.print("Nhap n: ");
        n =sc.nextInt();

        for(int a = 0; a < n; a++){
            sinhvien sv1 = new sinhvien();
            sv1.nhapTen();
            sv1.nhapDiem();
            svien.add(sv1);
        }

        while (true) {
            sinhvien sv = new sinhvien();
            sv.nhapTen();
            if(sv.ten == "")
                break;
            sv.nhapDiem();
            svien.add(i, sv);
            i=i+1;
        }

        for( int c = 0;c < svien.size(); c++){   
            if(svien.get(c).diem <= 5)
            dem = dem +1;
        }

        System.out.println("So sinh vien thi lai la " + dem);
        System.out.println("Nhung sinh vien thi lai");

        for( int b = 0;b < svien.size(); b++){   
            if(svien.get(b).diem <= 5)
            svien.get(b).InThongTin();
        }

        int max = 0;

        for(int d=1; d<svien.size(); d++){   
            if(svien.get(max).diem < svien.get(d).diem)
            max = d;
            if(svien.get(max).diem == svien.get(d).diem)
            svien.get(d).InThongTin();
        }

        svien.get(max).InThongTin();        
        sc.nextLine();
        System.out.print("nhap gia tri can tim: ");
        String name  = sc.nextLine();

        for(int f = 0; f < svien.size(); f++ ){   
            if(svien.get(f).ten.equals(name))
            svien.get(f).InThongTin();
        }

        sc.close();
    }
}