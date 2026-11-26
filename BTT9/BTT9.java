import java.util.ArrayList;
import java.util.Scanner;

public class BTT9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sach> danhSachSach = new ArrayList<>();
        int chon;

        do {
            System.out.print("\n===============\n");
            System.out.println("1. Nhap Sach Giao Khoa");
            System.out.println("2. Nhap Sach Tham Khao");
            System.out.println("3. Hien thi cac sach");
            System.out.println("4. Tinh tong thanh tien cho tung loai");
            System.out.println("5. Tinh trung binh cong don gia cua cac sach tham khao");
            System.out.println("6. Xuat ra cac sach giao khoa cua nha xuat ban X");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.println("--- Nhap thong tin Sach Giao Khoa ---");
                    SachGiaoKhoa sgk = new SachGiaoKhoa();
                    sgk.nhap(sc);
                    danhSachSach.add(sgk);
                    break;

                case 2:
                    System.out.println("--- Nhap thong tin Sach Tham Khao ---");
                    SachThamKhao stk = new SachThamKhao();
                    stk.nhap(sc);
                    danhSachSach.add(stk);
                    break;

                case 3:
                    System.out.println("\n--- DANH SACH TAT CA CAC SACH ---");
                    if (danhSachSach.isEmpty()) {
                        System.out.println("Danh sach hien dang trong!");
                    } else {
                        for (int i = 0; i < danhSachSach.size(); i++) {
                            Sach s = danhSachSach.get(i);
                            s.xuat();
                        }
                    }
                    break;

                case 4:
                    double tongTienSGK = 0;
                    double tongTienSTK = 0;
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        Sach s = danhSachSach.get(i);
                        if (s instanceof SachGiaoKhoa) {
                            tongTienSGK += s.tinhThanhTien();
                        } else if (s instanceof SachThamKhao) {
                            tongTienSTK += s.tinhThanhTien();
                        }
                    }
                    System.out.println("Tong thanh tien Sach Giao Khoa: " + tongTienSGK);
                    System.out.println("Tong thanh tien Sach Tham Khao: " + tongTienSTK);
                    break;

                case 5:
                    double tongDonGiaSTK = 0;
                    int demSTK = 0;
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        Sach s = danhSachSach.get(i);
                        if (s instanceof SachThamKhao) {
                            tongDonGiaSTK += s.getDonGia();
                            demSTK++;
                        }
                    }
                    if (demSTK > 0) {
                        double trungBinh = tongDonGiaSTK / demSTK;
                        System.out.println("Trung binh cong don gia Sach Tham Khao: " + trungBinh);
                    } else {
                        System.out.println("Chua co sach tham khao nao trong danh sach!");
                    }
                    break;

                case 6:
                    System.out.print("Nhap ten nha xuat ban X: ");
                    String nxbCanTim = sc.nextLine();
                    boolean timThay = false;
                    System.out.println("--- Cac sach giao khoa cua NXB " + nxbCanTim + " ---");
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        Sach s = danhSachSach.get(i);
                        if (s instanceof SachGiaoKhoa) {
                            if (s.getNhaXuatBan().equalsIgnoreCase(nxbCanTim)) {
                                s.xuat();
                                timThay = true;
                            }
                        }
                    }
                    if (!timThay) {
                        System.out.println("Khong tim thay sach giao khoa nao thuoc nha xuat ban nay.");
                    }
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Chon lai!");
            }
        } while (chon != 0);

        sc.close();
    }
}
