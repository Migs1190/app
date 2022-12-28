module dark {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    requires transitive javafx.graphics;

    opens dark to javafx.fxml;
    exports dark;
}
