package hw1;

public abstract class Pet {
    protected String name;
    protected static int weight;

    public Pet(String name, int weight) {
        this.name = name;
        Pet.weight = weight;
    }

    public String getInfo() {
        return String.format("Name: %s, weight: %d", this.name, Pet.weight);
    }
}
