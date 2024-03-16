package org.example.crapsgame.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeStage extends Stage {
    public WelcomeStage() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "/org/example/crapsgame/welcome-view.fxml"));
        Parent root = loader.load();
        setTitle("Juego de Craps");
        Scene scene = new Scene(root);
        setScene(scene);

        /** getIcons().add(new Image(
                String.valueOf(getClass().getResource("/org/example/crapsgame/image/dados.png"))
        ));
         **/

        setResizable(false);
        show();
    }
    public static WelcomeStage getInstance() throws IOException{
        return WelcomeStageHolder.INSTANCE = new WelcomeStage();
    }

    private static class WelcomeStageHolder {
        private static WelcomeStage INSTANCE;
    }
}
