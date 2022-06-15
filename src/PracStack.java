//Implementation of Stack.
/*public class Stack {
    int maxsize;
    long[] arr;
    int top;
    Stack(int s){
        maxsize=s;
        arr=new long[maxsize];
        top=-1;
    }
    void push(long a){
        arr[++top]=a;
    }
    long pop(){
        return arr[top--];
    }
    boolean isEmpty(){
        return top==-1;
    }
    boolean isFull(){
        return top==maxsize-1;
    }
    void peek(){
        System.out.println(arr[top]);
    }
    public static void main(String[] args) {
        Stack sc=new Stack(10);
        sc.push(10);
        sc.push(20);
        sc.push(60);
        sc.push(40);
        sc.push(30);
        sc.peek();
        while(!sc.isEmpty()){
            System.out.print(sc.pop()+" ");
        }

    }
}
*/
//Implementation of two stack in an array.
/*public class Stack{
    int size;
    int top1,top2;
    int arr[];
    public Stack(int n){
        size=n;
        arr=new int[n];
        top1=-1;
        top2=size;
    }
    void push1(int x){
        if(top1<top2-1){
            top1++;
            arr[top1]=x;
        }
        else{
            System.out.println("Stack overflow");
        }
    }
    void push2(int x){
       if(top1<top2-1){
           top2--;
           arr[top2]=x;
       }
       else{
           System.out.println("Stack overflow");
       }
    }
    int pop1(){
        if(top1>=0){
            int x=arr[top1];
            top1--;
            return x;
        }
        else{
            System.out.println("Stack underflow");
        }
        return 0;
    }
    int pop2(){
        if(top2<size){
            int x=arr[top2];
            top2++;
            return x;
        }
        else{
            System.out.println("Stack underflow");
        }
        return 0;
    }

    public static void main(String[] args) {
        Stack obj=new Stack(5);
        obj.push1(5);
        obj.push2(10);
        obj.push2(15);
        obj.push1(11);
        obj.push2(7);
        System.out.println("popped element from stack1 is "+obj.pop1());
        System.out.println("popped element from stack2 is "+obj.pop2());
    }
}*/
//previous smallest element
/*import java.util.*;
public class PracStack{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[8];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        Stack<Integer>s=new Stack<>();
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(-1);
        s.push(a[0]);
        for(int i=1;i<a.length;i++){
            while(!s.empty()&&s.peek()>a[i]){
                s.pop();
            }
            if(!s.empty()){
                arr.add(s.peek());
            }
            else
                arr.add(-1);
            s.push(a[i]);
        }
        System.out.println(arr);
    }
}
*/
//Next greater element
import java.util.*;
public class PracStack{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[8];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        Stack<Integer>s=new Stack<>();
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=a.length-1;i>=0;i--){
            while(!s.empty()&&s.peek()<a[i]){
                s.pop();
            }
            if(!s.empty()){
                arr.add(s.peek());
            }
            else
                arr.add(-1);
            s.push(a[i]);
        }
        for(int i=a.length-1;i>=0;i--) {
            System.out.print(arr.get(i)+" ");
        }
    }
}