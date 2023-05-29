package com.example.week4strings;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class StringController implements Initializable {
    @FXML
    private TextField phoneNumberTextField;

    @FXML
    private Label resultLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("I am inside the controller");

        String string1 = new String("Welcome to Week 4 Strings.");
        String string2 = "Welcome to Week 4 Strings.";

        // using ==
        if(string1 == string2){
            System.out.println("Both the strings are equal.");
        } else{
            System.out.println("Both the strings are not equal.");
        }

        // using equals method
        if(string1.equals(string2)){
            System.out.println("Both the strings are equal.");
        } else{
            System.out.println("Both the strings are not equal.");
        }

        // using stringBuilder
        StringBuilder sb1 = new StringBuilder("Abcd");
        System.out.println(sb1);
        sb1.append("Xyz");
        System.out.println(sb1);

        // regex
        phoneNumberTextField.textProperty().addListener((observableValue, oldValue, phoneNum) -> {
            // check if the value matches the regex
            // if it does, it will say its a valid number
            if(phoneNum.matches("[2-9][0-9][0-9][2-9]\\d{2}[0-9]{4}")){
                resultLabel.setText(phoneNum + " is a valid phone number.");
            } else {
                resultLabel.setText(phoneNum + " is not valid phone number.");
            }
        });
    }
}
