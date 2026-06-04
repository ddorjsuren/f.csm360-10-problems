package com.bod2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField txtinput;
    @FXML
    private TextField txtsecond;
    @FXML
    private TextField txtminute;
    @FXML
    private TextField txthour;

    @FXML
    private void onButtonClick(ActionEvent event) {
        int seconds = Integer.parseInt(txtinput.getText());
        TimeConverter converter = new TimeConverter(seconds);
        txtsecond.setText(String.valueOf(converter.getSeconds()));
        txtminute.setText(String.valueOf(converter.getMinutes()));
        txthour.setText(String.valueOf(converter.getHours()));
    }

}