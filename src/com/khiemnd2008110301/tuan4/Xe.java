package tuan4;

public class Xe {
    String tenchuxe;
    String hangsanxuat;
    String dong;
    String giayphep;
    int dungtichxang;

    Xe(){}

    Xe(String t, String hsx, String d, String gp, int dx){
        tenchuxe = t;
        hangsanxuat = hsx;
        dong = d;
        giayphep = gp;
        dungtichxang = dx;
    }

    void intThongTinXe(){
        System.out.println("Tên chủ xe: " + tenchuxe + " " + "Hãng sản xuất: " + hangsanxuat + " " + " Dòng: " + dong + " " + "Giấy phép: " + giayphep + " " + " Dung tích xăng: " + dungtichxang);

    }
    
}
