import java.util.*;
import java.util.Arrays;
public class FractionalKnapsack {
    public static int knapsack(int val[],int wt[],int w){
        int value=0;
        int capacity=w;
        double ratio[][]=new double[val.length][2];
        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double )wt[i];
        }
        
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));
        for(int i=val.length-1;i>=0;i--){
            int idx=(int)ratio[i][0]; 
            if(capacity >= wt[idx]) {   // include full item
                value+=val[idx];
                capacity-=wt[idx];
            } else {
                value += capacity * ratio[i][1];
                capacity=0;
                break;
            }       
        }
        return value;
    }
    public static void main(String[] args) {
        int value[]={60,100,120};
        int weight[]={10,20,30};
        int W=50;
        System.out.println("Maximum value : "+ knapsack(value, weight, W));
    }
}
