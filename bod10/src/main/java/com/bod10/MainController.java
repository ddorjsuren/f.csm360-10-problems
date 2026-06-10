package com.bod10;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;

public class MainController {

    @FXML private Slider xSlider;
    @FXML private Slider ySlider;
    @FXML private Pane gridPane;
    @FXML private TextField txtresult;

    private static final double ROD_SPACING = 50;
    private static final double MARGIN = 40;
    private static final double DOT_RADIUS = 5;
    private static final double ROD_THICKNESS = 2;

    @FXML
    public void initialize() {
        xSlider.valueProperty().addListener((obs, oldVal, newVal) -> redrawGrid());
        ySlider.valueProperty().addListener((obs, oldVal, newVal) -> redrawGrid());
    }

    private void redrawGrid() {
        gridPane.getChildren().clear();

        int n = (int) xSlider.getValue();
        int m = (int) ySlider.getValue();

        if (n <= 0 || m <= 0) return;

        drawHorizontalRods(n, m);
        drawVerticalRods(n, m);
        drawIntersectionDots(n, m);
        resizePaneToFit(n, m);

        if(Math.min(n, m) % 2 == 0){
            txtresult.setText(String.valueOf("Malvika"));
        }
        else{
            txtresult.setText(String.valueOf("Akshat"));
        }
    }

    private void drawHorizontalRods(int n, int m) {
        for (int i = 0; i < n; i++) {
            double y = MARGIN + i * ROD_SPACING;
            double xStart = MARGIN;
            double xEnd = MARGIN + (m - 1) * ROD_SPACING;

            Line rod = new Line(xStart, y, xEnd, y);
            rod.setStroke(Color.RED);
            rod.setStrokeWidth(ROD_THICKNESS);
            gridPane.getChildren().add(rod);
        }
    }

    private void drawVerticalRods(int n, int m) {
        for (int j = 0; j < m; j++) {
            double x = MARGIN + j * ROD_SPACING;
            double yStart = MARGIN;
            double yEnd = MARGIN + (n - 1) * ROD_SPACING;

            Line rod = new Line(x, yStart, x, yEnd);
            rod.setStroke(Color.GREEN);
            rod.setStrokeWidth(ROD_THICKNESS);
            gridPane.getChildren().add(rod);
        }
    }

    private void drawIntersectionDots(int n, int m) {
        int dotNumber = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                double cx = MARGIN + j * ROD_SPACING;
                double cy = MARGIN + i * ROD_SPACING;

                Circle dot = new Circle(cx, cy, DOT_RADIUS, Color.BLACK);
                gridPane.getChildren().add(dot);

                Label label = new Label(String.valueOf(dotNumber));
                label.setLayoutX(cx + DOT_RADIUS + 2);
                label.setLayoutY(cy - DOT_RADIUS - 2);
                label.setFont(Font.font(10));
                gridPane.getChildren().add(label);

                dotNumber++;
            }
        }
    }

    private void resizePaneToFit(int n, int m) {
        double requiredWidth = MARGIN * 2 + (m - 1) * ROD_SPACING;
        double requiredHeight = MARGIN * 2 + (n - 1) * ROD_SPACING;

        gridPane.setMinSize(requiredWidth, requiredHeight);
        gridPane.setPrefSize(requiredWidth, requiredHeight);
    }
}
