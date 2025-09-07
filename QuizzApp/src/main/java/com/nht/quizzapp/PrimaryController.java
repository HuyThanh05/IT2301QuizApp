package com.nht.quizzapp;

import com.nht.ultils.MyAlert;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrimaryController {

    public void handleQuestionMAnagement(ActionEvent event) throws IOException {
        Scene scene = new Scene(new FXMLLoader(App.class.getResource("questions.fxml")).load());
         Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Quizz App");
        stage.show();
    }

    public void handlePractice(ActionEvent event) {
        MyAlert.getInstance().showMsg("Comming soon...");
    }

}
