import java.util.Scanner;
import java.time.Year;

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

        

        // Thuc hanh tuan 4
        // Bai 4.1
        int currentYear = Year.now().getValue();
        boolean isGiaHopLe = donGia > 0;
        boolean isSoLuongHopLe = soLuong >= 0;
        boolean isNamXBHopLe = (namXuatBan > 0 && namXuatBan <= currentYear);

        boolean duLieuHopLe = isGiaHopLe && isSoLuongHopLe && isNamXBHopLe;

        // Bai 2
        String phanLoaiGia;
        if (donGia < 50000) {
            phanLoaiGia = "Sach gia thap";
        } else if (donGia <= 100000) {
            phanLoaiGia = "Sach gia trung binh";
        } else if (donGia <= 200000) {
            phanLoaiGia = "Sach gia cao";
        } else {
            phanLoaiGia = "Sach gia dac biet";
        }

        // Bai 3
        String phanLoaiTonKho;
        if (soLuong == 0) {
            phanLoaiTonKho = "Het";
        } else if (soLuong <= 5) {
            phanLoaiTonKho = "Sap het";
        } else if (soLuong <= 20) {
            phanLoaiTonKho = "Con it";
        } else {
            phanLoaiTonKho = "Con nhieu";
        }

        // Bai 4: dung switch chon loai sach
        System.out.println("Chon loai sach:");
        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");
        System.out.print("Chon (1-4): ");
        int loaiLuaChon = sc.nextInt();

        String loaiSach;
        switch (loaiLuaChon) {
            case 1:
                loaiSach = "Sach giao khoa";
                break;
            case 2:
                loaiSach = "Sach tham khao";
                break;
            case 3:
                loaiSach = "Sach chuyen nganh";
                break;
            case 4:
                loaiSach = "Sach khac";
                break;
            default:
                loaiSach = "Sach khac";
                break;
        }

        // in
        System.out.println("1. Trang thai du lieu : " + (duLieuHopLe ? "Hop le" : "Khong hop le"));
        if (!duLieuHopLe) {
            if (!isGiaHopLe) System.out.println("Loi: Gia phai > 0");
            if (!isSoLuongHopLe) System.out.println("Loi: so luong phai >= 0");
            if (!isNamXBHopLe) System.out.println("Loi: Nam xuat ban khong hop le");
        }
        System.out.println("2. Phan loai gia      : " + phanLoaiGia);
        System.out.println("3. Tinh trang ton kho : " + phanLoaiTonKho);
        System.out.println("4. Loai sach  : " + loaiSach);
        sc.close();
    }
}