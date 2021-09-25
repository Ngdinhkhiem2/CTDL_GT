package com.khiemnd2008110301.tuan3;

public class Maytinh {
    String nhasanxuat;
    String namsanxuat;
    String hedieuhanh;
    String ram;
    String CPU;
    String gia;
    String nambaohanh;

    Maytinh(String nsx, String nx, String hh, String r, String cpu, String g){
        nhasanxuat = nsx;
        namsanxuat = nx;
        hedieuhanh = hh;
        ram = r;
        CPU = cpu;
        gia = g;
    }

    Maytinh(String nsx, String nx, String hh, String r, String cpu, String g, String nh){
        nhasanxuat = nsx;
        namsanxuat = nx;
        hedieuhanh = hh;
        ram = r;
        CPU = cpu;
        gia = g;
        nambaohanh = nh;
    }
     
    void inThongTinMaytinh(){
        System.out.println("Nhà sản xuất: " + nhasanxuat);
        System.out.println("Năm sản xuất: " + namsanxuat);
        System.out.println("Hệ điều hành: " + hedieuhanh);
        System.out.println("Ram: " + ram);
        System.out.println("CPU: " + CPU);
        System.out.println("Giá: VND" + gia);
        System.out.println("Năm bảo hành: " + nambaohanh);

    }
    
    
}
