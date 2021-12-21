import  animals.Kotik;

public class Application {

    public static boolean compareVoice(Kotik cat1, Kotik cat2) {
        return cat1.getVoice().equals(cat2.getVoice());
    }

    public static void main(String[] args) {
        Kotik cat1 = new Kotik("cat1", "meow", 10, 2);
        Kotik cat2 = new Kotik();
        cat2.setName("cat2");
        cat2.setVoice("meow");
        cat2.setSatiety(10);
        cat2.setWeight(2);

        String[] temp = cat1.liveAnotherDay();
        for (String s : temp) {
            System.out.println(s);
        }
        System.out.printf("Name: %s%n Weight: %o%n", cat2.getName(), cat2.getWeight());
        if (compareVoice(cat1, cat2)) {
            System.out.println("Коты одинаково разговаривают");
        }
        System.out.println("Количество созданных экземпляров: " + Kotik.getCount());
    }

}


