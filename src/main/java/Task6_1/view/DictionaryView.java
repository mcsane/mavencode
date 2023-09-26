package Task6_1.view;

import Task6_1.controller.DictionaryController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.EventHandler;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class DictionaryView extends Application {
    private Label result = new Label();
    private TextField text1 = new TextField("give word");
    private DictionaryController controller;
    public void start(Stage stage){

        Button searchButton = new Button("Search");
        FlowPane pane = new FlowPane();

        stage.setTitle("Dictionary");

        Insets insets = new Insets(10, 10, 10, 10);
        pane.setMargin(result, insets);
        pane.setMargin(searchButton, insets);


        result.setMinWidth(50);
        result.setAlignment(Pos.CENTER);
        pane.getChildren().add(text1);
        pane.getChildren().add(result);
        pane.getChildren().add(searchButton);


        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();

        searchButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                controller.search();
            }
        });
        stage.show();

    }

    public void init() {
        controller = new DictionaryController(this);
    }
    public String getWord(){
        return text1.getText();
    }
    public void setMeaning(String meaning){
        result.setText(meaning);
    }
}
