//Insert at Nth position
import java.util.*;
class Main {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        a.next = b;
        b.next = c;
        c.next = d;

        Node newNode = new Node(15);
        Node current = a;
        int position = 1;

        for(int i=0;i<position-1;i++){
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
        current = a;

        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }
   }
}
