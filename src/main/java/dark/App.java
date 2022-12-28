package dark;

import java.util.logging.Handler;

import javafx.application.Application;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.stage.*;

public class App extends Application
{
	Button butt;
		public static void main (String[] args)
		{launch (args);}

		@Override
		public void start(Stage primaryStage) throws Exception
		{
				primaryStage.setTitle("Windoo");


				Button butt = new Button("Click me");
				butt.setOnAction(e -> System.out.println("Button clicked"));

				StackPane layout = new StackPane();
				layout.getChildren().add(butt);

				Scene scene = new Scene(layout, 600, 600);
				primaryStage.setScene(scene);
				primaryStage.show();
		}

}