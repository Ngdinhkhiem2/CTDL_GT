package KiemTraCuoiKi;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class MainSANPHAM {
    static SANPHAM SanPham = new SANPHAM();
    static Scanner khoHangHoa = new Scanner(System.in);
    public static void main(String[] args) {
        do {
            SanPham.menu();
            System.out.println("Nhập Lựa Chọn Của bạn: ");
            int n = khoHangHoa.nextInt();
           switch (n) {
                case 1:
                SanPham.NhapDuLieu();
                break;
                case 2:
                SanPham.ThemSanPham();
                break;
                case 3:
                SanPham.timSanPhamTheoLoai();
                break;
                case 4:
                SanPham.XoaSanPham();
               
                
               default: System.out.println("ERROR!!!");
                   break;
           }
        } while (true);
        
    }
    
    
}
