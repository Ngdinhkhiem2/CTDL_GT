package com.khiemnd2008110301.tuan3;

import javax.print.DocFlavor.STRING;

public class Taikhoan {

    String tentaikhoan;
    String sotaikhoan;
    String sodutaikhoan;
    String ngaylamthe;

    Taikhoan(String tk, String stk, String sdtk){
        tentaikhoan = tk;
        sotaikhoan = stk;
        sodutaikhoan = sdtk;

    }

    Taikhoan(String tk, String stk, String sdtk, String nlt){
        tentaikhoan = tk;
        sotaikhoan = stk;
        sodutaikhoan = sdtk;
        ngaylamthe = nlt;
    }
    
    void inThongTinTaikhoan(){
        System.out.println("Tên tài khoản: " + tentaikhoan);
        System.out.println("Số tài khoản: " + sotaikhoan);
        System.out.println("Số dư tài khoản: " + sodutaikhoan);
        System.out.println("Ngày làm thẻ: " + ngaylamthe);
    }
}
