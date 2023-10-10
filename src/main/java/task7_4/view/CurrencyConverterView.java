package task7_4.view;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import task7_4.application.CurrencyConverterController;

public class CurrencyConverterView extends Application {
    private TextField result = new TextField();
    private TextField text1 = new TextField();
    private Label info3 = new Label();
    private CurrencyConverterController controller;
    private ChoiceBox choiceBox1 = new ChoiceBox();
    private ChoiceBox choiceBox2 = new ChoiceBox();
    public void start(Stage stage) {
        controller.addCurren("USD", 1.0);
        controller.addCurren("EUR", 0.85);
        controller.addCurren("GBP", 0.72);
        stage.setTitle("Currency Converter");
        choiceBox1.getItems().addAll();
        choiceBox2.getItems().addAll();
        Button convertButton = new Button("Convert");
        GridPane pane = new GridPane();
        Button addCurrency = new Button("Add currency");
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
        pane.add(addCurrency, 0, 3);




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
        addCurrency.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                openAddCurrencyView();
            }
        });
        stage.show();
    }
    private void openAddCurrencyView() {
        GridPane newPane = new GridPane();
        Stage newStage = new Stage();
        newStage.setTitle("Add currency");
        Button saveButton = new Button("Save");
        TextField currency = new TextField();
        TextField rate = new TextField();
        currency.setPromptText("Enter currency");
        rate.setPromptText("Enter rate");
        Label info = new Label();

        newPane.add(currency, 0, 0);
        newPane.add(rate, 1, 0);
        newPane.add(saveButton, 1, 1);
        newPane.add(info, 0, 2, 2, 1);
        
        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String userInput = currency.getText();
                String rateDouble = rate.getText();
                if (userInput.isEmpty() || rateDouble.isEmpty()) {
                    info.setText("Please enter a currency and a rate!");
                }
                else if (!userInput.matches("^[A-Za-z]{3}$")) {
                    info.setText("Please enter a valid currency!");
                }
                else if (!rateDouble.matches("^\\d+(\\.\\d+)?$")) {
                    info.setText("Please enter a valid rate!");
                }
                else if (choiceBox1.getItems().contains(userInput)){
                    info.setText("Currency already exists!");
                }
                else {
                    controller.add(userInput, rateDouble);
                    newStage.close();

                }
            }
        });
        Scene scene = new Scene(newPane, 300, 100);
        newStage.setScene(scene);
        newStage.showAndWait();
    }
    public void addChoice(String currency) {
        choiceBox1.getItems().add(currency);
        choiceBox2.getItems().add(currency);
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
