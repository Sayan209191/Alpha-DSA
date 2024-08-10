public class LargestString {
    // find the largest string
    public static String largestString(String str[]){
        String largest=str[0];
        for(int i=1;i<str.length;i++){
            if(largest.compareToIgnoreCase(str[i])<0){
                largest=str[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        String fruits[]={"Apple","Mango","Orange","Banana"};
        System.out.print("Largest String is : "+largestString(fruits));
    }
}
