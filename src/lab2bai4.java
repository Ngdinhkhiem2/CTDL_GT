import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class lab2bai4 {
    
     public static void main(String[] args) {
         System.out.println("===================Menu============");
         System.out.println(">>1. Giải phương trình bậc  I");
         System.out.println(">>2. Giải phương trình bậc II");
         System.out.println(">>3. Tính tiền điện");
         int suluachon;
         System.out.print("Lựa chọn chức năng");
         Scanner biennhap;
         biennhap = new Scanner(System.in);
         suluachon = biennhap.nextInt();

         switch(suluachon){
             case 1: giaiPTBacI();break;
             case 2: giaiPTBacII();break;
             case 3: tinhTienDien();break;
             default: System.out.println("chọn chức năng khác");
         }
        
    }

   static void giaiPTBacI(){
       float a = 0, b = 0;

       if(a == 0){
           if(b == 0){
               System.out.println("PT vô số nghiệm. . .");
           }

       }
   }
   static void giaiPTBacII(){
       System.out.println("Triển khai code giải phương trình bậc 2 . . .");
   }
   static void tinhTienDien(){
       System.out.println("Triển khai code tính tiền điện . . .");
   }
   
}

    
