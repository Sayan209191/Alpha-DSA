// import java.util.*;
public class FunctionOverLoading{
    // calculate to integer sum  -->
    public static int sum(int a,int b){
        return a+b;
    }
    // calculate to float sum  -->
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String args[]){
        System.out.println(sum(5,7));
        System.out.println(sum(3.25f,9.789f));
    }
}
