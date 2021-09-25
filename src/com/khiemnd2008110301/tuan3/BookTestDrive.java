package com.khiemnd2008110301.tuan3;

public class BookTestDrive {
    public static void main(String[] args) {
        Book book;
         book = new Book("Nguyễn Đình Khiêm", 2021, 2000000, 10, "Gỉa tưởng");

         book.inThongTinsach();


         book = new Book("Nguyễn Đình Khiêm", 2021, 1000000, 20, "Kiếm Hiệp", "29/9/2021");

         book.inThongTinsach();
    }
    
}
