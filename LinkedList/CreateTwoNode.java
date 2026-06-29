class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CreateTwoNode {
    public static void main(String[] args) {

        Node head = new Node(10);
        Node secound = new Node(20);

        head.next = secound;

        System.out.println(head.data);
        System.out.println(head.next.data);
    }
}