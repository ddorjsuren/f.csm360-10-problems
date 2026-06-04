module com.bod1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.bod1 to javafx.fxml;
    exports com.bod1;
}
