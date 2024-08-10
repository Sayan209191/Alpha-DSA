public class TrilingProblem {
    // Triling Problem (Amazon)
    public static int getTriling(int n){ // "2 * n"
        // Base Case 
        if(n==0 || n==1){
            return 1;
        }
        // Choice 1 --> Vertical Choice
        // int vertical=getTriling(n-1);
        // Choice 2 --> Horizontal Choice
        // int horizontal=getTriling(n-2);
        return getTriling(n-1)+getTriling(n-2);
    }
    public static void main(String[] args) {
        int area=4;
        System.out.println("Total no of Ways : "+getTriling(area));
    }
}
