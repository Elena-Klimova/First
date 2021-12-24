package animals;

public class Fish extends Carnivorous implements Swim {

    public Fish(String name) {
        super(name);
    }

    public Fish() {

    }

    @Override
    public void swim() {
        System.out.println("Рыбка плывет");

    }
}
