module com.bod5 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.bod5 to javafx.fxml;
    exports com.bod5;
}
