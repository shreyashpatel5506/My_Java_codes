import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override       
    public void start(Stage baseStage) {
        baseStage.setTitle("patel");
        Circle circle = new Circle(50, Color.BLUE);

        circle.setOnMouseEntered(event -> {
            circle.setFill(Color.RED);
            System.out.println("Mouse entered the circle!");
        });

        circle.setOnMouseExited(event -> {
            circle.setFill(Color.BLUE);
            System.out.println("Mouse exited the circle!");
        });

        StackPane root = new StackPane();
        root.getChildren().add(circle);
        Scene scene = new Scene(root, 400, 400);
        baseStage.setScene(scene);
        baseStage.show();
    }
}
