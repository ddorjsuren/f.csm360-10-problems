package com.bod6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {
    @FXML
    private TextField txtn;
    @FXML 
    private TextField txtsum;
    @FXML
    private void onButtonClick(ActionEvent event){
        int n = Integer.parseInt(txtn.getText());
        OddSum sum = new OddSum(n);
        txtsum.setText(String.valueOf(sum.getSum()));
    }
    
    
}
