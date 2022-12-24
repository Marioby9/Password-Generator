module Password_Generator {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.datatransfer;
	requires java.desktop;
	
	opens application to javafx.graphics, javafx.fxml;
}
