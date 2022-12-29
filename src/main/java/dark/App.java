package dark;

import javafx.application.*;
import javafx.geometry.*;
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


		GridPane grid = new GridPane();

		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(7);
		grid.setHgap(10);

		Label name = new Label("Name:");
			GridPane.setConstraints(name, 0, 0);
		TextField usr = new TextField();
		usr.setPromptText("Username");
			GridPane.setConstraints(usr, 1, 0);

		Label pass = new Label("Password:");
			GridPane.setConstraints(pass, 0, 1);
		TextField psw = new TextField();
		psw.setPromptText("Password");
			GridPane.setConstraints(psw, 1, 1);

		Button log = new Button("Login");
			GridPane.setConstraints(log, 1, 2);


		grid.getChildren().addAll(name, usr, pass, psw, log);
		Scene scene = new Scene(grid, 300, 300);
		window.setScene(scene);
		window.show();
	}
}