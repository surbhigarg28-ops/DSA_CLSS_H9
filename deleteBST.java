import java.util.LinkedList;
import java.util.Queue;

public class deleteBST{
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
        }
    }
    public static Node  insert(Node node,int key){
        if(node==null){
         return new Node(key);
        }
        if(key<node.val){
node.left=insert(node.left,key);
        }else if(key>node.val){
            node.right=insert(node.right, key);
        }
        return node;
    }
    public static void inorder(Node node){
        if(node==null) return;
        inorder(node.left);
        System.out.print(node.val+" ");
        inorder(node.right);
    }
    public static void postorder(Node node){
        if(node==null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.val+" ");
    }
    public static void preorder(Node node){
        if(node==null) return;
        System.out.print(node.val+" ");
        preorder(node.left);
        preorder(node.right);
    }
    public static void levelorder(Node node){
        if(node==null){
            return;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            Node curr=q.poll();
            System.out.print(curr.val+" ");
            if(curr.left!=null){
                q.add(curr.left);
            }
             if (curr.right!=null){
                q.add(curr.right);
            }
        }

    }
    public static void delete(Node node,int target){
      if(node==null) return;
      if(node.val>target){
        if(node.left==null) return;
        if(node.left.val==target){
            Node temp=node.left;
            if(temp.left==null && temp.right==null){
                node.left=null;
            }
            else if(temp.left==null && temp.right!=null){
                node.right=temp.left;
            }else if(temp.left!=null && temp.right==null){
                node.left=temp.left;
            }
        }else{
            delete(node.left, target);
        }
      }
      else if(node.val<target){
        if(node.right==null) return;
        if(node.right.val==target){
            Node temp = node.right;
            if(temp.left==null && temp.right==null){
                node.right=null;
            }
            else if(temp.left==null && temp.right!=null){
                node.right=temp.left;
            }else if(temp.left!=null && temp.right==null){
                node.right=temp.left;
            }
        }else{
            delete(node.right, target);
        }
      }
        
    }
    public static void main(String[] args) {
        Node node=null;
        int[] values={8,3,10,1,6,14,4,7,13};
        for(int val:values){
            node=insert(node, val);
        }
        System.out.println("Inorder Transversal:");
        inorder(node);

        System.out.println("Preorder Transversal:");
        preorder(node);
        
        System.out.println("Postorder Transversal:");
        postorder(node);

        System.out.println("Levelorder transversal");
        levelorder(node);

        // delete(node, 7);
        // System.out.print("after deletion ");
        // preorder(node);
            delete(node,6 );
        System.out.print("after deletion ");
        preorder(node);
        
    
    }
}