import java.util.Scanner;

public class SachThamKhao extends Sach {
    private double thue;

    public SachThamKhao() {
        super();
    }

    public SachThamKhao(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
    }

    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhap thue: ");
        thue = sc.nextDouble();
        sc.nextLine();
    }

    public void xuat() {
        super.xuat();
        System.out.print("\nThue: " + thue);
        System.out.print("\nThanh tien: " + tinhThanhTien());
        System.out.print("\n===============");
    }

    public double tinhThanhTien() {
        return soLuong * donGia + thue;
    }
}
