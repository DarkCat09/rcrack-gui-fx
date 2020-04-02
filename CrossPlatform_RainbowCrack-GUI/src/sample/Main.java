package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("RainbowCrack Cross-platform GUI");
        primaryStage.setScene(new Scene(root, 450, 450));
        primaryStage.show();
    }


    public static void main(String[] args) {
        System.out.println();
        System.out.println("--- RainbowCrack Cross-Platform Java GUI 1.0 ---");
        System.out.println("--- by Chechkenev Andrew (DarkCat09/CodePicker13)");
        System.out.println();
        launch(args);
    }
}
