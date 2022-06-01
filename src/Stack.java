//Implementation of Stack.
public class Stack {
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
