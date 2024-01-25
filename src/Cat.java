import abstr.Animal;
import abstr.Livable;
import abstr.Meowable;
import abstr.Walkable;

public class Cat extends Animal implements Livable, Meowable, Walkable {
    private double earSize;
    private int vibrissCount;

    private String begForFood;

    Cat(String name, String furColor, double earSize, int vibrissCount) {
        super(name, furColor, 2);
        this.setFurColor(furColor);
        this.setEarSize(earSize);
        this.setVibrissCount(vibrissCount);
    }

    @Override
    public void doMeow() {
        System.out.println("Meow");
    }

    public void doMeow(String receiver) {
        System.out.println("Meow, " + receiver);
    }

    public void doMeow(Animal animal) {
        System.out.println("Meow, " + animal.getName());
    }

    public void begForFood() {
        System.out.println(begForFood);
    }

    @Override
    public String getName() {
        return "This is a cat named " + name;
    }

    // Getters and Setters

    String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        if (furColor == "Green" || furColor == null) {
            System.out.println("Invalid fur color for this cat!");
        } else {
            this.furColor = furColor;
        }
    }

    public void setEarSize(double earSize) {
        if (earSize <= 0) {
            System.out.println("Invalid ear size for this cat!");
        } else {
            this.earSize = earSize;
        }
    }

    public int getVibrissCount() {
        return vibrissCount;
    }

    public void setVibrissCount(int vibrissCount) {
        if (vibrissCount <= 0) {
            System.out.println("Invalid vibriss count for this cat!");
        } else {
            this.vibrissCount = vibrissCount;
        }
    }

    public String getBegForFood() {
        return begForFood;
    }

    public void setBegForFood(String begForFood) {
        this.begForFood = begForFood;
    }

    @Override
    public void walk() {

    }

    @Override
    public void live() {

    }
}
