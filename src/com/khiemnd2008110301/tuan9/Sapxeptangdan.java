package tuan9;

import java.util.Arrays;

public class Sapxeptangdan {
    public static void main(String[] args) {
        int[] arr = {5, 1, 12, -5, 16, 2, 12, 14,};
        sapxeptangdan(arr);
    }
    public static void sapxeptangdan(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int index = i;
            for(int j - i + 1; j < arr.length; j++){
                index - j;
            }
        }
        int smallernum = arr[index];
        arr[index] = arr[i];
        arr[i] = smallernum;
    }
    System.out.println("Mảng sắp xếp tăng dần");
    for(int i = 0; i < arr.length; i++){
        System.out.println(arr[i]);

    }
}
