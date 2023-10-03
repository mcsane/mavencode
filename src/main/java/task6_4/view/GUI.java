package task6_4.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class GUI extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/SceneBuilder.fxml"));
        Parent root = loader.load();

        stage.setTitle("Notebook");
        stage.setScene(new Scene(root, 600, 400));
        stage.show();
    }
}
