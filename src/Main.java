import container.VetClinic;

public class Main {
    public static void main(String[] args) {
        Cat catAsya = new Cat("Asya", "Brown", 4.5, 34);
        Cat catBessie = new Cat("Bessie", "Black", 3, 27);
        Dog dogDessie = new Dog("Dessie");
        Cheetah cheetahChara = new Cheetah("Chara");

        VetClinic vetClinic = new VetClinic();
        vetClinic.addAnimal(catAsya, 0);
        vetClinic.addAnimal(catBessie, 1);
        vetClinic.addAnimal(dogDessie, 2);
        vetClinic.addAnimal(cheetahChara, 3);

        vetClinic.printAnimals();
    }
}
