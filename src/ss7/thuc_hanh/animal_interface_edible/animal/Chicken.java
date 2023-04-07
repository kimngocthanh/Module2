package ss7.thuc_hanh.animal_interface_edible.animal;

import ss7.thuc_hanh.animal_interface_edible.animal.Animal;
import ss7.thuc_hanh.animal_interface_edible.edible.Edible;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "chicken : ò ó o";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
