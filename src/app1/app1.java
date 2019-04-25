package app1;/**
 * Created by hosam on 4/15/2019.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class app1 extends Application {

    Scene secondScene;

    public void print(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


        Button btn1 = new Button("change scene");
        Button btn2 = new Button("Click Me");

        btn2.setOnAction(e -> {
            print("Lambda Button Clicked");
        });

        btn1.setOnAction(e -> primaryStage.setScene(secondScene));

        // Scene 1

        GridPane appGrid = new GridPane();


        Scene appScene = new Scene(appGrid, 200, 200);

        appGrid.setPadding(new Insets(10));

        appGrid.setHgap(10);

        appGrid.setVgap(10);

        appGrid.add(btn1, 0, 0);

        appGrid.add(btn2, 1, 0);


        // Scene 2

        StackPane muyPane = new StackPane();

        Button backBtn = new Button("Back Button");

        secondScene = new Scene(backBtn, 200, 200);

        backBtn.setOnAction(e -> primaryStage.setScene(appScene));

        primaryStage.setScene(appScene);
        primaryStage.setTitle("Testing Tittle");
        primaryStage.show();


    }

    public class myHandler implements EventHandler {


        public void handle(Event event) {
            print("Class Button Clicked");
            print(event.toString());

        }

    }
}
