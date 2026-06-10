package com.bod9;

import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class MainController {

    @FXML
    private Slider sldrDay;

    @FXML
    private TextField txtresult;

    @FXML
    void onSliderChanged(MouseEvent event) {
        int sliderValue = (int) sldrDay.getValue();
        switch(sliderValue){
            case 1:
                txtresult.setText("Monday");
                break;
            case 2:
                txtresult.setText("Tuesday");
                break;
            case 3:
                txtresult.setText("Wednesday");
                break;
            case 4:
                txtresult.setText("Thursday");
                break;
            case 5:
                txtresult.setText("Friday");
                break;
            case 6:
                txtresult.setText("Saturday");
                break;
            case 7:
                txtresult.setText("Sunday");
                break;
            default:
                txtresult.setText("How????");
        }
    }

}

