package tuan4;


public class Nhanvien {
    String tennhanvien;
    String diachi;
    String bophanlamviec;
    int luong;
    String ngaysinh;


    Nhanvien(String t, String dc, String bplv, int l, String ns){
        tennhanvien = t;
        diachi = dc;
        bophanlamviec = bplv;
        luong = l;
        ngaysinh = ns;

    }

    void intThongTinNhanvien(){
        System.out.println("Tên Nhân viên:" + tennhanvien + " " + "Địa chỉ:" + diachi + " " + "Bộ phận làm việc:" + bophanlamviec + " " + "Lương:" + luong + " " + "Ngày sinh:" + ngaysinh + " ");
        
    }

    
}
