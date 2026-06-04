package com.bod1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField txtinput;
    @FXML
    private TextField txtanswer;

    @FXML
    private void onButtonClick(ActionEvent event) {
        int number = Integer.parseInt(txtinput.getText());
        if (number < 100 || number > 999) {
            txtanswer.setText("Please enter a three-digit number.");
            return;
        }
        DigitAdder adder = new DigitAdder(number);
        int sum = adder.sumDigits();
        txtanswer.setText(String.valueOf(sum));
    }
}
