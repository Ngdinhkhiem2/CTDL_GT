package tuan4;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;



public class SachTestDrive {
    public static void main(String[] args) {
        Sach[] sachlist = new Sach[2];
        Scanner bienNhap = new Scanner(System.in);
        for(int i = 0; i < sachlist.length; i++){
            System.out.print("Nhà xuất bản: ");
            String nxb = bienNhap.nextLine();
            System.out.print("Năm xuất bản: ");
            String nb = bienNhap.nextLine();
            System.out.print("Loại: ");
            String l = bienNhap.nextLine();
            System.out.print("Số lượng: ");
            int sl = bienNhap.nextInt();
            System.out.print("Giá: ");
            float gb = bienNhap.nextFloat();
            bienNhap.nextLine();
            sachlist[i] = new Sach(nxb, nb, l, sl, gb);


        }

        System.out.println("===IN THÔNG TIN SÁCH===");
        for(Sach sach : sachlist){
            sach.intThongTinSach();
        }

    }
    
}
