module dark {
    requires javafx.controls;
    requires javafx.fxml;

    opens dark to javafx.fxml;
    exports dark;
}
