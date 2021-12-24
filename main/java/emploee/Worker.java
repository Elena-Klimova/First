package emploee;

import animals.Animal;
import animals.Voice;
import food.Food;

public class Worker {
    public void feed (Animal animal, Food food) {
        System.out.println(animal.eat(food));
    }

    public void getVoice(Voice animal) {
        System.out.println(animal.getVoice());

    }
}