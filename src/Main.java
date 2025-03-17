// MainApp.java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create the main layout and scene
        MainLayout mainLayout = new MainLayout();
        Scene scene = new Scene(mainLayout.getLayout(), 800, 600);

        // Set up the primary stage
        primaryStage.setTitle("Student Management System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}