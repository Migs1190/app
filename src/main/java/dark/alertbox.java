package dark;

import javafx.stage.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class alertbox
{
 public static void display(String title, String message)
 {
    Stage window = new Stage();

    window.initModality(Modality.APPLICATION_MODAL);
    window.setTitle("new window");
    Label lb = new Label(message);

    Button close = new Button("close");
    close.setOnAction(e -> window.close());

    VBox layout = new VBox(10);
    layout .getChildren().addAll(lb, close);
    layout.setAlignment(Pos.CENTER);

    Scene sc = new Scene(layout, 250, 100);
    window.setScene(sc);
    window.showAndWait();
 }
}