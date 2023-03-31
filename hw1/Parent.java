package hw1;

public class Parent extends Person {
    protected Gender gender;

    public Parent(String name, int age, Gender gender) {
        super(name, age);
        this.gender = gender;
    }

    public String getInfo() {
        return String.format("Parent %s, gender: %s", super.getInfo(), this.gender);
    }

    public void walkDog(Dog target) {
        Dog.weight -= 2;
        System.out.println(target.getInfo());
        System.out.print(target.name + " says ");
        Dog.bark();
    }

    enum Gender {
        male,
        female;
    }
}
