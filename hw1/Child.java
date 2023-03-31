package hw1;

public class Child extends Parent {

    public Child(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    public String getInfo() {
        return String.format("Child of %s ", super.getInfo());
    }

    public void feedPet(Pet target) {
        Pet.weight += 1;
        if (target instanceof Dog) {
            System.out.println(target.getInfo());
            System.out.print(target.name + " says ");
            Dog.bark();
        } else if (target instanceof Cat) {
            System.out.println(target.getInfo());
            System.out.print(target.name + " ");
            Cat.act();
        }
    }
}
