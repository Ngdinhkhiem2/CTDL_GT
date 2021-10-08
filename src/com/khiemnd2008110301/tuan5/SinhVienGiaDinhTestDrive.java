package tuan5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SinhVienGiaDinhTestDrive {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<SinhVienGiaDinh> sinhVienGiaDinhs = new ArrayList<>();

    public static void main(String[] args) {

        do {
            menu();
            System.out.println("Nhập Lựa Chọn:");
            int n = sc.nextInt();
           switch (n) {
                case 0:
                break;
                case 1:
                nhapDanhSach();
                break;
                case 2:
                xuatDanhSachSinhVien();
                break;
                case 3:
                timSinhVienTheoHoTen();
                break;
                case 4:
                timVaXoaSinhVienTheoHoTen();
                break;
                case 5:
                
               default: System.out.println("ERROR!!!");
                   break;
           }
        } while (true);
    }
    private static void menu()
    {
        System.out.println("-------------------MeNu chương trình----------------- ");
        System.out.println("1 -------------------Nhập Sinh Viên-------------------");
        System.out.println("2 --------------Xuất Thông Tin Sinh viên-------------------");
        System.out.println("3 ---------Xuất Danh Sách Sinh Viên Theo Điểm-----");
        System.out.println("4 ---------------Tìm Sinh Viên Theo Tên------------");
        System.out.println("0                       *THE END*                   ");
    }
    private static void nhapDanhSach(){
        System.out.println("Nhập số lượng sinh viên muốn thêm: ");
        int n = sc.nextInt();
        System.out.println("Nhập danh sách sinh viên: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên thứ "+ (i+1));
            SinhVienGiaDinh sinhVienGiaDinh = new SinhVienGiaDinh();
            sinhVienGiaDinh.nhapThongTin();
            sinhVienGiaDinhs.add(sinhVienGiaDinh);
        }
    }
    public static void xuatDanhSachSinhVien() {
        int i = 1;

        System.out.println("==========Thông Tin Sinh Viên=========");
        for (SinhVienGiaDinh sinhVienGiaDinh: sinhVienGiaDinhs) {
            System.out.println("Sinh Viên Thứ " + i);
            sinhVienGiaDinh.inThongTin();
            i++;
        }
    }
    
    public static void timSinhVienTheoHoTen() {
        sc.nextLine();
        System.out.println("Nhập họ tên: ");
        String name = sc.nextLine();
        for (SinhVienGiaDinh sinhVienGiaDinh : sinhVienGiaDinhs){
            if (name.equals(name)){
                sinhVienGiaDinh.inThongTin();
                break;
            }
        }   

    }
    public static void timVaXoaSinhVienTheoHoTen() {
        sc.nextLine();
        System.out.println("Nhập họ tên cần tìm và xóa: ");
        String name = sc.nextLine();
        for (SinhVienGiaDinh sinhVienGiaDinh : sinhVienGiaDinhs) {
            if (name.equals(name)){
                sinhVienGiaDinhs.remove(name); 
                sinhVienGiaDinh.inThongTin();
                break;
            }
        }     
    }
    
}     

    

