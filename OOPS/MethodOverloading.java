public class MethodOverloading {
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        System.out.println(c1.sum(5, 7));
        System.out.println(c1.sum((float)5.2, (float)7.6));
        System.out.println(c1.sum(5, 7,9));
    }
}
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}