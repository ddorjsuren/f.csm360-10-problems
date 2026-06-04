module com.bod2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.bod2 to javafx.fxml;
    exports com.bod2;
}
