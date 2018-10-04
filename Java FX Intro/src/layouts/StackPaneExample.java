package layouts;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

/**
 * An example of StackPane in Java FX.
 *
 * @author Josh Archer
 * @version 1.0
 */
public class StackPaneExample extends Application
{

    public static final int WIN_SIZE = 250;
    public static final int CIRC_SIZE_1 = 100;
    public static final int CIRC_SIZE_2 = 70;
    public static final int CIRC_SIZE_3 = 50;

    @Override
    public void start(Stage stage)
    {
        stage.setScene(assembleScene());
        stage.setTitle("Working with Borders");
        stage.show();
    }

    private Scene assembleScene()
    {
        StackPane panel = new StackPane();

        //add a few elements that can overlap
        Circle[] circles = {
                new Circle(CIRC_SIZE_1),
                new Circle(CIRC_SIZE_2),
                new Circle(CIRC_SIZE_3)
        };

        Random random = new Random();
        for (Circle circle : circles)
        {
            circle.setFill(Color.color(random.nextDouble(),
                    random.nextDouble(), random.nextDouble()));
        }

        panel.getChildren().addAll(circles);

        //lets place our circles at different areas of the UI
        StackPane.setAlignment(circles[0], Pos.TOP_RIGHT);
        StackPane.setAlignment(circles[1], Pos.BOTTOM_LEFT);
        StackPane.setAlignment(circles[2], Pos.CENTER_LEFT);

        return new Scene(panel, WIN_SIZE, WIN_SIZE);
    }
}
