package hw1;

public class Dog extends Pet {

    public Dog(String name, int weight) {
        super(name, weight);
    }

    public String getInfo() {
        return String.format("Dog %s", super.getInfo());
    }

    public static void bark() {
        if (weight >= 10) {
            System.out.println("wuuuuuuuf");
        } else {
            System.out.println("Wuf-Wuf!");
        }
    }
}
