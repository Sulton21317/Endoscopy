package com.uzdev.endoscopy.esophagus;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.io.File;

public class EsophagusController {

    @FXML
    public VBox flowSubItems;

    @FXML
    public VBox whatHasSubItems;
    @FXML
    public AnchorPane mucosaSubItems;
    ;
    public VBox pathologyItems;
    private Boolean isShow = true;

    @FXML
    public Button btnFlowOfEsophagus;
    @FXML
    public Button btnWhatHasInEsophagus;
    @FXML
    public Button btnMucosa;
    @FXML
    public Button btnPathology;


    @FXML
    protected void onEsophagusButtonClick() {

    }


    @FXML
    protected void onFlowOfEsophagus() {

    }


    @FXML
    protected void onWhatHasInEsophagus() {


    }

    private boolean isMucosaSubItemShow = true;


    @FXML
    protected void onMucosa() {


    }

    private boolean isPathologyShow = true;

    @FXML
    protected void onPathology() {


    }

    @FXML
    protected void onShowFullNameOFBtn() {
        btnWhatHasInEsophagus.setPrefWidth(250);
    }

    @FXML
    protected void onHideFullNameOFBtn() {
        btnWhatHasInEsophagus.setPrefWidth(100);
    }


    @FXML
    public void saveAction(ActionEvent event) {


    }
}
