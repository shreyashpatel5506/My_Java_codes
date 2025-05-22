package javafx;

import javafx.application.*;
import javafx.geometry.Insets;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.scene.control.*;

public class App extends Application {
    Scene scene, scene2;

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
            primarstage.setScene(scene2);

        });

        root.getChildren().addAll(name, nameInput, password, passwordInput, loginButton);
        scene = new Scene(root, 300, 200);

        GridPane grid2 = new GridPane();
        grid2.setPadding(new Insets(10, 10, 10, 10));
        grid2.setHgap(7);
        grid2.setVgap(10);
        Label mobileno = new Label("Mobile Number:");
        GridPane.setConstraints(mobileno, 0, 0);
        TextField mobilenoInput = new TextField();
        mobilenoInput.setPromptText("Enter your mobile number");
        GridPane.setConstraints(mobilenoInput, 1, 0);

        Label email = new Label("Email:");
        GridPane.setConstraints(email, 0, 1);
        TextField emailInput = new TextField();
        emailInput.setPromptText("Enter your email");
        GridPane.setConstraints(emailInput, 1, 1);

        Button submitButton = new Button("Submit");
        GridPane.setConstraints(submitButton, 1, 2);
        submitButton.setOnAction(e -> {
            String mobilenoText = mobilenoInput.getText();
            String emailText = emailInput.getText();
            System.out.println("Mobile Number: " + mobilenoText);
            System.out.println("Email: " + emailText);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Contact Info");
            alert.setHeaderText(null);
            alert.setContentText("Mobile Number: " + mobilenoText + "\nEmail: " + emailText);
            alert.showAndWait();
        });

        grid2.getChildren().addAll(mobileno, mobilenoInput, email, emailInput, submitButton);
        scene2 = new Scene(grid2, 300, 200);

        primarstage.setScene(scene);
        primarstage.show();
    }
}
