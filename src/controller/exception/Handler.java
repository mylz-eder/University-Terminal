package controller.exception;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class Handler implements EventHandler<MouseEvent> {
    @Override
    public void handle(MouseEvent event) {System.out.println(event.getSource());}
}
