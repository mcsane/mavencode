package task6_3.controller;

import task6_3.model.Pet;
import task6_3.view.PetView;

import javafx.scene.input.MouseEvent;

public class PetController {
    private Pet pet;

    public PetController(Pet pet) {
        this.pet = pet;
    }

    public void movePet(double targetX, double targetY) {
        pet.moveTo(targetX, targetY);
    }
}
