package com.khiemnd2008110301.tuan3;

import java.sql.Date;

public class Book { 
     
    String nhaxuatban;
    double namxuatban;
    double giaban;
    double soluong;
    String loai;
    String hethangngay;

     
    Book(String nb, double nxb, double gb, double sl, String l){
        nhaxuatban = nb;
        namxuatban = nxb;
        giaban = gb;
        soluong = sl;
        loai = l;

    }

    Book(String nb, double nxb, double gb, double sl, String l, String hn){
        nhaxuatban = nb;
        namxuatban = nxb;
        giaban = gb;
        soluong = sl;
        loai = l;
        hethangngay = hn;

    }

    void inThongTinsach(){
        System.out.println("Nhà xuất bản: " + nhaxuatban);
        System.out.println("Năm xuất bản: " + namxuatban);
        System.out.println("Gía bán: " + giaban);
        System.out.println("Số lượng: " + soluong );
        System.out.println("Loại: " + loai);
        System.out.println("Ngày hết hàng: " + hethangngay);
    }  
}
