package tuan02;

import java.util.Date;

public class SinhVien {

    String mssv;
    String tenSinhVien;
    int tuoi;

    String queQuan;

     Date ngaySinh;


    void inThongTinSV(){
        System.out.println("Mã số sinh viên: " + mssv);
        System.out.println("Tên sinh viên: " + tenSinhVien);
        System.out.println("Quê quán: " + queQuan);
        System.out.println("tuổi: " + tuoi);
    }


    
}
