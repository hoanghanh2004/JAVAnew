public class Slide55 {
    public static void main(String[] args) {
        String StrKQ =" ";
        System.out.print("Cac so chia het cho 5 la ");
        for( int i = 0; i <=20; i++)
            if( i%5==0)
                StrKQ = StrKQ + i + " ; ";
                System.out.print(StrKQ.substring(0,StrKQ.length()-2));
    }
}