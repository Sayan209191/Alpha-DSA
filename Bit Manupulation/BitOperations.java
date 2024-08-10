public class BitOperations {
    // Get i'th Bit
    public static int getIthBit(int num,int i) {
        int bitmask=(1<<i);
        if((num & bitmask)==0){
            return 0;
        }
        else{
          return 1;  
        }
    }
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
    public static void main(String[] args) {
        // Get i'th bit
        int num=10;
        int i=1;
        System.out.println(i+"'th bit of "+num+" is : "+getIthBit(num,i));
        // Set i'th bit
        System.out.println(setIthBit(num, i));
        // Clear i'th bit
        System.out.println(clearIthBit(num, i));
    }
}
