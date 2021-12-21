package animals;

public class Zebra extends Herbivore implements Run, Voice, Swim {
    public Zebra(String name) {
        super(name);
    }

    public Zebra() {

    }


    @Override
    public void run() {
        System.out.println("Зебра бежит");
    }

    @Override
    public String getVoice() {
        return null;
    }

    @Override
    public void swim() {
        System.out.println("Зебра плывет");
    }
}
