module com.bod4 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.bod4 to javafx.fxml;
    exports com.bod4;
}
