import java.util.Scanner;

public class sach {
    // Các thuộc tính của lớp sach
    private  String maSach;
    private String tieuDe;
    private String tacGia;
    private Integer namXuatBan;
    private Integer soLuong;

    // các thuộc tính getters, setters
    public String getMasach(){
        return maSach;
    }
    public void setMasach(String maSach){
        this.maSach = maSach;
    }
    public String getTieude(){
        return tieuDe;
    }
    public void setTieude(String tieuDe){
        this.tieuDe = tieuDe;
    }
    public String getTacgia(){
        return tacGia;
    }
    public void setTacgia(String tacGia){
        this.tacGia = tacGia;
    }
    public Integer getNamXuatBan(){
        return namXuatBan;
    }
    public void setNamXuatBan(int namXuatBan){
        int CurrentYear = 2026;
        if (namXuatBan > 0 && namXuatBan < CurrentYear) {
            this.namXuatBan = namXuatBan;
        }
        else{
            System.out.print("Nhap lai");
        }
    }
    public Integer getSoLuong(){
        return soLuong;
    }
    public void setSoLuong(int soLuong){
        if(soLuong>=0)
            this.soLuong = soLuong;
        else
            System.out.print("Nhap lai");
    }//end getters setters
    
    // Các constructor
    public sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong){
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    public sach(){

    }

    // Các phương thức
    public void hienThiThongTin() {
            System.out.print("Ma sach: " + maSach);
            System.out.print("\nTieu de: " + tieuDe);
            System.out.print("\nTac gia: " + tacGia);
            System.out.print("\nNam xuat ban: " + namXuatBan);
            System.out.print("\nSo luong: " + soLuong);
            System.out.print("\n--------------------\n");
    }

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();
        System.out.print("Nhap tieu de: ");
        tieuDe = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        tacGia = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        namXuatBan = sc.nextInt();
        System.out.print("Nhap so luong: ");
        soLuong = sc.nextInt();
        sc.close();
    }
}

