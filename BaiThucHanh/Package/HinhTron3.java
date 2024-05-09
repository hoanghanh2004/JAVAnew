package Package;

public class HinhTron3 {
    protected final float PI = 3.14f;
    protected float banKinh;

    public HinhTron3(float banKinh)
    {this.banKinh = banKinh;}
    protected float tinhChuVI(){
        return 2*PI*banKinh;
    }
    protected float tinhDienTicH()
    {
        return PI*banKinh*banKinh;
    }
}