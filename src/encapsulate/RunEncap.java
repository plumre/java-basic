package encapsulate;

public class RunEncap {

    public static void main(String[] args) {
        EncapTest test = new EncapTest();
        test.setName("James");
        test.setAge(20);
        test.setIdNum("12434ms");

        System.out.println(test);
    }
}
