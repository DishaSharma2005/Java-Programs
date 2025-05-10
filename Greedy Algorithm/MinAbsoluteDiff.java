// Two arrays of same length will be given in which we have to find difference of elements such that they have min sum 
import java.util.*;
public class MinAbsoluteDiff {
    public static void main(String args[]){
    int A[]={2,1,3};
    int B[]={1,2,3};//Expected sum will be zero 
    Arrays.sort(A);
    Arrays.sort(B);
    int minDiff=0;
    for(int i=0;i<A.length;i++)
    {
        minDiff+= Math.abs(A[i]-B[i]);
    }
    System.out.println("Min Absolute difference = "+minDiff);
}
}

