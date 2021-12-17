package  animals;

import java.util.Random;

public class Kotik {
    private static final int METHODS = 5;
    public static int count;
    private String name;
    private String voice;
    private int satiety;
    private float weight;

    public Kotik() {
        count++;
    }

    public Kotik(String name, String voice, int satiety, float weight) {
        this();
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean play() {
        if (satiety > 0) {
            System.out.println("Котик играет: " + voice);
            satiety--;
            return true;
        }
        return false;
    }

    public boolean sleep() {
        if (satiety > 0) {
            System.out.println("Котик спит");
            satiety--;
            return true;
        }
        return false;
    }

    public boolean wash() {
        if (satiety > 0) {
            System.out.println("Котик умывается");
            satiety--;
            return true;
        }
        return false;

    }

    private boolean walk() {
        if (satiety > 0) {
            System.out.println("Котик гуляет");
            satiety--;
            return true;
        }
        return false;

    }

    private boolean hunt() {
        if (satiety > 0) {
            System.out.println("Котик охотится");
            satiety--;
            return true;
        }
        return false;

    }

    private void eat(int a) {
        System.out.println("Котик ест");
        satiety = satiety + a;
    }

    private void eat(int a, String food) {
        System.out.println("Котик ест " + food);
        satiety = satiety + a;
    }

    private void eat() {
        eat(1, "корм");
    }

    public String[] liveAnotherDay() {
        String[] array = new String[24];
        for (int i = 0; i < 24; i++) {
            int method = (int) (Math.random() * METHODS) + 1;
            switch (method) {
                case 1:
                    if(!play()) {
                        eat();
                        array[i] = i + " - ел";
                    }
                    else {
                        array[i] = i + " - играл";
                    }
                    break;
                case 2:
                    if(!hunt()) {
                        eat(8);
                        array[i] = i + " - ел";
                    }
                    else {
                        array[i] = i + " - охотился";
                    }
                    break;
                case 3:
                    if(!sleep()) {
                        eat();
                        array[i] = i + " - ел";
                    }
                    else {
                        array[i] = i + " - спал";
                    }
                    break;
                case 4:
                    if(!walk()) {
                        eat();
                        array[i] = i + " - ел";
                    }
                    else {
                        array[i] = i + " - гулял";
                    }
                    break;
                case 5:
                    if(!wash()) {
                        eat();
                        array[i] = i + " - ел";
                    }
                    else {
                        array[i] = i + " - умывался";
                    }
                    break;
            }

        }

        return array;
    }


}
