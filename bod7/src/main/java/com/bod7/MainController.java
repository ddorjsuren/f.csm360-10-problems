package com.bod7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {
    @FXML
    private TextField txtn;
    @FXML
    private TextField txttotal;
    
    @FXML
    private void onButtonClick(ActionEvent event){
        int n = Integer.parseInt(txtn.getText());
        LockSolver ls = new LockSolver(n);
        txttotal.setText(String.valueOf(ls.WorstCase()));
    }
}
