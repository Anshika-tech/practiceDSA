//level order traversal by recursion .
class Node{
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
