//Rearrange an array such that arr[i] = i
import java.util.*;
public class Array{
    public static int[] fix(int[] a){
        Set<Integer>s = new HashSet<Integer>();
        for(int i=0;i<a.length;i++){
            s.add(a[i]);
        }
        for(int i=0;i<a.length;i++){
            if(s.contains(i))
                a[i]=i;
            else
                a[i]=-1;
        }
        return a;
    }
    public static void main(String[] args) {
        int a[]={-1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
        System.out.println(Arrays.toString(fix(a)));
    }
}
