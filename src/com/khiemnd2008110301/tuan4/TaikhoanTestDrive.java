package tuan4;

import java.util.Scanner;

import jdk.nashorn.api.tree.ForInLoopTree;

public class TaikhoanTestDrive {
    public static void main(String[] args) {
        Taikhoan[] taikhoanlist = new Taikhoan[1];
        Scanner bienNhap = new Scanner(System.in);
        for(int i = 0; i < taikhoanlist.length; i++ ){
            System.out.print("Tên tài khoản: ");
            String tk = bienNhap.nextLine();
            System.out.print("Số tài khoản: ");
            int stk = bienNhap.nextInt();
            System.out.print("Số dư trong tài khoản: ");
            float sdtk = bienNhap.nextFloat();
            bienNhap.nextLine();
            taikhoanlist[i] = new Taikhoan(tk, stk, sdtk);

        }

        System.out.println("_____THÔNG TIN TÀI KHOẢN_____");
        for(Taikhoan taikhoan : taikhoanlist){
            taikhoan.intThongTinTaikhoan();
        }
        
        
    }
    
}
