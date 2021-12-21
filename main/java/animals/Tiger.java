package animals;

public class Tiger extends Carnivorous implements Run, Voice, Swim {
    public Tiger(String name) {
        super(name);
    }

    public Tiger() {

    }

    @Override
    public void run() {
        System.out.println("Тигр бежит");

    }

    @Override
    public String getVoice() {
        return "Арррр";
    }

    @Override
    public void swim() {
        System.out.println("Тигр плывет");
    }
}
