package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal {

    public Carnivorous(String name) {
        super(name);
    }

    public Carnivorous() {
        super();
    }


    @Override
    public boolean eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Mmmmm");
        } else {
            System.out.println("Fuuuu");
        }
        return false;
    }
}
