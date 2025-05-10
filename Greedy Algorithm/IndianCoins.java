// 590=500+50+20+20[ Rupess=start with biggest note and repeat is also possible till amount ]
import java.util.*;
public class IndianCoins {
    public static void main(String args[])
    {
        Integer coins[]={500,100,50,20,10,5,2,1};
        Arrays.sort(coins,Comparator.reverseOrder());
        int amount=590;
        int countofCoins=0;
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<coins.length;i++)
        {
            while(coins[i]<=amount)
            {
                countofCoins++;
                ans.add(coins[i]);
                amount =amount- coins[i];
            }
        }
        System.out.println("total coins used minimum ="+countofCoins);
       for(int i=0;i<ans.size();i++)
       {
        System.out.println(ans.get(i)+" ");
       }
       System.out.println(" ");
    }
}
