class Node {
    int data;
    Node next;

    Node(int data1) {
        data = data1;
        next = null;
    }
}

class Solution {
    public Node deleteLast(Node head) {
        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }
        
        temp.next = null;
        return head;
    }
}

public class Main {
    public static void main(String[] args) {

        // 1 -> 2 -> 3
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        // 1 -> 2
        Solution sol = new Solution();
        head = sol.deleteLast(head);

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
