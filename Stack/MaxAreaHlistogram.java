import java.util.*;
public class MaxAreaHlistogram {
    public static void main(String args[])
    {
        int arr[]={2,4};
        maxArea(arr);
    }
    public static void maxArea(int arr[])
    {
        int maxArea=0;
        int nsr[]=new int [arr.length];
        int nsl[]=new int [arr.length];
        Stack<Integer> s= new Stack<>();
        //Right me smallest 
        for(int i =arr.length-1;i>=0;i--)
        {
            while(!s.isEmpty() && arr[s.peek()]>=arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nsr[i]=arr.length;// length ke barabar show ho jayega 
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        s=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while(!s.isEmpty() && arr[s.peek()]>=arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nsl[i]=-1;
            }
            else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        for(int i=0;i<arr.length;i++)
        {
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=height*width;
            maxArea=Math.max(currArea,maxArea);
        }
        System.out.println("Max area under histogram = "+maxArea);
        }
    }
