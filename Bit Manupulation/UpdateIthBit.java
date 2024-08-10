public class UpdateIthBit {
    // Set i'th bit
    public static int setIthBit(int num,int i){
        int bitmask=1<<i;
        return num | bitmask;
    }
    // Clear i'th bit
    public static int clearIthBit(int num,int i) {
        int bitmask=~(1<<i);
        return num & bitmask;
    }
    public static int updateIthBit(int num,int i,int newbit){
        // Approch - 1 
        if(newbit==0){
            return clearIthBit(num, i);
        }
        else{
            return setIthBit(num, i);
        }
        // Approch - 2
        // int n=clearIthBit(num, i);
        // int bitmask=newbit<<i;
        // return n|bitmask;
    }
    public static void main(String[] args) {
        System.out.println(updateIthBit(11, 2, 1));
    }
}