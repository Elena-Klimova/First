package  animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal {
    public Herbivore(String name) {
        super(name);
    }

    public Herbivore() {

    }

    @Override
    public boolean eat(Food food) {
        if (food instanceof Grass) {
            System.out.println("Mmmmm");
        } else {
            System.out.println("Fuuuu");
        }

        return false;
    }
}