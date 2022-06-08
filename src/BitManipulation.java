import java.util.HashSet;

//count set bits in a number or number of ones .
/*import java.util.Scanner;
public class BitManipulation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        while(n!=0){
            c++;
            n=n&n-1;
        }
        System.out.println("number of ones "+c);
    }
}*/
//Find the two non-repeating elements in an array of repeating elements
/*public class BitManipulation{
    public static void main(String[] args) {
        int[] arr=new int[]{2,11,3,11,7,3,9,2};
        int s=0;
        for(int i=0;i<arr.length;i++){
            s=s^arr[i];
        }
        s=s&-s;
        int s1=0;
        int s2=0;
        for(int i=0;i<arr.length;i++){
            if((arr[i]&s)>0){
                s1=s1^arr[i];
            }
            else{
                s2=s2^arr[i];
            }
        }
        System.out.println("two non repeating elements are:  "+s1 +" "+s2);
    }
}

//by using map.
import java.util.*;
public class BitManipulation{
    public static void main(String[] args) {
        int[] arr=new int[]{2,11,3,11,7,3,9,2};
        TreeMap<Integer,Integer>m=new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            if(m.containsKey(arr[i])){
                m.remove(arr[i]);
            }
            else{
                m.put(arr[i],1);
            }
        }
        System.out.println("Non repeating elements: "+m.firstKey()+" "+m.lastKey());
    }
}*/
//Count number of bits to be flipped to convert A to B
/*public class BitManipulation{
    public static void main(String[] args) {
        int a=20;
        int b=10;
        int n=a^b;
        int c=0;
        while(n!=0){
            c++;
            n=n&n-1;
        }
        System.out.println(c+" bits to be flipped to convert a to b");
    }
}
*/
//Program to find whether a no is power of two
/*public class BitManipulation{
    //1 method
    static boolean power(int x){
        return x!=0 && ((x&x-1)==0);
    }
    //2 method
    static boolean powerof2(int x){
        return (int)(Math.ceil((Math.log(x)/Math.log(2))))==(int)(Math.floor((Math.log(x)/Math.log(2))));
    }
    public static void main(String[] args) {
        System.out.println(power(31));
        System.out.println(power(64));
        System.out.println(power(98));
        System.out.println(power(1));
        System.out.println(powerof2(32));
        System.out.println(powerof2(38));
        System.out.println(powerof2(4));
    }
}*/
//program to find the position of set bit.
//if there is only one set bit then find the position of that set bit,if there are more than one set bit return -1.
import java.util.Scanner;
public class BitManipulation {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       //if number is power of 2 then only one set bit exist.
       if(N!=0&&(N&N-1)==0){
           int n=1;
           int c=N;
           while(c!=1){
               n++;
               c=c>>1;
           }
           System.out.println("position of set bit is "+n);
       }
       else {
           System.out.println("-1");
       }
    }
}