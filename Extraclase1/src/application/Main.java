package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;

public class Main extends Application {
	
    private TableView<Estudiante> tabla = new TableView<Estudiante>();
    @Override
	public void start(Stage primaryStage) {
    	   TableColumn<Estudiante, String> nombre = new TableColumn<>("Carne");
           nombre.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("carne"));

           TableColumn<Estudiante, String> apellido = new TableColumn<>("Nombre");
           apellido.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("nombre"));

           TableColumn<Estudiante, String> email = new TableColumn<>("Correo");
           email.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("correo"));

           tabla.getColumns().addAll(nombre, apellido, email);

           ObservableList<Estudiante> data = FXCollections.observableArrayList(
                   new Estudiante("123", "Jose 1", "nose"),
                   new Estudiante("456", "Jose 2", "jose"),
                   new Estudiante("789", "Jose 3", "ajksg"));

           tabla.setItems(data);
           
           Scene scene = new Scene(tabla, 1000, 500);
           primaryStage.setScene(scene);
           primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
