package Static;

public class MainClass {
    public static void main(String[] args) {
        ToaDo td = new ToaDo();
        td.x = 10;
        td.y = 20;
        ToaDo td2 = new ToaDo();
        td2.x = 5;
        td2.y = 6;
        ToaDo.thongTin = "Luu toa do cac hinh hoc";
    }
}