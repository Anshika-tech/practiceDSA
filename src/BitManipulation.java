//count set bits in a number or number of ones .
import java.util.Scanner;
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
}
