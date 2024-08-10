public class ClearRangeOfBits {
    // clear the bits in given range
    public static int clearBits(int num,int start,int end) {
        int a=(~0)<<(end+1);    // (-1 << j+1)
        int b=(1<<start)-1;    // (1 << i)-1
        int bitmask=a | b;
        return num & bitmask;
    }
    public static void main(String[] args) {
        // number = 100111010011 => 2515
        System.out.println(clearBits(2515, 2, 7));
    }
}
