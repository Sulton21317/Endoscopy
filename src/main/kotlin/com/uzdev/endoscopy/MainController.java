package com.uzdev.endoscopy;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextInputDialog;
import javafx.scene.input.InputEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class MainController {
    @FXML
    public MenuBar menuBar;



    public MainController() {

    }


    @FXML
    protected void handleAboutAction(final ActionEvent event) {
        TextInputDialog inputDialog = new TextInputDialog();
        inputDialog.setTitle("About");
        inputDialog.show();

    }

    @FXML
    protected void handleKeyInput(final InputEvent event) {
        if (event instanceof KeyEvent) {
            final KeyEvent keyEvent = (KeyEvent) event;
            if (keyEvent.isControlDown() && keyEvent.getCode() == KeyCode.A) {
                TextInputDialog inputDialog = new TextInputDialog();
                inputDialog.setTitle("Input");
                inputDialog.show();
            }
        }
    }


    @FXML
    protected void onExit() {
        Platform.exit();
    }
}