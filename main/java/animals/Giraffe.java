package animals;

public class Giraffe extends Herbivore implements Run {
    public Giraffe(String name) {
        super(name);
    }

    public Giraffe() {

    }


    @Override
    public void run() {
        System.out.println("Жираф бежит");
    }
}
