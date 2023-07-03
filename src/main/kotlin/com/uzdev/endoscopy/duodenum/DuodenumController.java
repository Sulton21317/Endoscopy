package com.uzdev.endoscopy.duodenum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class DuodenumController {

    public Button btnFlowOfDuodenum;
    public Button btnWhatHasInDuodenum;
    public Button btnMucosaOfDuodenum;
    public Button btnPathologyOfDuodenum;
    public Button btnMainDuodenum;
    public AnchorPane subItem;
    private boolean isShowDesc = true;



    private Boolean isShowSubItemFlow = true;


    public void onDuodenumFlowBtnClick() {
        if (isShowSubItemFlow) {
            subItem.setVisible(true);
            isShowSubItemFlow = false;
        } else {
            subItem.setVisible(false);
            isShowSubItemFlow = true;
        }
    }

    public void onShowFullNameOFBtn(MouseEvent event) {
        btnWhatHasInDuodenum.setPrefWidth(250);
    }

    public void onHideFullNameOFBtn(MouseEvent event) {
        btnWhatHasInDuodenum.setPrefWidth(100);
    }

    public void onDuodenumWhatHasInBtnClick(ActionEvent actionEvent) {

    }

    public void onDuodenumMucosaBtnClick(ActionEvent actionEvent) {

    }

    public void onDuodenumPathologyBtnClick(ActionEvent actionEvent) {

    }

    public void onDuodenumBtnClick(ActionEvent actionEvent) {
        if (isShowDesc) {
            showSubItem();
            isShowDesc = false;
        } else {
            hideSubItem();
            isShowDesc = true;
        }
    }

    private void hideSubItem() {
        btnFlowOfDuodenum.setVisible(false);
        btnMucosaOfDuodenum.setVisible(false);
        btnPathologyOfDuodenum.setVisible(false);
        btnWhatHasInDuodenum.setVisible(false);
    }

    private void showSubItem() {
        btnPathologyOfDuodenum.setVisible(true);
        btnWhatHasInDuodenum.setVisible(true);
        btnFlowOfDuodenum.setVisible(true);
        btnMucosaOfDuodenum.setVisible(true);
    }

    public void onShowFullNameOFMainBtn(MouseEvent event) {
        btnMainDuodenum.setPrefWidth(250);
    }

    public void onHideFullNameOFMainBtn(MouseEvent event) {
        btnMainDuodenum.setPrefWidth(100);
    }

}
