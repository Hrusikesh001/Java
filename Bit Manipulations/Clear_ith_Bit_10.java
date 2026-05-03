public class Clear_ith_Bit_10 {
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearIthBit(10, 1)); 
        System.out.println(clearIthBit(10, 2)); 
        System.out.println(clearIthBit(10, 3)); 
    }
}
