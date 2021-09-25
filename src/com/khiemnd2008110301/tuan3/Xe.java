package com.khiemnd2008110301.tuan3;

public class Xe {
    String tenchuxe;
    String hangsanxuat;
    String dong;
    String giayphep;
    String dungtichxang;


    Xe(String tcx, String hsx, String d, String gp, String dx){
        tenchuxe = tcx;
        hangsanxuat = hsx;
        dong = d;
        giayphep = gp;
        dungtichxang = dx;
    }

    void inThongTinXe(){
        System.out.println("Tên chủ xe: " + tenchuxe);
        System.out.println("Hãng sản xuất: " + hangsanxuat);
        System.out.println("Dòng xe: " + dong);
        System.out.println("Giấy phép: " + giayphep);
        System.out.println("Dung tích xăng: " + dungtichxang);
    }

    
}
