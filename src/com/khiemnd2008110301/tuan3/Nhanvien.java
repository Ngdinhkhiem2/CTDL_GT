package com.khiemnd2008110301.tuan3;

import java.sql.Date;

public class Nhanvien {

    String tennhanvien;
    String luong;
    String chucvu;
    String diachi;
    String bophanlamviec;
    String ngaysinh;

    Nhanvien(String tnv, String l, String dc, String bplv, String ns){
        tennhanvien = tnv;
        luong = l;
        diachi = dc;
        bophanlamviec = bplv;
        ngaysinh = ns;
    }


    Nhanvien(String tnv, String l, String cv, String dc, String bplv, String ns){
        tennhanvien= tnv;
        luong = l;
        chucvu = cv;
        diachi = dc;
        bophanlamviec = bplv;
        ngaysinh = ns;
    }
    

    void inThongTinNhanVien(){
     System.out.println("Tên nhân viên: " + tennhanvien);
     System.out.println("Lương: VND" + luong);
     System.out.println("Chức vụ: " + chucvu);
     System.out.println("Địa chỉ: " + diachi);
     System.out.println("Bộ phận làm việc: " + bophanlamviec);
     System.out.println("Ngày sinh: " + ngaysinh);

    
    }
}
