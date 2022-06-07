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
public class BitManipulation{
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
