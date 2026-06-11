module com.bod8 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.bod8 to javafx.fxml;
    exports com.bod8;
}
