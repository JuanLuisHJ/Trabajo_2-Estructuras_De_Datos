module Trabajo2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jgrapht.core;

    opens Trabajo2 to javafx.fxml;
    exports Trabajo2;
}