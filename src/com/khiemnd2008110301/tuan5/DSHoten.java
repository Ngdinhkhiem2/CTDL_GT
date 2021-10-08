package tuan5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DSHoten {
    static Scanner sc = new Scanner(System.in);
    private ArrayList<String> list = new ArrayList<>();

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập họ tên: ");
            String st = sc.nextLine();

            if(st.isEmpty()){
                break;

            }
            list.add(st);
        } while (true);
    }
    public void xuat() {
        System.out.println("Danh Sách Họ Tên: ");
        for (String item : list) {
            System.out.println("Họ Tên: " +item);

        }

    }
    public void sapXep() {
        Collections.sort(list,(a,b)-> a.compareTo(b));
        xuat();

    }
    
    public void hienThi() {
        do {
            System.out.println("-------Menu của chương trình--------");
            System.out.println("1.--------Nhập danh sách------------");
            System.out.println("2.------Hiện thị danh sách----------");
            System.out.println("3.-------Sắp xếp danh sách-----------");
            System.out.println("4.------Thoát chương trình-----------");
            System.out.println("Lựa chọn của bạn là: ");
            int choice  = sc.nextInt();

            switch(choice)  {
                case 1:
                nhap();
                break;
                case 2:
                xuat();
                break;
                case 3:
                sapXep();
                break;
                case 4:
                System.exit(0);
                break;
            }
        } while (true);





    }

    
}
