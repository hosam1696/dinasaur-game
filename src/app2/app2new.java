package app2;/**
 * Created by hosam on 4/16/2019.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class app2new extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button appButton = new Button("New Button");
        StackPane appPane = new StackPane();


        appPane.getChildren().add(appButton);
//        appPane.setBorder(new Border(new BorderStroke()));

//        appPane.setBackground(new Background(BackgroundFill.RED));

        Scene appScene = new Scene(appPane, 100, 100);

        primaryStage.setTitle("New App");

        primaryStage.setScene(appScene);

        primaryStage.show();


    }
}
