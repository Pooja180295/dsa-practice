//Merge 2 sorted linked lists
//Time Complexity: O(m+n)
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
        //First linked list
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);

        a.next = b;
        b.next = c;

        //Second linked list
        Node d = new Node(2);
        Node e = new Node(4);
        Node f = new Node(6);

        d.next = e;
        e.next = f;

        //Take two pointers
        Node p1 = a; //first element of 1st linked list
        Node p2 = d; //first element of second linked list

        Node dummy = new Node(0);
        Node current = dummy;

        while(p1!=null && p2!=null){
            if(p1.data<p2.data){
                current.next = p1;
                p1 = p1.next;
            } else {
                current.next = p2;
                p2 = p2.next;
            }
            current = current.next;
        }

        //Attach the remaining nodes
        if(p1!=null){
            current.next = p1;
        } else {
            current.next = p2;
        }

        Node head = dummy.next;
        current = head;

        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }
   }
}
