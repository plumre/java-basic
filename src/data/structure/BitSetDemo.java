package data.structure;

import java.util.BitSet;

public class BitSetDemo {

    public static void main(String[] args) {
        BitSet bitSet1 = new BitSet(16);
        BitSet bitSet2 = new BitSet(16);
        // set some bits
        for (int i = 0; i < 16; i++) {
            if (i % 2 == 0) {
                bitSet1.set(i);
            }
            if (i % 5 != 0) {
                bitSet2.set(i);
            }
        }
        System.out.println("Initial pattern in bits1: ");
        System.out.println(bitSet1);
        System.out.println("total: " + bitSet1.size());
        System.out.println("true: " + bitSet1.cardinality());
        System.out.println("\nInitial pattern in bits2: ");
        System.out.println(bitSet2);
        System.out.println("total: " + bitSet2.size());
        System.out.println("true: " + bitSet2.cardinality());

        // AND bits
        bitSet2.and(bitSet1);
        System.out.println("\nbits2 AND bits1");
        System.out.println(bitSet2);
        // OR bits
        bitSet2.or(bitSet1);
        System.out.println("\nbits2 OR bits1");
        System.out.println(bitSet2);
        // XOR bits
        bitSet2.xor(bitSet1);
        System.out.println("\nbits2 XOR bits1");
        System.out.println(bitSet2);
    }
}