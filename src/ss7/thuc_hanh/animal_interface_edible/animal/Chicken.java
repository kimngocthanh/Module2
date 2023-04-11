package ss7.thuc_hanh.animal_interface_edible.animal;

import ss7.thuc_hanh.animal_interface_edible.edible.IEdible;

public class Chicken extends Animal implements IEdible {

    @Override
    public String makeSound() {
        return "chicken : ò ó o";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
