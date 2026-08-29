//Insert element at last
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

        Node current = a;
        Node newNode = new Node(50);

        while(current.next!=null){
            current = current.next;
        }
        current.next = newNode;
        current = a;

        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }

   }
}
