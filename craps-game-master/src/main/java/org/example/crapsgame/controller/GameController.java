package org.example.crapsgame.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.example.crapsgame.model.Player;

public class GameController {
    @FXML
    private TextField nicknameTextField;

    @FXML
    public void onHandleButtonPlay(ActionEvent event){
        String nickname = nicknameTextField.getText();
        Player player = new Player(1,nickname);
    }

}
