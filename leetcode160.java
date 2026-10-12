public class leetcode160 {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node getIntersectionNode(Node headA, Node headB) {

        Node a = headA;
        Node b = headB;

        while (a != b) {

            if (a == null) {
                a = headB;
            } else {
                a = a.next;
            }

            if (b == null) {
                b = headA;
            } else {
                b = b.next;
            }
        }

        return a;
    }

    public static void main(String[] args) {

        // Common part
        Node c1 = new Node(8);
        Node c2 = new Node(4);
        Node c3 = new Node(5);

        c1.next = c2;
        c2.next = c3;

        // List A
        Node a1 = new Node(4);
        Node a2 = new Node(1);

        a1.next = a2;
        a2.next = c1;

        // List B
        Node b1 = new Node(5);
        Node b2 = new Node(6);
        Node b3 = new Node(1);

        b1.next = b2;
        b2.next = b3;
        b3.next = c1;

        Node ans = getIntersectionNode(a1, b1);

        if (ans != null) {
            System.out.println("Intersection Node: " + ans.data);
        } else {
            System.out.println("No Intersection");
        }
    }
}