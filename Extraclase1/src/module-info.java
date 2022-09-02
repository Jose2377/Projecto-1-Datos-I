module Extraclase1 {
	requires javafx.controls;
	requires javafx.base;
	requires javafx.graphics;
	requires java.desktop;
	
	opens application to javafx.graphics, javafx.base, javafx.controls, java.desktop;
}
