import abstr.Animal;

public class Cheetah extends Animal {

    public Cheetah(String name) {
        super(name, "Spotted-red", 2);
    }

    @Override
    public String getName() {
        return "This is a cheetah named " + name;
    }
}
