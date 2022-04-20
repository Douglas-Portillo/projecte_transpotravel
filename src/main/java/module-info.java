module dam2.projecte.transpotravel {
	
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires javafx.graphics;
	requires java.desktop;
   opens dam2.projecte.transpotravel to javafx.fxml;
   exports dam2.projecte.transpotravel;
   exports model;
   
}