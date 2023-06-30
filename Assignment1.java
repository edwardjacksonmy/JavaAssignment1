import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.io.IOException;

public class Assignment1 extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        // Create the main layout pane
        BorderPane borderPane = new BorderPane();

        // Set background image
        Image image = new Image("background.png");
        BackgroundSize backgroundSize = new BackgroundSize(1080, 720, false, false, false, false);
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, backgroundSize);
        borderPane.setBackground(new Background(backgroundImage));

        HBox topBarAndIcons = new HBox();
        topBarAndIcons.setStyle("-fx-background-color: darkblue; -fx-color: #000000;");
        topBarAndIcons.setAlignment(Pos.CENTER);
        topBarAndIcons.setSpacing(10);
        topBarAndIcons.setPadding(new Insets(10));

        MenuBar menuBar = topBar();
        HBox socialIcons = socialIcons();
        HBox.setHgrow(menuBar, Priority.ALWAYS);
        topBarAndIcons.getChildren().addAll(menuBar, socialIcons);

        // Add the message label
        Label messageLabel = new Label("Race and become legend of the streets!");
        messageLabel.setStyle("-fx-text-fill: #ff2222; -fx-font-size: 24px; -fx-font-weight: bold;");
        messageLabel.setAlignment(Pos.BOTTOM_LEFT);
        messageLabel.setWrapText(true);

        // Create a VBox to hold the message label
        VBox messageBox = new VBox(messageLabel);
        messageBox.setAlignment(Pos.BOTTOM_LEFT);
        messageBox.setPadding(new Insets(10));

        // Set the VBox as the bottom element of the border pane
        borderPane.setBottom(messageBox);

        borderPane.setTop(topBarAndIcons);

        // Create the start button
        Button startButton = new Button();
        Image startImage = new Image("start.png");
        ImageView startImageView = new ImageView(startImage);
        startImageView.setFitWidth(40);
        startImageView.setFitHeight(40);
        startButton.setGraphic(startImageView);

        startButton.setOnAction(e -> {
            // Define the behavior when the button is clicked
            System.out.println("INITIAL D!");
            // Add your desired functionality here
        });
        //create hbox, button wiil be child of hbox
        //borderpane set bottom, put borderpane into the hbox, need padding for hbox
        // Add the start button to the center of the border pane
        borderPane.setLeft(startButton);

        Scene scene = new Scene(borderPane, 1080, 717);
        stage.setTitle("Initial D Arcade Stage 8");
        stage.setScene(scene);
        stage.show();
    }

    public MenuBar topBar() {
        Menu menuMenu = new Menu("Menu");
        Menu menuDocs = new Menu("Docs");
        Menu menuWallpaper = new Menu("Wallpaper");

        MenuBar menuBar = new MenuBar(menuMenu, menuDocs, menuWallpaper);
        menuBar.setStyle("-fx-background-color: black; -fx-font-family: 'Comic Sans MS'; -fx-alignment: center;");


        return menuBar;
    }

    public HBox socialIcons() {
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER_RIGHT);
        hbox.setSpacing(10);

        Image facebookImage = new Image("facebook.png");
        ImageView facebookImageView = new ImageView(facebookImage);
        facebookImageView.setFitWidth(30);
        facebookImageView.setFitHeight(30);
        hbox.getChildren().add(facebookImageView);

        Image twitterImage = new Image("twitter.png");
        ImageView twitterImageView = new ImageView(twitterImage);
        twitterImageView.setFitWidth(30);
        twitterImageView.setFitHeight(30);
        hbox.getChildren().add(twitterImageView);

        Image instagramImage = new Image("instagram.png");
        ImageView instagramImageView = new ImageView(instagramImage);
        instagramImageView.setFitWidth(30);
        instagramImageView.setFitHeight(30);
        hbox.getChildren().add(instagramImageView);

        return hbox;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
