package data.structure;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        // initial size is 3, increment is 2
        Vector vector = new Vector(3, 2);
        System.out.println("Initial size: " + vector.size());
        System.out.println("Initial capacity: " + vector.capacity());
        vector.addElement(new Integer(1));
        vector.addElement(new Integer(2));
        vector.addElement(new Integer(3));
        vector.addElement(new Integer(4));
        System.out.println("Capacity after four additions: " + vector.capacity());
        vector.addElement(new Double(5.45));
        System.out.println("Current capacity: " + vector.capacity());
        vector.addElement(new Double(6.08));
        vector.addElement(new Integer(7));
        System.out.println("Current capacity: " + vector.capacity());
        vector.addElement(new Float(9.4));
        vector.addElement(new Integer(10));
        System.out.println("Current capacity: " + vector.capacity());
        vector.addElement(new Integer(11));
        vector.addElement(new Integer(12));
        System.out.println("First element: " + vector.firstElement());
        System.out.println("Last element: " + vector.lastElement());
        if (vector.contains(new Integer(3))) {
            System.out.println("Vector contains 3.");
        }
        // enumerate the elements in the vector
        Enumeration elements = vector.elements();
        System.out.println("\nElements in vector:");
        while (elements.hasMoreElements()) {
            System.out.print(elements.nextElement() + " ");
            System.out.println();
        }

    }
}
