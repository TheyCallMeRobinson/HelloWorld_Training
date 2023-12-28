package container;

import abstr.Animal;

public class VetClinic {
    private Animal[] animalList;
    private int size;

    public VetClinic() {
        this.size = 4;
        this.animalList = new Animal[size];
    }

    public void addAnimal(Animal newAnimal, int position) {
        animalList[position] = newAnimal;
    }

    public void printAnimals() {
        for (int i = 0; i < size; i++) {
            System.out.println(animalList[i].getName());
        }
    }
}
