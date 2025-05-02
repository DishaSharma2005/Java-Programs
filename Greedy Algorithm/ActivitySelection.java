// To print non overlapping activities 
import java.util.*;
public class ActivitySelection {
    public static void main (String args[])
    {
        int start[]={1,3,0,5,6,5};
        int end[]={2,4,6,7,9,0};
        //sorting 
        int activities[][]=new int [start.length][3];
        // 3 col: 0: idx ,1 :start time ,2:end time 
        for(int i=0;i<start.length;i++)
        {
             activities[i][0]=i;
             activities[i][1]=start[i];
             activities[i][2]=end[i];
        }
        //lamba function ---> Shortform (Notebook expalined )
        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));// will be sorted on basis of 2 column
        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();
        //Ist activity 
        maxAct=1;
        ans.add(activities[0][0]) ;//0 index ki value ko humsha lege 
        int lastEnd=activities[0][2];
        for(int i=1;i<end.length;i++)
        {
            if(activities[i][1]>=lastEnd){
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd=activities[i][2];//updated value of lastEnd
            }
        }
        System.out.println("max Activites ="+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println(" ");
        

    }
}
