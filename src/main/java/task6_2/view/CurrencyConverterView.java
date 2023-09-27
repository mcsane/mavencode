package task6_2.view;


import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
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

import javax.swing.*;

public class CurrencyConverterView extends Application {
    private TextField result = new TextField();
    private TextField text1 = new TextField();
    private Label info3 = new Label();
    private CurrencyConverterController controller;
    private ChoiceBox choiceBox1 = new ChoiceBox();
    private ChoiceBox choiceBox2 = new ChoiceBox();
    public void start(Stage stage) {
        stage.setTitle("Currency Converter");
        choiceBox1.getItems().addAll("USD", "EUR", "GBP");
        choiceBox2.getItems().addAll("USD", "EUR", "GBP");
        Button convertButton = new Button("Convert");
        GridPane pane = new GridPane();
        Label info = new Label("Convert from:");
        Label info2 = new Label("Convert to:");
        info3.setText("Welcome to the Currency Converter!\nPlease enter the amount you want to convert and choose the currencies.");
        HBox hbox1 = new HBox();
        Label label4 = new Label();
        HBox hbox2 = new HBox();
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setAlignment(Pos.CENTER);
        text1.setPromptText("Enter amount");
        result.setPromptText("Result");
        //Insets insets1 = new Insets(10, 10, 10, 10);
        result.setMinWidth(100);

        hbox1.getChildren().add(choiceBox1);
        hbox1.getChildren().add(text1);

        hbox2.getChildren().add(choiceBox2);
        hbox2.getChildren().add(result);

        pane.add(info3, 0, 0, 3, 1);
        pane.add(info, 0, 1);
        pane.add(info2, 2, 1);


        pane.add(hbox1, 0, 2);

        pane.add(hbox2, 2, 2);

        pane.add(convertButton, 2, 3);
        pane.add(label4, 2, 4);




        Scene scene = new Scene(pane, 700, 300);

        scene.getStylesheets().add("style.css");
        stage.setScene(scene);
        stage.show();
        convertButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String userInput = text1.getText();
                if(text1.getText().isEmpty()){
                    label4.setText("Please enter an amount!");
                }
                else if (choiceBox1.getValue() ==null|| choiceBox2.getValue() == null){
                    label4.setText("Please choose currencies!");


                }
                else if (userInput.matches("[a-zA-Z]+")){
                    label4.setText("Please enter a number!");
                }
                else{
                    label4.setText("");
                    controller.convert();}
            }
        });
        stage.show();
    }
    public void init() {
        controller = new CurrencyConverterController(this);
    }
    public String getAmount() {
        return text1.getText();
    }
    public String getFrom() {
        return choiceBox1.getValue().toString();
    }
    public String getTo() {
        return choiceBox2.getValue().toString();
    }
    public void setResult(double result) {
        this.result.setText(String.valueOf(result));
    }

}
