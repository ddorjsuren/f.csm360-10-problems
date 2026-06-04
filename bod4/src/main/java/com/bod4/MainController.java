package com.bod4;

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
    private TextField txtarea;
    
    @FXML
    private void onButtonClick(ActionEvent event){
        double a = Float.parseFloat(txta.getText());
        double b = Float.parseFloat(txtb.getText());
        double c = Float.parseFloat(txtc.getText());
        Triangle triangle = new Triangle(a, b, c);
        txtarea.setText(String.format("%.2f", triangle.getArea()));
    }
    
}
