import java.util.Scanner;

public class Sach {
    protected String maSach;
    protected String ngayNhap;
    protected double donGia;
    protected int soLuong;
    protected String nhaXuatBan;

    //Constructors
    public Sach() {
    }

    public Sach(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }

    // Phương thức
    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public double getDonGia() {
        return donGia;
    }

    public void nhap(Scanner sc) {
        System.out.print("Ma sach: ");
        maSach = sc.nextLine();
        System.out.print("Ngay nhap: ");
        ngayNhap = sc.nextLine();
        System.out.print("Don gia: ");
        donGia = sc.nextDouble();
        System.out.print("So luong: ");
        soLuong = sc.nextInt();
        sc.nextLine();
        System.out.print("Nha xuat ban: ");
        nhaXuatBan = sc.nextLine();
    }

    public void xuat() {
        System.out.print("\nMa sach: " + maSach);
        System.out.print("\nNgay nhap: " + ngayNhap);
        System.out.print("\nDon gia: " + donGia);
        System.out.print("\nSo luong: " + soLuong);
        System.out.print("\nNXB: " + nhaXuatBan);
    }

    public double tinhThanhTien() {
        return 0;
    }
}
