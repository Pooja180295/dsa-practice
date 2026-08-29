//Find Length of Linked List
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

        a.next = b;
        b.next = c;

        Node current = a;
        int count = 0; //find lenght of LL

        while(current!=null){
            System.out.println(current.data);
            current = current.next;
            count++;
        }

        System.out.println(count);

    }
}
