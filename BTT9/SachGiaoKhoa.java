import java.util.Scanner;

public class SachGiaoKhoa extends Sach{
    private String tinhTrang;

    public SachGiaoKhoa() {
        super();
    }

    public SachGiaoKhoa(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan, String tinhTrang) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }

    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Tinh trang (moi/cu): ");
        tinhTrang = sc.nextLine();
    }

    public void xuat() {
        super.xuat();
        System.out.print("\nTinh trang: " + tinhTrang);
        System.out.print("\nThanh tien: " + tinhThanhTien());
        System.out.print("\n===============");
    }

    public double tinhThanhTien() {
        if (tinhTrang.equalsIgnoreCase("moi")) {
            return soLuong * donGia;
        } else {
            return soLuong * donGia * 0.5;
        }
    }
}
