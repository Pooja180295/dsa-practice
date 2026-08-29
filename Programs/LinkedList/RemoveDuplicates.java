//Remove Duplicates
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

        Node a = new Node(1);
        Node b = new Node(1);
        Node c = new Node(2);
        Node d = new Node(2);
        Node e = new Node(3);
        Node f = new Node(4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        Node current = a;
        while(current!=null && current.next!=null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            }
            current = current.next;
        }

        current = a;

        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }
   }
}
