class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

 class Main {
    public static void main(String[] args) {

       Node head = new Node(10);
       Node tail = head;

       tail.next  = new Node(20);
       tail = tail.next;

       tail.next = new Node(30);


        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
    }
}