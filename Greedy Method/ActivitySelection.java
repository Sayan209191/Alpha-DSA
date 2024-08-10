import java.util.*;
import java.util.Arrays;
public class ActivitySelection {
    // If end time sorted and return only maximum activity -> 
    // TC - O(n) & SC - O(1)

    public static int maximumActivity(int start[],int end[]){
        int count=0;

        // 1st activity -> 
        count=1;
        int lastEnd=end[0];
        for(int i=1;i<end.length;i++){
            if(start[i]>=lastEnd){
                count++;
                lastEnd=end[i];
            }
        }

        return count;
    }

    // If end time not sorted --> Tc -> O(nlog(n))
    // if we need which activities are performed  -> SC - O(n^2 )

    public static ArrayList<Integer> maxActivity(int start[],int end[]){
        ArrayList <Integer> ans = new ArrayList<>();
        int maxAct=1;
        // Sorting 
        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));

        ans.add(activities[0][0]);
        int lastEnd=activities[0][2];
        for(int i=1;i<start.length;i++){
            if(activities[i][1]>=lastEnd){
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd=activities[i][2];
            }
        }
        System.out.println("Maximum Activity : "+ maxAct);
        return ans;    
    }


    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        // System.out.println("Maximum Activity : "+ maximumActivity(start, end));
        ArrayList<Integer> res=maxActivity(start, end);
        for(int i=0;i<res.size();i++){
            System.out.print("A"+res.get(i)+" ");
        }
        System.out.println();
    }
}
