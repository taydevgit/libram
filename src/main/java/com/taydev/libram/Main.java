package com.taydev.libram;

import java.util.Properties;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

                // title bar
        Button closeBtn = new Button("X");
        closeBtn.getStyleClass().addAll("window-btn", "close-btn");
        closeBtn.setOnAction(e -> stage.close());

        Button minimizeBtn = new Button("-");
        minimizeBtn.getStyleClass().addAll("window-btn");
        minimizeBtn.setOnAction( e -> stage.setIconified(true));

        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);

        HBox titleBar = new HBox(spacer, minimizeBtn, closeBtn);
        titleBar.getStyleClass().add("title-bar");
        titleBar.setAlignment(Pos.CENTER_RIGHT);

        //  Main content area
        Label label = new Label("Libram v" + getVersion());
        StackPane content = new StackPane(label);
        StackPane.setAlignment(label, Pos.CENTER);

        // root layout
        BorderPane root = new BorderPane();
        root.setTop(titleBar);
        root.setCenter(content);
        // Label label = new Label("Libram is alive.");
        // StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 800, 600);

        stage.setTitle("Libram v" + getVersion());
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.getIcons().add(new Image(
            Main.class.getResourceAsStream("/libram-icon.png")
        ));
        scene.getStylesheets().add(
            Main.class.getResource("/styles.css").toExternalForm()
        );




        // drag window functionality since sidebar is disabled
        // Variables to track drag offset
        final double[] dragOffset = new double[2];

        scene.setOnMousePressed(e -> {
            dragOffset[0] = stage.getX() - e.getScreenX();
            dragOffset[1] = stage.getY() - e.getScreenY();
        });

        scene.setOnMouseDragged(e -> {
            stage.setX(e.getScreenX() + dragOffset[0]);
            stage.setY(e.getScreenY() + dragOffset[1]);
        });


        // keyboard shortcuts here
        scene.setOnKeyPressed(e -> {
            if (e.getCode() == javafx.scene.input.KeyCode.ESCAPE) {
                stage.close();
            }
        });


        // entry point here keep this at the bottom of the start function
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static String getVersion() {
        try{
            Properties props = new Properties();
            props.load(Main.class.getResourceAsStream("/app.properties"));
            return props.getProperty("app.version", "unknown");
        } catch(Exception e) {
            return "unknown";
        }
    }
}