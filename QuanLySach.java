import java.util.Scanner;

public class QuanLySach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bai 1
        System.out.print("Nhap ma sach: ");
        String maSach = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        String tenSach = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        String tacGia = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        int namXuatBan = sc.nextInt();
        System.out.print("Nhap don gia: ");
        double donGia = sc.nextDouble();
        System.out.print("Nhap so luong: ");
        int soLuong = sc.nextInt();

        // in ket qua
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);

        // Bai 2
        double thanhTien = donGia * soLuong;

        // Bai 3
        double phiVanChuyen = thanhTien * 0.05;

        // Bai 4
        double tongTienNhap = thanhTien + phiVanChuyen;

        // in ket qua
        System.out.println("Thanh tien: " + thanhTien);
        System.out.println("Phi van chuyen: " + phiVanChuyen);
        System.out.println("Tong tien nhap kho: " + tongTienNhap);

        sc.close();
    }
}