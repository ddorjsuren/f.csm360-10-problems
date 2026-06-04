package com.bod3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField txtp;
    @FXML
    private TextField txtap;
    @FXML
    private TextField txtq;
    @FXML
    private TextField txtaq;
    @FXML
    private TextField txtn;
    @FXML
    private TextField txtan;

    @FXML
    private void onButtonClick(ActionEvent event) {
        int p = Integer.parseInt(txtp.getText());
        int ap = Integer.parseInt(txtap.getText());
        int q = Integer.parseInt(txtq.getText());
        int aq = Integer.parseInt(txtaq.getText());
        int n = Integer.parseInt(txtn.getText());
        ArithmeticProgress aprog = new ArithmeticProgress(p, ap, q, aq, n);
        txtan.setText(String.valueOf(aprog.getAn()));
    }

}
