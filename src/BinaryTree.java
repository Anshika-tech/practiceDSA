//level order traversal by recursion .
//Method 1
/*class Node{
    int data;
    Node left,right;
    public Node(int x){
        data=x;
    }
}
public class BinaryTree {
    Node root;
    void printLevel(){
        int h=height(root);
        for(int i=1;i<=h;i++){
            printCurrentLevel(root,i);
        }
    }
    int height(Node root){
        if(root==null)
            return 0;
        int leftheight=height(root.left);
        int rightheight=height(root.right);
        if(leftheight>rightheight){
            return leftheight+1;
        }
        else
            return rightheight+1;
    }
    void printCurrentLevel(Node root,int level){
        if(root==null)
            return;
        if(level==1){
            System.out.print(root.data+" ");
        }
        else if(level>1){
            printCurrentLevel(root.left,level-1);
            printCurrentLevel(root.right,level-1);
        }
    }

    public static void main(String[] args) {
        BinaryTree obj=new BinaryTree();
        obj.root=new Node(1);
        obj.root.left=new Node(2);
        obj.root.right=new Node(3);
        obj.root.left.left=new Node(4);
        obj.root.left.right=new Node(5);
        System.out.println("level order traversal of binary tree : ");
        obj.printLevel();
    }
}
*/
//Method 2
// level order traversal by queue.
/*import java.util.*;
class Node{
    int data;
    Node left,right;
    public Node(int x){
        data=x;
    }
}
public class BinaryTree{
    Node root;
    void printLevel(){
        Queue<Node>q=new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp=q.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
    }
    public static void main(String[] args) {
        BinaryTree obj=new BinaryTree();
        obj.root=new Node(1);
        obj.root.left=new Node(2);
        obj.root.right=new Node(3);
        obj.root.left.left=new Node(4);
        obj.root.left.right=new Node(5);
        System.out.println("level order traversal of binary tree : ");
           obj.printLevel();
    }

}*/
//Reverse level order traversal in binary tree
/*import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int x){
        data=x;
    }
}
public class BinaryTree{
    Node root;
    void reverse_level(){
        Queue<Node>q=new LinkedList<>();
        Stack<Node>s=new Stack<Node>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp=q.poll();
            s.push(temp);
            if(temp.right!=null){
                q.add(temp.right);
            }
            if(temp.left!=null){
                q.add(temp.left);
            }
        }
        while(!s.empty()){
            Node t=s.peek();
            System.out.print(t.data+" ");
            s.pop();
        }
    }
    public static void main(String[] args) {
        BinaryTree obj=new BinaryTree();
        obj.root=new Node(1);
        obj.root.left=new Node(2);
        obj.root.right=new Node(3);
        obj.root.left.left=new Node(4);
        obj.root.left.right=new Node(5);
        obj.reverse_level();
    }
}*/
//diameter of binary tree.
class Node{
    int data;
    Node left,right;
    public Node(int x){
        data=x;
    }
}
public class BinaryTree{
    static Node root;
    static int ans=0;
    int diameter(Node root){
        if(root==null)
            return 0;
        int rootleft=diameter(root.left);
        int rootright=diameter(root.right);
        ans=Math.max(ans,1+rootleft+rootright);
        return 1+Math.max(rootleft,rootright);
    }
    public static void main(String[] args) {
        BinaryTree obj=new BinaryTree();
        root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(7);
        obj.diameter(root);
        System.out.println(ans);
    }
}