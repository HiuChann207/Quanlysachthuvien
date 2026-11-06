import java.util.Scanner;

public class QuanLySachNew{
    public static void main(String[] args) {
        int luaChon;
        Scanner sc = new Scanner(System.in);

        // Khai báo maSach, tenSach, tacGia, namXB, donGia, soLuong 
        int n_sach=0;
        String[] maSach = null;
        String[] tenSach = null;
        String[] tacGia = null;
        int[] namXB = null;
        int[] donGia = null;
        int[] soLuong = null;
        
        int tongSL = 0;
        int tongGT = 0;

        // menu lựa chọn
        do{
            System.out.println("======= Quan ly sach ========");
            System.out.println("1: Nhap thong tin sach");
            System.out.println("2: xem tong so luong va gia tri sach ");
            System.out.println("3: tim sach theo ma");
            System.out.println("0: thoat");
            System.out.println("Nhap lua chon: ");
            luaChon = sc.nextInt();
            sc.nextLine();
            switch (luaChon) {
                case 1:
                    {
                        //Bài 1: Nhập n sách bằng vòng lặp
                        
                        System.out.println("So sach muon nhap: ");
                        n_sach = sc.nextInt();

                        // Khởi tạo kích thước mảng
                        maSach = new String[n_sach];
                        tenSach = new String[n_sach];
                        tacGia = new String[n_sach];
                        namXB = new int[n_sach];
                        donGia = new int[n_sach];
                        soLuong = new int[n_sach];
                        
                        // Nhập thông tin sách
                        for(int i=0; i<n_sach; i++){
                        sc.nextLine();
                        System.out.println("Nhap ma sach: ");
                        maSach[i] = sc.nextLine();
                        System.out.println("Nhap ten sach: ");
                        tenSach[i] = sc.nextLine();
                        System.out.println("Nhap tac gia: ");
                        tacGia[i] = sc.nextLine();
                        System.out.println("Nhap nam xuat ban: ");
                        namXB[i] = sc.nextInt();
                        System.out.println("Nhap don gia: ");
                        donGia[i] = sc.nextInt();
                        System.out.println("Nhap so luong: ");
                        soLuong[i] = sc.nextInt();

                        // tính tổng sl và tổng gt
                        tongSL += soLuong[i];
                        tongGT += soLuong[i]*donGia[i];
                        }


                        
                    }
                    break;
                
                case 2:
                    {
                        // in tổng số lượng và giá trị sách
                        System.out.print("Tong so luong: " + tongSL);
                        System.out.print("Tong gia tri: " + tongGT);
                    }
                    break;
                
                case 3:
                    {
                        // tìm sách theo mã
                        System.out.print("Nhap ma muon tim: ");
                        String timMaSach;
                        timMaSach = sc.nextLine();

                        for(int i = 0; i<n_sach; i++)
                            if (timMaSach.equals(maSach[i])) {
                                System.out.print("Masach: "+maSach[i]+"\nTen sach: "+tenSach[i]+"\nTac gia: "+tacGia[i]+"\nNam xuat ban: "+ namXB[i] + "\nDon gia: "+ donGia[i] + "\nSo luong"+soLuong[i]);
                                break;
                            }
                            else
                                System.out.print("Khong tim thay");
                    }
                    break;

                default:
                    //thoát
                    break;
            }
        }while (luaChon != 0);
    }
}
