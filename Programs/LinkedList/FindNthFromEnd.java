//Find Nth element from the end - find 2nd node from end
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
        Node e = new Node(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node slow = a;
        Node fast = a;
        int n = 2;

        //Create a gap of n
        for(int i=0;i<n;i++){
            fast = fast.next;
        }

        //Move both
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }

        System.out.println(slow.data);
   }
}
