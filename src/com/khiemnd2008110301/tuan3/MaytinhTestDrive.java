package com.khiemnd2008110301.tuan3;

public class MaytinhTestDrive {
    public static void main(String[] args) {
        Maytinh maytinh;

        maytinh = new Maytinh("Asus", "2021", "Window", "8GB Ram", "Intel core i3", "14500000", "");

        maytinh.inThongTinMaytinh();

        maytinh = new Maytinh("MSI", "2021", "Window", "8GB DDR4 3200MHz", " Intel® Core™ i7-11800H", "28990000(đang giảm giá)", "Bảo hành 2 năm");

        maytinh.inThongTinMaytinh();
    }
    
}
