package Thuchanhchuong3;


public class NhanVienFullTime extends NhanVien {
    private int ngayLamThem;
    public int loaiChucVu;
    public NhanVienFullTime(String ten){
        this.ten = ten;
    }
    public NhanVienFullTime(String ten, int ngayLamThem){
        this.ten = ten;
        this.ngayLamThem = ngayLamThem;
    }
    public void setloaiChucVu(int LoaiChucVu)
    {
        this.loaiChucVu = LoaiChucVu;
    }
    public String loaiNhanVien()
    {      
        if (loaiChucVu == 1) 
            return "Sep";
        else
            return "Nhan vien toan thoi gian";
    }
    public void tinhLuong()
    {   if(loaiChucVu == 1)
            luong = Configs.LUONG_NHAN_VIEN_SEP;
        else
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + Configs.LUONG_LAM_THEM_MOI_NGAY*ngayLamThem;
    }
}
