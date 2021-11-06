package tuan7;

public class MLinkedListTestDrive {
        public static void main(String[] args) {
    
            MLinkedList myLinkedList = new MLinkedList();
            myLinkedList.add(4);
            myLinkedList.add(3);
            myLinkedList.add(8);
            myLinkedList.push(1);
            myLinkedList.removeFist(1);
            myLinkedList.removeLast(8);
    
    
            myLinkedList.print();
    
        }
    }
    

