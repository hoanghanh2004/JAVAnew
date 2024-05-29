package BaiThucHanh.chuong05;

public class TestThrow1 {
    static void validate(int age){
        if (age<18)
            throw new ArithmeticException("not valid");
        else
            System.out.print("welcome");
    }
    public static void main(String args[]) {
        validate(13);
        System.out.println("rest of the code...");
    }
}
