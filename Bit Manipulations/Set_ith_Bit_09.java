public class Set_ith_Bit_09 {
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        System.out.println(setIthBit(10, 1)); 
        System.out.println(setIthBit(10, 2)); 
        System.out.println(setIthBit(10, 3)); 
    }
}
