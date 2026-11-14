import java.util.ArrayList;

public class BTT78 {
    public static void main(String[] args){
        ArrayList <sach> Sach = new ArrayList<sach>();

        Sach.add(new sach("001", "Sach bai tap toan 12", "Nguyen Van A", 2022, 10));
        Sach.add(new sach("002", "Sach IELTS", "Nguyen Van B", 2019, 30));
        Sach.add(new sach("003", "Giai tich 1", "Tran C", 2026, 17));
        for(int i = 0; i< Sach.size(); i++)
            Sach.get(i).hienThiThongTin();
    }
}
