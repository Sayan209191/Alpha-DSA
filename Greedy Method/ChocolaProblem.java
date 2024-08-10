import java.util.Arrays;
import java.util.Collections;
public class ChocolaProblem {
    // Min Cost to Cut Board into Squars
    public static int minCost(Integer hor[] , Integer ver[]) {
        Arrays.sort(hor,Collections.reverseOrder());
        Arrays.sort(ver,Collections.reverseOrder());
        int h=0 , v=0;
        int hp=1 , vp=1;
        int cost=0;
        while(h<hor.length && v<ver.length) {
            if(hor[h] <= ver[v]) {  // vertical cut
                cost+=(hp*ver[v]);
                vp++;
                v++;
            } else {  // horizontal cut
                cost+=(vp*hor[h]);
                hp++;
                h++;
            }
        }
        while(h<hor.length) { //  remaining horizontal cut
            cost+=(vp*hor[h]);
            hp++;
            h++;
        } 
        while(v<ver.length) {  // remaining vertical cut
            cost+=(hp*ver[v]);
            vp++;
            v++;
        }
        return cost;
    }
    public static void main(String[] args) {
        int n=4 , m=6;
        Integer costHor[] = {4,1,2};
        Integer costVert[]= {2,1,3,1,4};
        System.out.println("Min cost : "+ minCost(costHor, costVert));
    }
}


// import java.util.Arrays;
// import java.util.Comparator;

// public class ChocolaProblem {
//     // Min Cost to Cut Board into Squares
//     public static int minCost(int hor[] , int ver[]) {
//         Arrays.sort(hor);
//         Arrays.sort(ver);
//         int h=hor.length-1 , v=ver.length-1;
//         int hp=1 , vp=1;
//         int cost=0;
//         while(h>=0 && v>=0) {
//             if(hor[h] >= ver[v]) {  // horizontal cut
//                 cost+=(hp*hor[h]);
//                 vp++;
//                 h--;
//             } else {  // vertical cut
//                 cost+=(vp*ver[v]);
//                 hp++;
//                 v--;
//             }
//         }
//         while(h>=0) { //  remaining horizontal cut
//             cost+=(vp*hor[h]);
//             hp++;
//             h--;
//         } 
//         while(v>=0) {  // remaining vertical cut
//             cost+=(hp*ver[v]);
//             vp++;
//             v--;
//         }
//         return cost;
//     }

//     public static void main(String[] args) {
//         int n=4 , m=6;
//         int costHor[] = {4,1,2};
//         int costVert[]= {2,1,3,1,4};
//         System.out.println("Min cost : "+ minCost(costHor, costVert));
//     }
// }
