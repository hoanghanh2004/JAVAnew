package Static;

public class Configs {
    public static final int So_Luong_Hinh_Toi_Thieu =0;
    public static final int So_Luong_Hinh_Toi_Da =5;

    public static final float PI = 3.14f;
    public static final float INCH_CM = 2.54f;
    public static final int DonVi_CM = 1;
    public static final int DonVi_INCH = 2;
    public static int donVi = DonVi_CM;

    public static float chuyenCMsangINCH(float cm){
        float inch = cm / INCH_CM;
        return inch;
    }
    public static float chuyenINCHsangCM(float inch){
        float cm = inch * INCH_CM;
        return cm;
    }
}