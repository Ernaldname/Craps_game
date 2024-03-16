package org.example.crapsgame.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GameStage extends Stage {
    public GameStage() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "/org/example/crapsgame/game-view.fxml"));
        Parent root = loader.load();
        setTitle("Juego de Craps");
        Scene scene = new Scene(root);
        setScene(scene);
    }
    public static GameStage getInstance() throws IOException{
        return GameStage.GameStageHolder.INSTANCE = new GameStage();
    }

    private static class GameStageHolder {
        private static GameStage INSTANCE;
    }

}
