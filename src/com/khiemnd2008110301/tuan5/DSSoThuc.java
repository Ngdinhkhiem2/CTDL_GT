package tuan5;


import java.util.ArrayList;
import java.util.Scanner;

public class DSSoThuc {
    private ArrayList<Double> list = new ArrayList<>();

    public void nhap(){
        System.out.println("Nhập danh sách các số thực: ");
        Scanner sc = new Scanner(System.in);
        int yes = 1;
        list.clear();
        do {
            System.out.println("Nhập số thực: ");
            double num = sc.nextDouble();
            list.add(num);

            System.out.println("Bạn có muốn tiếp tục ? (1: tiếp, 0: thoát):");
            yes = sc.nextInt();

        }while ( yes == 1);
    }
    public void hienThi(){
        System.out.println("===============");
        for (Double item : list){
            System.out.println(" "+ item);
        }
        System.out.println();
    }
    public void tinhTong(){
        double sum = 0;
        for (Double item : list) {
            sum += item;
        }
        System.out.println("Tổng là: " + sum);
    }

}
    

