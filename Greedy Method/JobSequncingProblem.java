import java.util.*;
import java.util.Collections;
public class JobSequncingProblem {
    static class Job{
        int id;
        int profit;
        int deadline;
        public Job(int i , int d, int p){
            id=i;
            profit = p;
            deadline = d;
        } 
    }
    public static ArrayList<Integer> maxJobs(int jobsInfo[][]){
        ArrayList<Job> jobs = new ArrayList<>();
        for(int i=0; i<jobsInfo.length;i++){
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }
        Collections.sort(jobs,(obj1 , obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> ans = new ArrayList<>();
        int time=0;
        for(int i=0; i<jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                ans.add(curr.id);
                time++;
            }       
        }
        System.out.println("Max Jobs are performed : "+ ans.size());
        return ans;
    }
    public static void main(String[] args) {
        int jobs[][] = {{4,20},{1,30},{1,40},{1,20}};
        System.out.println("The jobs are performed : "+ maxJobs(jobs));
    }
}
