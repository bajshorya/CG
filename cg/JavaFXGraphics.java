import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFXGraphics extends Application {
    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(400, 300);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.GREEN);
        gc.fillRect(50, 50, 100, 50); // Rectangle
        gc.setFill(Color.RED);
        gc.fillOval(200, 50, 50, 50); // Circle

        Group root = new Group();
        root.getChildren().add(canvas);
        Scene scene = new Scene(root, 400, 300);
        stage.setTitle("JavaFX Graphics");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
