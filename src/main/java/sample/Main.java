package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // TODO: initialize a new FXMLLoader and use the non-static load class
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/sample.fxml"));

        // TODO: set a controller for the FXML file using the setController() method on the FXMLLoader instance

        // TODO: define different parts of your layout in different FXML files and use fx:include to create a single layout

        // TODO: use different controllers for different FXML files

        // TODO: use a resource bundle to specify text values in your layout; try changing your locale and check the app again

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
