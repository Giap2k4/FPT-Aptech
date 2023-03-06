package array;

import java.util.ArrayList;
import java.util.List;

public class CreateArraListExample {
    public static void main(String[] args) {
        List<String> animal = new ArrayList<>();
        animal.add("Lion");
        animal.add("Tiger");
        animal.add("Cat");
        animal.add("Dog");
        System.out.println(animal);
        animal.add(2,"Elephant");
        animal.remove(1);
        System.out.println(animal);
    }
}
