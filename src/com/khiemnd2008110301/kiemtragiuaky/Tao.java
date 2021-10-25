package kiemtragiuaky;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Tao {
     String mausac;
     int ma;
     float khoiluong;
     Scanner sc = new Scanner(System.in);
     static List<Tao> tao1 =new ArrayList<>();
     public Tao(String mausac, int ma, float khoiluong) {
        this.mausac = mausac;
        this.ma = ma;
        this.khoiluong = khoiluong;
    }

    Tao(){}

    public void menu(){
        System.out.println("---------MENU--------");
        System.out.println("-1------TẠO DANH SÁCH-----");
        System.out.println("-2-----THÊM TÁO------");
        System.out.println("-3------TÌM TÁO------");
        System.out.println("-4------IN DANH SÁCH TÁO------");
        System.out.println("-------THOÁT------");

    }
    public void inNhapThongTin(){
        System.out.println("Nhập ID Táo: ");
        ma = sc.nextInt();
        System.out.println("Nhập khối lượng Táo: ");
        khoiluong = sc.nextFloat();
        sc.nextLine();
        System.out.println("Nhập màu sắc của Táo: ");
        mausac = sc.nextLine();

    }

    public void inDanhSachTao(){
        System.out.println("------DANH SACH TÁO------");
        System.out.printf("%-20S %-20S %-20S\n", "mã táo", "khối lượng táo", "màu sắc táo");

    }


    public void themTao(){
        System.out.println("Thêm TÁO");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            Tao tao = new Tao();
            themTao();
            tao1.add(tao);
        }
    }

    public void Tim(){
        System.out.println("Thêm màu muốn tìm: ");
        String name = sc.nextLine();
        for(Tao tao : tao1){
            if(name.equals(tao.mausac)){
                
            }
        }
    }
     


    
}
