package tuan9;

import java.util.Arrays;

public class noibot {
    public static void main(String[] args) {
        int[] mang = new int[]{3,2,4,5,6,10};
        System.out.println("Danh sách phần tử trong mảng ban đầu:" + Arrays.toString(mang));
        bubbleSrot(mang);
        System.out.println("Danh sách phần tử mảng sau khi sấp xếp:" + Arrays.toString(mang));

    }
    static void bubbleSrot(int[] arr){
        int n = arr.length;

        int temp = 0;
        for(int i = 0;i<n;i++){
            for(int j = 1; j < n-1; j++){
                if(arr[j+1]<arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
}
