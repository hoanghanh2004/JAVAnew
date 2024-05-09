package getandset;

class HinhTron {
    private final float PI = 3.14f;
    private float banKinh;

    public float grtBanKinh(){
        return banKinh;
    }

    public void setBanKinh(float banKinh){
        this.banKinh = banKinh;
    }

    public float tinhChuvi(){
        return 2 * PI *banKinh;
    }

    public float tinhDienTich(){
        return PI * banKinh * banKinh;
    }
}
