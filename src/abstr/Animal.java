package abstr;

public abstract class Animal {
    protected String name;
    protected String furColor;
    protected int eyeCount;

    public Animal(String name, String furColor, int eyeCount) {
        this.name = name;
        this.furColor = furColor;
        this.eyeCount = eyeCount;
    }

    public String getName() {
        return name;
    }
}
