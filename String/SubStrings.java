public class SubStrings {
    // Substring
    public static String subString(String str,int si,int ei){
        String sub_str="";
        for(int i=si;i<ei;i++){
            sub_str+=str.charAt(i);
        }
        return sub_str;
    }
    public static void main(String[] args) {
        String s="helloworld";
        int start=2;
        int end=5;
        System.out.println(subString(s, start, end));
    }
}
