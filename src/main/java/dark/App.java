package dark;

import javafx.application.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class App extends Application
{
	Stage window;
	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) 
	{
		window = primaryStage;
		window.setTitle("The window");
		
		Button button = new Button("Click me");
		button.setOnAction(e -> closing());
		window.setOnCloseRequest(e -> {
			e.consume();
			closing();
		});

		VBox layout = new VBox();
		layout.getChildren().add(button);
		layout.setAlignment(Pos.CENTER);
		Scene sc = new Scene(layout, 300, 300);
		window.setScene(sc);
		window.show();
	}

	private void closing()
	{
		Boolean answer = confirmbox.confirm("Are you sure you want to exit?");
		if (answer)
			window.close();
	}
}