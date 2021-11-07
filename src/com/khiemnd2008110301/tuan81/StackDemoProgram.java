package tuan81;

import java.util.Stack;

public class StackDemoProgram {
    public static void main(String[] args) {
        
        Stack<String> stack;

        stack = new Stack();
        stack.push("Welcome");
        stack.push("To");
        stack.push("Data Structure and Algotitlim");

        System.out.println(stack);
        String poped = stack.pop();
        System.out.println("Đã lấy ra từ danh sách " + poped);
        System.out.println("Phần tử còn lại của stack");
        System.out.println(stack);

        String phanTuDuocThem = stack.peek();
        System.out.println("Thêm phần tử đỉnh: " + phanTuDuocThem);
        System.out.println(stack);

        
    }
    
}
