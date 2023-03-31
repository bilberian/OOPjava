package hw1;

import java.util.List;
import java.util.ArrayList;
import hw1.Parent.Gender;

public class Program {

    public static void main(String[] args) {
        Child child1 = new Child("Styopa", 8, Gender.male);
        Child child2 = new Child("Katya", 12, Gender.female);
        Parent par1 = new Parent("Rimma", 35, Gender.female);

        System.out.println(par1.getInfo());
        System.out.println(child1.getInfo());
        System.out.println(child2.getInfo());

        Dog doggie1 = new Dog("Rex", 10);
        Dog doggie2 = new Dog("Rada", 19);
        Cat kitty1 = new Cat("Murzik", 4);
        Cat kitty2 = new Cat("Pushok", 7);

        List<Pet> petFam = new ArrayList<>();
        petFam.add(doggie1);
        petFam.add(doggie2);
        petFam.add(kitty1);
        petFam.add(kitty2);

        for (int i = 0; i < petFam.size(); i++) {
            System.out.println(petFam.get(i).getInfo());
        }

        System.out.println();

        par1.walkDog(doggie1);
        child2.feedPet(kitty2);

    }
}
