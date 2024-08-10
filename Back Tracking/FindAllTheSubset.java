public class FindAllTheSubset {
    public static void findSubString(String str,String ans,int i){
        // Base case
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        // recursion
        findSubString(str, ans+str.charAt(i), i+1); // choice yes
        findSubString(str, ans, i+1);  // choice no
    }
    public static void main(String[] args) {
        String str="abc";
        findSubString(str,"", 0);
    }
}
