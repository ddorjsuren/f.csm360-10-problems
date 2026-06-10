package com.bod8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField txta;

    @FXML
    private TextField txtb;

    @FXML
    private TextField txtc;

    @FXML
    private TextField txtresult;

    @FXML
    void onButtonClick(ActionEvent event) {
        int a = Integer.parseInt(txta.getText());
        int b = Integer.parseInt(txtb.getText());
        int c = Integer.parseInt(txtc.getText());
        int sum = 0;
        if(a == 5){
            sum +=1;
        }
        if(b == 5){
            sum +=1;
        }
        if(c == 5){
            sum +=1;
        }
        txtresult.setText(String.valueOf(sum));
    }


}
