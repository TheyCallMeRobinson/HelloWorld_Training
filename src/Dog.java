import abstr.Animal;

public class Dog extends Animal {

    public Dog(String name) {
        super(name, "Brown", 2);
    }

    @Override
    public String getName() {
        return "This is a dog named " + name;
    }
}
