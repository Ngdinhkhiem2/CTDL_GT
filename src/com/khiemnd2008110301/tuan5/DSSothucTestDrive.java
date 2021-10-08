package tuan5;

import java.util.Scanner;

public class DSSothucTestDrive {
    public static void main(String[] args) {
        DSSoThuc ds = new DSSoThuc();
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("------Menu Chương Trình-----");
            System.out.println("1 ------Nhập Danh Sách----");
            System.out.println("2 ----Hiển thị Danh Sách----");
            System.out.println("3 --------Tính Tổng-----");
            System.out.println("0 ----------Thoát-----");

            System.out.println("Lựa chọn của bạn là: ");

            choice = sc.nextInt();
            if(choice != 0){
                switch(choice){
                    case 0:
                    System.exit(0);
                    case 1:
                    ds.nhap();
                    break;
                    case 2:
                    ds.hienThi();
                    break;
                    case 3:
                    ds.tinhTong();
                    break;
                    default:
                    System.out.println("Error!!! Xin mời nhập lại");
                }
            }
        } while (choice != 0);

        System.out.println("====THE END====");
    }

}
