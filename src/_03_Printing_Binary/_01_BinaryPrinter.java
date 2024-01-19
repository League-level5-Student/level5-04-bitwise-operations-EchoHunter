package _03_Printing_Binary;

public class _01_BinaryPrinter {
    /*
     * Complete the methods below so they print the passed in parameter in binary.
     * Do not use the Integer.toBinaryString method!
     * Use the main method to test your methods.
     */


    public void printByteBinary(byte b) {
    String str ="";
    int value = 0;
    	// We first want to print the bit in the one's place
    	for (int i = 0; i < 8; i++) {
    		value = b>>>(7-i) & 1;
			str =str + value;
		}
    	System.out.print(str);
        // Shift b seven bits to the right
    	
        // Use the & operator to "mask" the bit in the one's place
        // This can be done by "anding" (&) it with the value of 1
    	
        // Print the result using System.out.print (NOT System.out.println)

        //Use this method to print the remaining 7 bits of b
    }

    public void printShortBinary(short s) {
        // Create 2 byte variables
    		int value = s;
    		
        // Use bit shifting and masking (&) to save the first
        // 8 bits of s in one byte, and the second 8 bits of
        // s in the other byte
    		printByteBinary((byte)(value>>>8 & 0b11111111));
    		printByteBinary((byte)(value & 0b11111111));
        // Call printByteBinary twice using the two bytes
        // Make sure they are in the correct order
    }

    public void printIntBinary(int i) {
        // Create 2 short variables
    		int value = i;
        // Use bit shifting and masking (&) to save the first
        // 16 bits of i in one short, and the second 16 bits of
        // i in the other short
    		printShortBinary((short)(value>>>16 & 0b1111111111111111));
    		printShortBinary((short)(value & 0b1111111111111111));
        // Call printShortBinary twice using the two short variables
        // Make sure they are in the correct order
    }

    public void printLongBinary(long l) {
        // Use the same method as before to complete this method
    }

    public static void main(String[] args) {
        // Test your methods here
    	new _01_BinaryPrinter().run();	
    }
    public void run() {
    	printByteBinary((byte)0b00010101);
    	System.out.println();
    	printShortBinary((short)500);
    	System.out.println();
    	printIntBinary(38425);
    }
}
