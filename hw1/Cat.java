package hw1;

public class Cat extends Pet {

    public Cat(String name, int weight) {
        super(name, weight);
    }

    public String getInfo() {
        return String.format("Cat %s", super.getInfo());
    }

    public static void act() {
        if (weight > 5) {
            System.out.println("falls asleep");
        } else {
            System.out.println("wants to play");
        }
    }
}
