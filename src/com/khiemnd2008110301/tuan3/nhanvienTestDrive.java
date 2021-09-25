package com.khiemnd2008110301.tuan3;


public class nhanvienTestDrive {
    public static void main(String[] args) {
        
        Nhanvien nhanvien;

        nhanvien = new Nhanvien("Lê Việt Đức", "12000000", "Bảo vệ", "Khu phố tàu", "Phòng bảo vệ", "12/3/2002");

        nhanvien.inThongTinNhanVien();

        nhanvien = new Nhanvien("Vũ Hoàng Tuấn Anh", "12000000", "Lao Công", "Nhà thờ Mỹ Hòa", "Tầng Hầm", "20/7/2002");

        nhanvien.inThongTinNhanVien();

    }
    
}
