import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class implement {  // Class name should start with uppercase
    Node root;

    // Insert node level-wise
    public void insert(int data) {
        Node newNode = new Node(data);

        // If tree is empty, new node becomes root
        if (root == null) {
            root = newNode;
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();

            if (temp.left == null) {
                temp.left = newNode;
                return;
            } else {
                q.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = newNode;
                return;
            } else {
                q.add(temp.right);
            }
        }
    }

    // Inorder Traversal: Left -> Root -> Right
    public void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // Preorder Traversal: Root -> Left -> Right
    public void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // Postorder Traversal: Left -> Right -> Root
    public void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    // Level-order Traversal (BFS)
    public void levelOrder() {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null) q.add(temp.left);
            if (temp.right != null) q.add(temp.right);
        }
    }
    public int height(Node node){
        if(node==null) return 0;
        return 1+Math.max(height(node.left),height(node.right));
    }
    public int countNodes(Node node){
        if(node==null) return 0;
        return 1+countNodes(node.left)+countNodes(node.right);
    }
  public int countLeaves(Node node){
    if(node==null) return 0;
    if(node.left==null && node.right==null) return 1;
    return countLeaves(node.left)+countLeaves(node.right);
  }
  public boolean search(Node node,int key){
    if(node==null) return false;
    if(node.data==key) return true;
    return search(node.left, key) || search(node.right, key);
  }
    // Main method
    public static void main(String[] args) {
        implement tree = new implement();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(60);
        tree.insert(70);

        System.out.println("Inorder Traversal:");
        tree.inorder(tree.root);

        System.out.println("\nPreorder Traversal:");
        tree.preorder(tree.root);

        System.out.println("\nPostorder Traversal:");
        tree.postorder(tree.root);

        System.out.println("\nLevel Order Traversal:");
        tree.levelOrder();
    }
}
