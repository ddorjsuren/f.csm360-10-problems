module com.bod6 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.bod6 to javafx.fxml;
    exports com.bod6;
}
