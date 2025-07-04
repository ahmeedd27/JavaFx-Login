package org.example.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class MianController {
    @FXML
    private Label status;
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    public void login(ActionEvent e) throws IOException {
        if(username.getText().equals("ahmed") && password.getText().equals("8112003")){
            status.setText("Login Success");
            Stage stage=new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/org/example/login/Main.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 400, 400);
            stage.setScene(scene);
            stage.show();

        }else{
            status.setText("Login Failed");
        }
    }
}
