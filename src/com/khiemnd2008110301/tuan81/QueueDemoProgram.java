package tuan81;

import java.util.Queue;
import java.util.LinkedList;

public class QueueDemoProgram {
    public static void main(String[] args) {
        Queue<Integer> queue;
        queue = new LinkedList<>();
        queue.add(8);
        queue.add(10);
        queue.add(2);

        System.out.println(queue);
        int phantuDuocLayRa = queue.remove();

        System.out.println("Phần tử được lấy ra từ Queue " + phantuDuocLayRa);
        System.out.println("Phần tử còn lại trong Queue");
        System.out.println(queue);

        int phanDuocTham = queue.peek();
        System.out.println("Phần tử vừa được thăm " + phanDuocTham);
        System.out.println("Phần tử còn lại trong queue sau thăm");
        System.out.println(queue);



    }
    
}
