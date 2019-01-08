package interfaces;

public class Mammal implements Animal {
    @Override
    public void eat() {
        System.out.println("Mammal eating ...");
    }

    @Override
    public void travel() {
        System.out.println("Mammal travelling ...");
    }

    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        mammal.eat();
        mammal.travel();
    }
}
