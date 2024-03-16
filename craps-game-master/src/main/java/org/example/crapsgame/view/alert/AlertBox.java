package org.example.crapsgame.view.alert;

import javafx.scene.control.Alert;

public class AlertBox implements IAlertBox {
    @Override
    public void showMessage(String tittle, String header, String content){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(tittle);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
