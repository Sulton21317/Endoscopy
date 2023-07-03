package com.uzdev.endoscopy.op_stomach;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class OpStomachController {
    @FXML
    public Button btnFlowOfStomach;
    @FXML
    public Button btnWhatHasInStomach;
    @FXML
    public Button btnMucosaOfStomach;
    @FXML
    public Button btnPathologyOfStomach;
    public Button btnMainOpStomach;
    public AnchorPane subItem;

    private boolean isShowDesc = true;

    @FXML
    private void onStomachBtnClick() {
        if (isShowDesc) {
            showSubItem();
            isShowDesc = false;
        } else {
            hideSubItem();
            isShowDesc = true;
        }
    }

    private void hideSubItem() {
        btnFlowOfStomach.setVisible(false);
        btnMucosaOfStomach.setVisible(false);
        btnWhatHasInStomach.setVisible(false);
        btnPathologyOfStomach.setVisible(false);
    }

    private void showSubItem() {
        btnFlowOfStomach.setVisible(true);
        btnMucosaOfStomach.setVisible(true);
        btnWhatHasInStomach.setVisible(true);
        btnPathologyOfStomach.setVisible(true);
    }

    private Boolean isShowSubItemFlow = true;

    @FXML
    protected void onStomachFlowBtnClick() {
        if (isShowSubItemFlow) {
            subItem.setVisible(true);
            isShowSubItemFlow = false;
        } else {
            subItem.setVisible(false);
            isShowSubItemFlow = true;
        }
    }


    @FXML
    protected void onStomachWhatHasInBtnClick() {


    }

    @FXML
    protected void onStomachMucosaBtnClick() {

    }

    @FXML
    protected void onStomachPathologyBtnClick() {

    }

    @FXML
    protected void onShowFullNameOFBtn() {
        btnWhatHasInStomach.setPrefWidth(250);
    }

    @FXML
    protected void onHideFullNameOFBtn() {
        btnWhatHasInStomach.setPrefWidth(100);
    }

    public void onShowFullNameOFMainBtn(MouseEvent event) {
        btnMainOpStomach.setPrefWidth(250);
    }

    public void onHideFullNameOFMainBtn(MouseEvent event) {
        btnMainOpStomach.setPrefWidth(100);
    }

}
