module com.bod10 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.bod10 to javafx.fxml;
    exports com.bod10;
}
