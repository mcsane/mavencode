package task6_3.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import task6_3.controller.PetController;
import task6_3.model.Pet;


public class PetView extends Application {
    private Pet pet;
    private Image petImage;
    private Canvas canvas;
    private PetController petController;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Virtual Pet");

        StackPane root = new StackPane();
        canvas = new Canvas(400, 400);
        root.getChildren().add(canvas);

        petImage = new Image("pet.png"); // Replace with your pet image file

        pet = new Pet(100, 100);
        petController = new PetController(pet);

        canvas.setOnMouseMoved(event -> {
            petController.movePet(event.getX(), event.getY());
            drawPet();
        });

        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

        drawPet();
    }

    private void drawPet() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.drawImage(petImage, pet.getX(), pet.getY());
    }
}