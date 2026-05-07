module javafx_UIcontrol {
	requires javafx.controls;
	requires javafx.graphics;
	
	opens duy.app to javafx.graphics, javafx.fxml;
}
