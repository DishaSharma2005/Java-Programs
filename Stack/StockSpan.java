//Progarm to calculate span of stock given array Leetcode[Medium] 
//span =i-preHigh;
import java.util.*;
public class StockSpan {
    public static void main(String args[])
    {
        int stocks[]={100,80,60,70,60,85,100};
        int span[]=new int[stocks.length];
        stockSpan(stocks,span);
        // Print span
        for(int i=0;i<span.length;i++)
        {
            System.out.println(span[i]+" ");
        }
    }
    public static void stockSpan(int stocks[],int span[])
    {
        Stack <Integer>s=new Stack<>();
        span[0]=1;
        s.push(0);//stack me zero push karva diya for span Agr curr price se koi chota nhi hai i-0=i hoga
        for(int i=1;i<stocks.length;i++)
        {
            int currPrice=stocks[i];
            while(!s.isEmpty() && currPrice>stocks[s.peek()])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                span[i]=i+1;// Agrr pop karvate stack empty hogya hai toh index +1 (bcz of zero indexing)
            }
            else{
                int prevHigh=s.peek();
                span[i]=i-prevHigh;
            }
            s.push(i);

        }
    }
}
