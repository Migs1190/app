module dark {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;

    opens dark to javafx.fxml;
    exports dark;
}
