public class TypePromotion {
    // Type Promotion works only with Expresion
    public static void main(String args[]){
        char ch1='A';
        char ch2='b';
        // System.out.println(ch2-ch1);    // Convert character to Integer
        byte a=5;
        // byte ans=ch1+ch2+a;       // lossy conversion from int to byte
        int ans=ch1+ch2+a;
        System.out.println("The sum is : "+ans);
        int num1=10;
        float num2=25.35f;
        long num3=15;
        double num4=54;
        // int sum=num1+num2+num3+num4;  //lossy conversion from double to int
        // float sum=num1+num2+num3+num4;  //lossy conversion from double to float
        // long sum=num1+num2+num3+num4;  //lossy conversion from double to long
        double sum=num1+num2+num3+num4;  
        System.out.println("The sum is : "+sum);

    }
}
