package javafx;

import javafx.application.*;
import javafx.geometry.Insets;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.scene.control.*;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primarstage) {
        primarstage.setTitle("Shreyash Patel");

        GridPane root = new GridPane();
        root.setPadding(new Insets(10, 10, 10, 10));
        root.setHgap(7);
        root.setVgap(10);

        Label name = new Label("Username:");
        GridPane.setConstraints(name, 0, 0);
        TextField nameInput = new TextField();
        nameInput.setPromptText("Enter your username");
        GridPane.setConstraints(nameInput, 1, 0);

        Label password = new Label("Password:");
        GridPane.setConstraints(password, 0, 1);
        PasswordField passwordInput = new PasswordField();
        passwordInput.setPromptText("Enter your password");
        GridPane.setConstraints(passwordInput, 1, 1);

        Button loginButton = new Button("Login");
        GridPane.setConstraints(loginButton, 1, 2);

        loginButton.setOnAction(e -> {
            String username = nameInput.getText();
            String passwordText = passwordInput.getText();
            System.out.println("Username: " + username);
            System.out.println("Password: " + passwordText);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Login Info");
            alert.setHeaderText(null);
            alert.setContentText("Username: " + username + "\nPassword: " + passwordText);
            alert.showAndWait();

        });

        root.getChildren().addAll(name, nameInput, password, passwordInput, loginButton);
        Scene scene = new Scene(root, 300, 200);
        primarstage.setScene(scene);
        primarstage.show();

    }
}
