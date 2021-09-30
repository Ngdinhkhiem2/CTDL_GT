package tuan4;

import java.util.Scanner;



public class NhanvienTestDrive{
    public static void main(String[] args) {
        Nhanvien[] nhanvienlist = new Nhanvien[2];
        Scanner bienNhap = new Scanner(System.in);
     for(int i = 0; i < nhanvienlist.length; i++){
        System.out.print("Tên nhân viên: ");
        String t = bienNhap.nextLine();
        System.out.print("Địa chỉ: ");
        String dc = bienNhap.nextLine();
        System.out.print("Bộ phận làm việc: ");
        String bplv = bienNhap.nextLine();
        System.out.print("Lương: ");
        int l = bienNhap.nextInt();
        System.out.print("Ngày sinh: ");
        String ns = bienNhap.nextLine();
         bienNhap.nextLine();
        nhanvienlist[i] = new Nhanvien(t, dc, bplv, l, ns);
        }

        System.out.println("++++THÔNG TIN NHÂN VIÊN++++");
        for(Nhanvien nhanvien : nhanvienlist){
            nhanvien.intThongTinNhanvien();
        }
        
    }
    
}
