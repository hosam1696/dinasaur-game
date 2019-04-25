package app1;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;

/**
 * Created by hosam on 4/15/2019.
 */
public class btnHandler implements EventHandler{

    @Override
    public void handle(Event e) {
        System.out.println("Button Clicked");
    }


}
