public class sach {
    // Các thuộc tính của lớp sach
    public String maSach;
    public String tieuDe;
    public String tacGia;
    public Integer namXuatBan;
    public Integer soLuong;
    
    public sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong){
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    public sach(){

    }

    public void hienThiThongTin() {
            System.out.print("Ma sach: " + maSach);
            System.out.print("\nTieu de: " + tieuDe);
            System.out.print("\nTac gia: " + tacGia);
            System.out.print("\nNam xuat ban: " + namXuatBan);
            System.out.print("\nSo luong: " + soLuong);
            System.out.print("\n--------------------\n");
    }
}

