package KiemTraCuoiKi;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.security.PublicKey;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import javax.print.event.PrintEvent;

import tuan6.SanPham;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class SANPHAM {
    String tenhanghoa, loai;
    int soluongtonkho, mahang;
    float gianhap;
    Date ngaynhap;
    static Scanner sc = new Scanner(System.in);
     static List<SANPHAM> SanPham =new ArrayList<>();
     public SANPHAM(String thh, String l, int m, int sltk, float gia, Date nn) {
        this.tenhanghoa = thh;
        this.loai = l;
        this.mahang = m;
        this.soluongtonkho = sltk;
        this.gianhap = gia;
        this.ngaynhap = nn;
    }
    public SANPHAM(){

    }
    
    public String getloai(){
        return loai;
    }
    public void setloai(String l){
        loai = l;
    }
    public void setsoluongtonkho(int sltk){
        soluongtonkho = sltk;
    }
    public String gettenhanghoa(){
        return tenhanghoa;
    }
    public int getmahang(){
        return mahang;
    }
    public void setmahang(int m){
        mahang = m;
    }
    public float getgianhap(){
        return gianhap;
    }
    public Date getngaynhap(){
        return ngaynhap;
    }
    public void setngaynhap(Date nn){
        ngaynhap = nn;
    }
    public void inThongTin(){
        System.out.println("Loại: " + loai + "Tên hàng hóa: " + tenhanghoa + "Mã Hàng: " + mahang + "Số lượng tồn kho: " + soluongtonkho + "Giá nhập hàng: " + gianhap + "Ngày nhập hàng: " + ngaynhap);

    }
    public void NhapDuLieu(){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã hàng hóa: ");
        mahang = sc.nextInt();
        System.out.println("Nhập loại hàng hóa: ");
        loai = sc.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        tenhanghoa = sc.nextLine();
        System.out.println("Nhập số lượng tồn kho: ");
        soluongtonkho = sc.nextInt();
        System.out.println("Nhập giá nhập: ");
        gianhap = sc.nextFloat();
        System.out.println("Nhập ngày nhập kho: ");
        
        
    }

    public void menu(){
        System.out.println("         MENU        ");
        System.out.println("-1===NHẬP DỮ LIỆU===");
        System.out.println("-2===THÊM SẢN PHẨM====");
        System.out.println("-3===TÌM SẢN PHẨM====");
        System.out.println("-4===XÓA SẢN PHẨM===");
        System.out.println("-5=====THỐNG KÊ======");
    }
    
    
    
    public void ThemSanPham(){
        System.out.println("Thêm Sản phẩm");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            SANPHAM sanpham = new SANPHAM();
            ThemSanPham();
            SanPham.add(sanpham);

        }
    }
    public static void timSanPhamTheoLoai(){
        System.out.println("Nhập loại sản phẩm: ");
        String name = sc.nextLine();
        for (SANPHAM Sanpham : SanPham){
            if (name.equals(name)){
                Sanpham.inThongTin();
                break;
            }
        }
    }
    public static void XoaSanPham() {
        sc.nextLine();
        System.out.println("Nhập loại sản phẩm cần xóa: ");
        String name = sc.nextLine();
        for (SANPHAM Sanpham : SanPham) {
            if (name.equals(name)){
                SanPham.remove(name); 
                Sanpham.inThongTin();
                break;
            }
        }   
    }  
}
    

   
        


   
    

    

