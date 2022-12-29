package dark;

import javafx.application.*;
import javafx.geometry.Insets;
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

		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(6);
		grid.setHgap(9);

		Label name = new Label("Username");
		GridPane.setConstraints(name, 0, 0);

		TextField nameinput = new TextField();
		nameinput.setPromptText("Username");
		GridPane.setConstraints(nameinput, 1, 0);


		Label pass = new Label("Password");
		GridPane.setConstraints(pass, 0, 1);

		TextField passinput = new TextField();
		passinput.setPromptText("Password");
		GridPane.setConstraints(passinput, 1, 1);

		Button log = new Button("Login");
		GridPane.setConstraints(log, 1, 2);
		
		grid.getChildren().addAll(name, nameinput, pass, passinput, log);
		Scene sc = new Scene(grid, 400, 400);
		window.setScene(sc);
		window.show();
	}
}