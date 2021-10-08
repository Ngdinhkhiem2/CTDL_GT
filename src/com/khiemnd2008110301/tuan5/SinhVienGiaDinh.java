package tuan5;

import java.util.Scanner;

public class SinhVienGiaDinh {

        Scanner sc = new Scanner(System.in);
        String ten;
        double diemTB;
        SinhVienGiaDinh(){}
    
    public  SinhVienGiaDinh(String t, double dtb){
        t = ten;
        dtb = diemTB;
    
    }
    public void nhapThongTin()
        {
            System.out.println("Nhập tên sinh viên: ");
            ten = sc.nextLine();
            System.out.println("Nhập điểm: ");
            diemTB = sc.nextDouble();
        }
    public void inThongTin(){
            System.out.println("Tên Sinh Viên: "+ ten + " " + "Điểm: "+diemTB);
        }
    
    }
    

