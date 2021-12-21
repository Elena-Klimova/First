package animals;

import food.Food;

public abstract class Animal {
    private int satiety;
    private String name;

    public Animal() {

    }

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public int getSatiety() {
        return satiety;
    }

    public abstract boolean eat(Food food);

}
