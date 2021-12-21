package animals;

public class Duck extends Herbivore implements Fly, Run, Swim, Voice {


    public Duck(String name) {
        super(name);
    }

    public Duck() {
        super();
    }


    @Override
    public void fly() {
        System.out.println("Утка летит");
    }

    @Override
    public void run() {
        System.out.println("Утка бежит");
    }

    @Override
    public void swim() {
        System.out.println("Утка плывет");
    }

    @Override
    public String getVoice() {
        return "Кря-кря";
    }
}
