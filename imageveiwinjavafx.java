import javafx.application.*;
import javafx.geometry.Insets;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class App extends Application{
    Scene scene,scene2;
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primarstage){
        primarstage.setTitle("Shreyash Patel");
        Image image = new Image("file:/C:/Users/admin/Downloads/pexels-pixabay-2438.jpg");

        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(400);
        imageView.setFitHeight(400);
        imageView.setPreserveRatio(true);
        imageView.setSmooth(true);
        imageView.setCache(true);

        StackPane root = new StackPane();
        root.getChildren().add(imageView);
        scene = new Scene(root, 400, 400);
        primarstage.setScene(scene);
        primarstage.show();
    }
}
