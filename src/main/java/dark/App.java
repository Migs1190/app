package dark;
import java.util.ArrayList;
import java.util.List;

import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class App extends Application
{
	Stage window;
    Scene Scene;
	public static void main(String[] args)
	{launch(args);}

	@Override
	public void start(Stage primaryStage)
	{
		window = primaryStage;
		window.setTitle("Elden Ring");
        window.setScene(SetScene());
		window.show();
	}
//-------------------------------------------------------------------------
   public Scene SetScene()
    {
        GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(10);
		grid.setHgap(10);
        window.setMinHeight(100);
        window.setMinWidth(200);

		ChoiceBox<String> choice = new ChoiceBox<>();
		choice.getItems().addAll("Limgrave", "Liurnia", "Caelid", "Altus Plateau", "Mountaintops of the Giants", "Crumbling Farum Azula", "Deeproot Depths", "Siofra River", "Ainsel River", "Roundtable Hold" );
		choice.setValue("Limgrave");

        choice.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> System.out.println(newValue));

		Button button = new Button("Check");
			GridPane.setConstraints(button, 1, 0);
		button.setOnAction(e -> System.out.println(choice.getValue()));

		grid.getChildren().addAll(choice, button);
		Scene mainscene = new Scene(grid, 640, 400);
        Scene = mainscene;
        return mainscene;
    }
}