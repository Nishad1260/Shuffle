import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) {
        int[] a = {1,2,3,4,5,6,7};
        int n = a.length;
        Shuffling(a,n);
        
    } 
    static void Shuffling (int a[],int n) {
    int temp;
        Random ran = new Random();
        for(int i = n-1;i>0;i--) {
            int j = ran.nextInt(i+1);
        
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    
        System.out.println(Arrays.toString(a));
 
    }
     
}
