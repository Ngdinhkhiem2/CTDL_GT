package com.khiemnd2008110301.tuan3;

public class TaikhoanTestDrive {
    public static void main(String[] args) {
        Taikhoan taikhoan;

        taikhoan = new Taikhoan("Nguyễn Đình Khiêm", "2008110301", "Mua Ferrari hết tiền rồi");

        taikhoan.inThongTinTaikhoan();

        taikhoan = new Taikhoan("Nguyễn Đình Khiêm", "2008110301", "09", "29/5/2021");

        taikhoan.inThongTinTaikhoan();
    }
    
}
