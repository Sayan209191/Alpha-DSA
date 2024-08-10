public class ClearIthBit {
    public static int clearLastIBits(int num,int i){
        int bitmask=(-1 << i);
        return num & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearLastIBits(15,2));
    }
}
