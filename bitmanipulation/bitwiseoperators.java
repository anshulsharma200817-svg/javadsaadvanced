class bitwiseoperators {
    public static void main(String[] args) {
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary

        // Bitwise AND
        int andResult = a & b; // 0101 & 0011 = 0001 (1 in decimal)
        System.out.println("Bitwise AND: " + andResult);

        // Bitwise OR
        int orResult = a | b; // 0101 | 0011 = 0111 (7 in decimal)
        System.out.println("Bitwise OR: " + orResult);

        // Bitwise XOR
        int xorResult = a ^ b; // 0101 ^ 0011 = 0110 (6 in decimal)
        System.out.println("Bitwise XOR: " + xorResult);

        // Bitwise NOT
        int notResult = ~a; // ~0101 = 1010 (in two's complement, this is -6)
        System.out.println("Bitwise NOT: " + notResult);\
        // Bitwise Left Shift
        int leftShiftResult = a << 1; // 0101 << 1 = 1010 (10 in decimal)
        System.out.println("Bitwise Left Shift: " + leftShiftResult);   
        // Bitwise Right Shift
        int rightShiftResult = a >> 1; // 0101 >> 1 = 0010 (2 in decimal)
        System.out.println("Bitwise Right Shift: " + rightShiftResult);   
        // Bitwise Unsigned Right Shift
        int unsignedRightShiftResult = a >>> 1; // 0101 >>> 1 = 0010 (2 in decimal)
        System.out.println("Bitwise Unsigned Right Shift: " + unsignedRightShiftResult);    
    }
}
// x>>k=x/(2^k)  x<<k=x*(2^k) 