package duy.app;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Label weightLabel = new Label("Cân nặng (kg):");
        TextField weightField = new TextField();
        
        Label heightLabel = new Label("Chiều cao (m):");
        TextField heightField = new TextField();
        
        Button calculateBtn = new Button("Tính BMI");
        Label resultLabel = new Label("Kết quả sẽ hiển thị ở đây");

        
        calculateBtn.setOnAction(e -> {
            try {
                double w = Double.parseDouble(weightField.getText());
                double h = Double.parseDouble(heightField.getText());
                double bmi = w / (h * h);
                resultLabel.setText(String.format("BMI của bạn là: %.2f", bmi));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Vui lòng nhập số hợp lệ!");
            }
        });

        
        VBox root = new VBox(10, weightLabel, weightField, heightLabel, heightField, calculateBtn, resultLabel);
        root.setPadding(new Insets(20));

        Scene scene = new Scene(root, 300, 250);
        	primaryStage.setTitle("BMI Calculator");
        	primaryStage.setScene(scene);
        	primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
