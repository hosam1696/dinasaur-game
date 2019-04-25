package app2;/**
 * Created by hosam on 4/16/2019.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;



public class app2 extends Application {

    Scene appScene;
    Pane appPane;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage appStage) {


        Button appButton = new Button("New Button");
        appPane.getChildren().add(appButton);
//        appPane.setBorder(new Border(new BorderStroke()));

//        appPane.setBackground(new Background(BackgroundFill.RED));

        appScene = new Scene(appPane, 100, 100);

        appStage.setTitle("New App");

        appStage.setScene(appScene);

        appStage.show();
    }
}
