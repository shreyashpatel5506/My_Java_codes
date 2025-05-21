import java.util.Stack;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;    
import javafx.scene.control.Label;

public class App extends Application{
    Scene scene1, scene2;
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage window){
        Label label1 = new Label("Shreyash Patel");
        Label label2 = new Label("Hello World!");
        
        Button button1 = new Button("Click Me");
        button1.setTextFill(Color.WHITE);
        button1.setStyle("-fx-background-color:rgb(5, 5, 5);"); // Red background
        button1.setOnAction(e -> window.setScene(scene2));
        
        VBox layout1 = new VBox();
        scene1 = new Scene(layout1, 400, 400);
        layout1.getChildren().addAll(label1, button1);
        button1.setText("First Scene");
        layout1.setStyle("-fx-background-color: #FF0000;"); // Red background
        
            
        Button button2 = new Button("Click Me");
        button2.setTextFill(Color.WHITE);
        button2.setStyle("-fx-background-color:rgb(5, 5, 5);");
        
        StackPane layout2 = new StackPane();
         scene2 = new Scene(layout2, 400, 400);
        layout2.getChildren().addAll(label2,button2);          
        layout2.setStyle("-fx-background-color: #0000FF;"); // Blue background
        button2.setText("Second Scene");

        window.setScene(scene1);
        window.setTitle("Shreyash Patel");
        window.show();


    }
}
