package layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Added an example of BorderPane in Java FX.
 *
 * @author Josh Archer
 * @version 1.0
 */
public class BorderPaneExample extends Application
{

    public static final int WIN_SIZE = 500;
    public static final int COL_WIDTH = 300;
    public static final int ROW_WIDTH = 100;

    @Override
    public void start(Stage stage)
    {
        stage.setScene(assembleScene());
        stage.setTitle("Working with Borders");
        stage.show();
    }

    private Scene assembleScene()
    {
        BorderPane panel = new BorderPane();

        panel.setLeft(buildWestPanel());
        panel.setRight(buildEastPanel());
        panel.setBottom(buildSouthPanel());
        panel.setTop(buildNorthPanel());
        panel.setCenter(buildCenterPanel());

        return new Scene(panel, WIN_SIZE, WIN_SIZE);
    }

    private HBox buildNorthPanel()
    {
        HBox panel = new HBox();
        panel.setStyle("-fx-background-color: red");
        panel.setPrefHeight(ROW_WIDTH);

        for (int i = 1; i <= 10; i++)
        {
            panel.getChildren().add(new Button("Hello"));
        }

        return panel;
    }

    private HBox buildSouthPanel()
    {
        HBox panel = new HBox();
        panel.setStyle("-fx-background-color: blue");
        panel.setPrefHeight(ROW_WIDTH);
        return panel;
    }

    private VBox buildEastPanel()
    {
        VBox panel = new VBox();
        panel.setStyle("-fx-background-color: green");
        panel.setPrefWidth(COL_WIDTH);
        return panel;
    }

    private VBox buildWestPanel()
    {
        VBox panel = new VBox();
        panel.setStyle("-fx-background-color: gray");
        panel.setPrefWidth(COL_WIDTH);
        return panel;
    }

    private ScrollPane buildCenterPanel()
    {
        ScrollPane scroller = new ScrollPane();
        scroller.setContent(new ImageView(new Image("owl.jpg")));
        return scroller;
    }
}
