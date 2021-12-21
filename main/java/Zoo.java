import animals.*;
import emploee.Worker;
import food.Grass;
import food.Meat;

public class Zoo {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Fish fish = new Fish();
        Kotik kotik = new Kotik();
        Zebra zebra = new Zebra();
        Tiger tiger = new Tiger();
        Giraffe giraffe = new Giraffe();

        Worker worker = new Worker();
        Grass grass = new Grass();
        Meat meat = new Meat();


        worker.feed(tiger, meat);
        worker.feed(tiger, grass);

        worker.getVoice(duck);
        worker.getVoice(tiger);

    }

    public static Swim[] createPond() {
        Swim[] animalSwim = new Swim[6];
        animalSwim[0] = new Duck();
        animalSwim[1] = new Fish();
        animalSwim[2] = new Kotik();
        animalSwim[4] = new Zebra();
        animalSwim[5] = new Tiger();
        return animalSwim;
    }
}
