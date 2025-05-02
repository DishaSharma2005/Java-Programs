import java.util.*;
public class FractionalKnapsack {
    public static void main(String args[])
    {
        int val[]={60,100,120};
        int weight[]={10,20,30};
        int w=50;
        double ratio[][]=new double[val.length][2];// 0 col:index 1:ratio
        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;//index store hogya 
            ratio[i][1]=val[i]/(double) weight[i];//ratio store hogya 
        }

            //Ascending order 
            Arrays.sort(ratio,Comparator.comparingDouble( o -> o[1]));
            int capacity=w;
            int finalVal=0;
            for(int i=ratio.length-1;i>=0;i--)//desecnding order me chalega 
            {
                int idx=(int)ratio[i][0];//idx=ratio[2][0]
                if(capacity>=weight[i])
                {
                    finalVal+=val[idx];
                    capacity-=weight[idx];
                }
                else{// for fractional part eg:80
                      finalVal+=(ratio[i][1]*capacity);
                      capacity=0;
                      break;
                }
            }
          System.out.println(finalVal);
        }
    }

