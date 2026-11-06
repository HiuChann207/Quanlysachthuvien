import java.util.Scanner;
import java.util.ArrayList;
/* ArrayList<String> cars = new ArrayList<>(); */


public class QuanLySachNew{
    public static void main(String[] args) {
        int luaChon;
        Scanner sc = new Scanner(System.in);

        // Khai báo maSach, tenSach, tacGia, namXB, donGia, soLuong 
        ArrayList<String> maSach = new ArrayList<>();
        ArrayList<String> tenSach = new ArrayList<>();
        ArrayList<String> tacGia = new ArrayList<>();
        ArrayList<Integer> namXB = new ArrayList<>();
        ArrayList<Integer> donGia = new ArrayList<>();
        ArrayList<Integer> soLuong = new ArrayList<>();
        // Xây dựng: ArrayList<String> danhSachSach;
        // Mỗi phần tử đại diện cho thông tin của một cuốn sách.
        // Thực hiện: Thêm sách, Hiển thị sách, Tìm sách, Xóa sách, Sửa sách
        ArrayList<String> danhSachSach = new ArrayList<>();
        
        int tongSL = 0;
        int tongGT = 0;
        int maxSL = 0;

        // menu lựa chọn
        do{
            System.out.println("======= Quan ly sach ========");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");
            System.out.println("Nhap lua chon: ");
            luaChon = sc.nextInt();
            sc.nextLine();
            switch (luaChon) {
                case 1:
                    {
                        //Bài 1: Nhập n sách bằng vòng lặp
                        // Nhập thông tin sách
                        sc.nextLine();
                        System.out.println("Nhap ma sach: ");
                        maSach.add(sc.nextLine());
                        System.out.println("Nhap ten sach: ");
                        tenSach.add(sc.nextLine());
                        System.out.println("Nhap tac gia: ");
                        tacGia.add(sc.nextLine());
                        System.out.println("Nhap nam xuat ban: ");
                        namXB.add(sc.nextInt());
                        System.out.println("Nhap don gia: ");
                        donGia.add(sc.nextInt());
                        System.out.println("Nhap so luong: ");
                        soLuong.add(sc.nextInt());

                        // tính tổng sl và tổng gt
                        for(int i=0; i<maSach.size(); i++)
                        {
                            danhSachSach.add(maSach.get(i) + " - " + tenSach.get(i) + " - " + tacGia.get(i) + " - " + namXB.get(i) + " - " + donGia.get(i) + " - " + soLuong.get(i) + "\n");
                            tongSL += soLuong.get(i);
                            tongGT += soLuong.get(i)*donGia.get(i);
                            maxSL = (maxSL<soLuong.get(i)) ? soLuong.get(i):maxSL;

                        }
                        
                        //Xuất tổng số lượng lớn nhất
                        System.out.print("Tong so luong lon nhat: " + maxSL);
                    }
                    break;
                
                case 2:
                    {
                        // in tổng số lượng và giá trị sách
                        for(int i = 0; i<maSach.size(); i++)
                        {
                            System.out.print("\n-------------------------");
                            System.out.print("\nSach thu " + i + "\n");
                            System.out.print(danhSachSach + "\n");
                        }
                    }
                    break;
                
                case 3:
                    {
                        // tìm sách theo mã
                        boolean isTimThaySach = false;
                        int i;

                        System.out.print("Nhap ma muon tim: ");
                        String timMaSach;
                        timMaSach = sc.nextLine();

                        for(i = 0; i<maSach.size(); i++)
                            if (timMaSach.equals(maSach.get(i))) {
                                isTimThaySach = true;
                                break;
                            }
                            else{
                                isTimThaySach = false;
                            }
                                
                        
                        // in kết quả
                        if (isTimThaySach) {                            
                            System.out.print(danhSachSach.get(i));
                        }
                        else{
                            System.out.print("Khong tim thay");
                        }
                        
                    }
                    break;

                case 4:
                    {
                        //Xóa mã sách
                        String maSach_Xoa;
                        System.out.print("Nhap ma sach muon xoa: ");
                        maSach_Xoa = sc.nextLine();

                        danhSachSach.remove(maSach.indexOf(maSach_Xoa));
                    }
                    break;

                case 5:
                    {
                        // Sửa sách
                        System.out.print("Nhap ma sach muon sua: ");
                        String suaMaSach = sc.nextLine();

                        for (int i = 0; i < danhSachSach.size(); i++) {
                            if (danhSachSach.get(i).startsWith(suaMaSach + " - ")) {
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
                                // Tạo chuỗi mới với mã sách cũ nhưng các thông tin khác đã được cập nhật
                                String sachMoi = suaMaSach + " - " + tenMoi + " - " + tacGiaMoi + " - " + namXBMoi + " - " + donGiaMoi + " - " + soLuongMoi;
                                
                                // Ghi đè chuỗi mới vào vị trí i
                                danhSachSach.set(i, sachMoi);
                                System.out.println(danhSachSach);
                                break;
                            }
                        }
                }
                break;

                case 6:
                    {
                        // Tính tổng số lượng
                        System.out.print("So luong: " + tongSL);
                    }
                    break;

                case 7:
                    {
                        // Tính tổng giá trị
                        System.out.print("Tong gia tri: " + tongGT);
                    }
                    break;

                default:
                    //thoát
                    break;
            }
        }while (luaChon != 8);
    }
}
