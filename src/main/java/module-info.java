module Trabajo2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens Trabajo2 to javafx.fxml;
    exports Trabajo2;
}