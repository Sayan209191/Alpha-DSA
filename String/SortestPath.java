public class SortestPath {
    // Calculated sortest path
    public static float calculateSortestPath(String path) {
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            if(dir=='N'){ // move upward 
                y=y+1;
            }
            else if(dir=='S'){ // move downward 
                y=y-1;
            }
            else if(dir=='E'){ // move Right 
                x=x+1;
            }
            else if(dir=='W'){  // move Left
                x=x-1;
            }
            else{
                System.out.println("Invalid Direction !!!");
                break;
            }
        }
        float sorted_route=(float)Math.sqrt((x*x)+(y*y));
        System.out.print("Sotest path : ");
        return sorted_route;
    }
    public static void main(String[] args) {
        String route="WNEENESENNN";
        System.out.println(calculateSortestPath(route));
    }
}
