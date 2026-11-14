import java.util.Scanner;
import java.util.ArrayList;

public class BTT56 {
    public static void main(String[] args) {
        int luaChon;
        Scanner sc = new Scanner(System.in);

        // Khai báo các ArrayList
        ArrayList<String> maSach = new ArrayList<>();
        ArrayList<String> tenSach = new ArrayList<>();
        ArrayList<String> tacGia = new ArrayList<>();
        ArrayList<Integer> namXB = new ArrayList<>();
        ArrayList<Integer> donGia = new ArrayList<>();
        ArrayList<Integer> soLuong = new ArrayList<>();
        ArrayList<String> danhSachSach = new ArrayList<>();
        
        int tongSL = 0;
        int tongGT = 0;
        int maxSL = 0;

        do {
            System.out.println("\n======= Quan ly sach ========");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");
            System.out.print("Nhap lua chon: ");
            luaChon = sc.nextInt();
            sc.nextLine(); // Dọn bộ đệm sau khi nhập số

            switch (luaChon) {
                case 1: {
                    System.out.print("Nhap ma sach: ");
                    String ma = sc.nextLine();
                    maSach.add(ma);
                    
                    System.out.print("Nhap ten sach: ");
                    String ten = sc.nextLine();
                    tenSach.add(ten);
                    
                    System.out.print("Nhap tac gia: ");
                    String tg = sc.nextLine();
                    tacGia.add(tg);
                    
                    System.out.print("Nhap nam xuat ban: ");
                    int nam = sc.nextInt();
                    namXB.add(nam);
                    
                    System.out.print("Nhap don gia: ");
                    int gia = sc.nextInt();
                    donGia.add(gia);
                    
                    System.out.print("Nhap so luong: ");
                    int sl = sc.nextInt();
                    soLuong.add(sl);
                    sc.nextLine(); // Dọn bộ đệm sau khi nhập số lần cuối

                    // Thêm trực tiếp vào danh sách hiển thị (Không dùng vòng lặp)
                    String thongTin = ma + " - " + ten + " - " + tg + " - " + nam + " - " + gia + " - " + sl;
                    danhSachSach.add(thongTin);

                    // Cập nhật tổng
                    tongSL += sl;
                    tongGT += (sl * gia);
                    if (maxSL < sl) {
                        maxSL = sl;
                    }

                    System.out.println("Da them sach thanh cong!");
                    break;
                }
                
                case 2: {
                    for (int i = 0; i < maSach.size(); i++) {
                            System.out.println("-------------------------");
                            System.out.println("Sach thu " + (i + 1) + ":");
                            System.out.println(danhSachSach.get(i));
                        }
                    break;
                }
                
                case 3: {
                    System.out.print("Nhap ma muon tim: ");
                    String timMaSach = sc.nextLine();
                    
                    // Sử dụng indexOf có sẵn của ArrayList để tìm kiếm nhanh
                    int index = maSach.indexOf(timMaSach);

                    if (index != -1) {
                        System.out.println("Tim thay sach: ");
                        System.out.println(danhSachSach.get(index));
                    } else {
                        System.out.println("Khong tim thay ma sach: " + timMaSach);
                    }
                    break;
                }

                case 4: {
                    System.out.print("Nhap ma sach muon xoa: ");
                    String maSach_Xoa = sc.nextLine();
                    int indexXoa = maSach.indexOf(maSach_Xoa);

                    if (indexXoa != -1) {
                        // Cập nhật lại tổng số lượng và giá trị trước khi xóa
                        tongSL -= soLuong.get(indexXoa);
                        tongGT -= (soLuong.get(indexXoa) * donGia.get(indexXoa));

                        // Xóa đồng bộ ở tất cả các List
                        maSach.remove(indexXoa);
                        tenSach.remove(indexXoa);
                        tacGia.remove(indexXoa);
                        namXB.remove(indexXoa);
                        donGia.remove(indexXoa);
                        soLuong.remove(indexXoa);
                        danhSachSach.remove(indexXoa);

                        System.out.println("Da xoa sach thanh cong!");
                    } else {
                        System.out.println("Khong tim thay sach de xoa.");
                    }
                    break;
                }

                case 5: {
                    System.out.print("Nhap ma sach muon sua: ");
                    String suaMaSach = sc.nextLine();
                    int indexSua = maSach.indexOf(suaMaSach);

                    if (indexSua != -1) {
                        // Trừ đi giá trị cũ khỏi tổng
                        tongSL -= soLuong.get(indexSua);
                        tongGT -= (soLuong.get(indexSua) * donGia.get(indexSua));

                        System.out.print("Nhap ten sach moi: ");
                        String tenMoi = sc.nextLine();
                        System.out.print("Nhap tac gia moi: ");
                        String tacGiaMoi = sc.nextLine();
                        System.out.print("Nhap nam xuat ban moi: ");
                        int namXBMoi = sc.nextInt();
                        System.out.print("Nhap don gia moi: ");
                        int donGiaMoi = sc.nextInt();
                        System.out.print("Nhap so luong moi: ");
                        int soLuongMoi = sc.nextInt();
                        sc.nextLine(); // Dọn bộ đệm

                        // Cập nhật đồng bộ các List
                        tenSach.set(indexSua, tenMoi);
                        tacGia.set(indexSua, tacGiaMoi);
                        namXB.set(indexSua, namXBMoi);
                        donGia.set(indexSua, donGiaMoi);
                        soLuong.set(indexSua, soLuongMoi);

                        // Cộng giá trị mới vào tổng
                        tongSL += soLuongMoi;
                        tongGT += (soLuongMoi * donGiaMoi);

                        // Cập nhật danh sách hiển thị
                        String sachMoi = suaMaSach + " - " + tenMoi + " - " + tacGiaMoi + " - " + namXBMoi + " - " + donGiaMoi + " - " + soLuongMoi;
                        danhSachSach.set(indexSua, sachMoi);
                        
                        System.out.println("Da cap nhat thong tin sach!");
                    } else {
                        System.out.println("Khong tim thay ma sach de sua.");
                    }
                    break;
                }

                case 6: {
                    System.out.println("Tong so luong sach hien co: " + tongSL);
                    break;
                }

                case 7: {
                    System.out.println("Tong gia tri sach hien co: " + tongGT);
                    break;
                }
                
                case 8:
                    break;

                default:
                    System.out.println("Lua chon khong hop le, vui long thu lai!");
                    break;
            }
        } while (luaChon != 8);
    }
}