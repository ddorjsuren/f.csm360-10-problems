package com.bod5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
    @FXML
    private TextField txtid;
    @FXML
    private TextField txtchar;
    @FXML
    private Label lblwarn;
    @FXML
    private void onButtonClick(ActionEvent event){
        int id = Integer.parseInt(txtid.getText());
        if(id < 32 || id > 255){
            lblwarn.setText("32-255 хооронд байх ёстой");
        }
        else{
             Ascii c = new Ascii(id);
             txtchar.setText(String.valueOf(c.getChar()));
        }

    }
}
