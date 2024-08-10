public class BinaryStringProblem {
    // Binary String Problem
    // Descritions : - print all binary strings of size n without consecutive 1
    public static void printBinStr(int n, int lastplace, String str){
        // Base Case
        if(n==0){
            System.out.println(str.toString());
            return;
        }
        // if(lastplace==0){
        //     printBinStr(n-1,0,str+("0"));
        //     printBinStr(n-1,1,str+("1"));
        // }
        // else{
        //     printBinStr(n-1,0,str+("0"));
        // }
        printBinStr(n-1,0,str+("0"));
        if(lastplace==0){
            printBinStr(n-1,1,str+("1"));
        }
    }
    public static void main(String[] args) {
        printBinStr(3, 0,"");
    }
}
