package task6_2.view;


import task6_2.controller.CurrencyConverterController;
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
public class CurrencyConverterView extends Application {
    private Label result = new Label();
    private TextField text1 = new TextField("amount");
    private CurrencyConverterController controller;
    public void start(Stage stage) {

        Button convertButton = new Button("Convert");
        FlowPane pane = new FlowPane();

        stage.setTitle("Currency Converter");

        Insets insets = new Insets(10, 10, 10, 10);
        pane.setMargin(result, insets);
        pane.setMargin(convertButton, insets);
    }
}
