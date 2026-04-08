class Node {
    int data;
    Node next;

    Node(int data1) {
        data = data1;
        next = null;
    }
}

class Solution {
    public int lengthOfList(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 1 -> 2 -> 3
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);   

        System.out.println(sol.lengthOfList(head));
    }
}
