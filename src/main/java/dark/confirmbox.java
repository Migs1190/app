package dark;

import javafx.stage.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class confirmbox
{
    static boolean answer;
	public static boolean confirm(String msg)
 {
    Stage window = new Stage();

    window.initModality(Modality.APPLICATION_MODAL);
    window.setTitle("Confirm");
    Label lb = new Label(msg);

    Button tbutton = new Button("Yes");
    Button fbutton = new Button("No");

    tbutton.setOnAction(e -> {
        answer = true;
        window.close();
    });
    fbutton.setOnAction(e -> {
        answer = false;
        window.close();
    });

    VBox layout = new VBox(10);
    layout .getChildren().addAll(lb, fbutton, tbutton);
    layout.setAlignment(Pos.CENTER);

    Scene sc = new Scene(layout, 250, 100);
    window.setScene(sc);
    window.showAndWait();

    return answer;
}
}
