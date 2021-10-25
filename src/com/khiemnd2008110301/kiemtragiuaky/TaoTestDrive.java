package kiemtragiuaky;

import java.util.Scanner;

public class TaoTestDrive {
    static Tao tao = new Tao();
    static Scanner khotao =new Scanner(System.in);
     public static void main(String[] args) {
         do{
             tao.menu();
             System.out.println("Nhập chức năng bạn muốn chọn: ");
             int n = khotao.nextInt();
             switch(n){
                 case 0:
                 break;
                 case 1:
                 tao.inNhapThongTin();
                 break;
                 case 2:
                 tao.themTao();
                 break;
                 case 3:
                 tao.Tim();
                 break;
                 case 4:
                 tao.inDanhSachTao();
                 break;
                 default: System.out.println("Lỗi mời nhập lại: ");
             }

             while(true);
             
        
         }
    

    
    }
}
