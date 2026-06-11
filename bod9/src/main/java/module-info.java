module com.bod9 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.bod9 to javafx.fxml;
    exports com.bod9;
}
