import java.util.ArrayList;
public class ContainterWithMostWater {
    // Flipkart
    // BroutForce Solutions  --> O(n^2)  
    public static int mostWater(ArrayList<Integer> list){
        int maxWater = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                int hight=Math.min(list.get(i),list.get(j));
                int width=j-i;
                int water=hight*width;
                maxWater=Math.max(maxWater, water);
            }
        }
        return maxWater;
    }

    // Optimized Solution using 2 pointer approch --> O(n)
    public static int storeWater(ArrayList<Integer> list){
        int maxWater = 0;
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
            int hight=Math.min(list.get(lp),list.get(rp));
            int width=rp-lp;
            int water=hight*width;
            maxWater=Math.max(maxWater, water); 
            if(list.get(lp)<list.get(rp)){
                lp++;
            } else{
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> container=new ArrayList<>();
        container.add(1);
        container.add(8);
        container.add(6);
        container.add(2);
        container.add(5);
        container.add(4);
        container.add(8);
        container.add(3);
        container.add(7);

        //  most water

        System.out.println(storeWater(container));

        
    }
}
