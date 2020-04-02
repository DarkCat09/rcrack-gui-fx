package sample;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;

public class ConvController {
    @FXML public GridPane gridPane1;
    @FXML public TextField browseRtiDirTextField1;
    @FXML public Button browseRtiDirButton1;
    @FXML public ChoiceBox tablesRtiFormatChoiceBox1;
    @FXML public Button convertButton1;
    @FXML public Stage primaryStage;

    File tablesDirectory;
    String tablesDirectoryPath = "";

    public void BrowseRtiDirectory(ActionEvent actionEvent) {
        DirectoryChooser dc = new DirectoryChooser();
        dc.setTitle("Select a folder with RTI");
        dc.setInitialDirectory(new File(System.getProperty("user.home")));

        tablesDirectory = dc.showDialog(primaryStage);
        tablesDirectoryPath = tablesDirectory.getAbsolutePath();

        browseRtiDirTextField1.setText(tablesDirectory.getAbsolutePath());
    }

    public void StartConverting(ActionEvent actionEvent) {
    }
}
