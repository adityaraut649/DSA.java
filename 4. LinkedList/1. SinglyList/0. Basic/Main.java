// create a linked list
// 1. Create a class Node
class Node {
  int data;
  Node next;

  Node(int d) {
    this.data = d;
    this.next = null;
  }
}

public class Main {
  public static void main(String[] args) {

    Node head = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);
    Node fourth = new Node(4);
    Node fifth = new Node(5);

    head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;

    Node temp = head;
    while (temp.next != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

}