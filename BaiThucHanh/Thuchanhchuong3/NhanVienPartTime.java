package Thuchanhchuong3;

public class NhanVienPartTime extends NhanVien{
    private int giolamviec;
    public NhanVienPartTime(String ten, int Giolamviec){
        this.ten = ten;
        this.giolamviec = Giolamviec;
    }
    @Override
    public String loaiNhanVien()
    {
        return "Nhan vien thoi vu";
    }
    public void tinhLuong()
    {
        luong = Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO *giolamviec;
    }
}
