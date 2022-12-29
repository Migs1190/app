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

        
        CheckBox rar = new CheckBox("RAR");
            GridPane.setConstraints(rar, 0, 0);
        CheckBox zip = new CheckBox("ZIP");
            GridPane.setConstraints(rar, 1, 0);
        zip.setSelected(true);

        Button patch = new Button("Patch");
            GridPane.setConstraints(patch, 2, 0);
        System.out.println("Patching: ");
        patch.setOnAction(e -> checking(rar, zip));

		grid.getChildren().addAll(patch, rar, zip);
		Scene scene = new Scene(grid, 300, 300);
		window.setScene(scene);
		window.show();
	}

    private void checking(CheckBox x, CheckBox y)
    {
        System.out.print("Patching: ");
        if(x.isSelected())
            System.out.print("RAR ");
        if(y.isSelected())
            System.out.print("ZIP\n");
    }
}