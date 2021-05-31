package PayrollProcessingApp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * This class loads the fxml file and sets the scene for the GUI.
 *
 * @author Siddhi Kasera, Sonal Madhok
 **/
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("payroll_processing_gui.fxml"));
        primaryStage.setTitle("Payroll Processing System");
        primaryStage.setScene(new Scene(root, 600, 450));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
