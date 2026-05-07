module HelloJavaFX002 {
	requires javafx.controls;
	
	opens duy.app to javafx.graphics, javafx.fxml;
}
