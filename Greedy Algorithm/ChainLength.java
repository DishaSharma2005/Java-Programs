//every pair :first no>second no , Max length chain which can be formed of given pair which is non repeating (disjoint in nature )
import java.util.*;
public class ChainLength{
    public static void main(String args[])
    {
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));//Second Time ke base par sort hoge 
        int chainLen=1;//first vala always selected isliye start length=1
        int chainEnd=pairs[0][1];
        for(int i=1;i<pairs.length;i++)
        {
            if(pairs[i][0]>chainEnd){
                chainLen++;
                chainEnd=pairs[i][1];
            }
        }
        System.out.println("Max length of chain ="+chainLen);
    }
}

