module com.bod7 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.bod7 to javafx.fxml;
    exports com.bod7;
}
