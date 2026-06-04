module com.bod3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.bod3 to javafx.fxml;
    exports com.bod3;
}
