package application;
	


import java.io.BufferedReader;
import java.io.FileReader;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;

public class Main extends Application {
    private TableView<Estudiante> tabla = new TableView<Estudiante>();
    public void Leer()
    {
    	ObservableList<Estudiante> data = FXCollections.observableArrayList();
        BufferedReader br;
        try {
        	br = new BufferedReader(new FileReader("\\Users\\Jose Maria Vindas\\Desktop\\Prueba.csv"));
            String line = br.readLine();
            while (line != null) {
                String[] Posi = line.split(";", -1);
                Estudiante est = new Estudiante(Posi[0], Posi[1], Posi[2]); 
                data.add(est);
                line = br.readLine();
            }
            tabla.setItems(data);
 
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }	
    @Override
	public void start(Stage primaryStage) {
    	try {
    		Pane root = new Pane();
            Scene scene = new Scene(root, 1000, 500);
            
            HBox areaBotones = new HBox();
            Button btn = new Button("Opcion 1");
            btn.setLayoutX(500);
            btn.setLayoutY(10);
            btn.setOnAction(new EventHandler<ActionEvent>() {
            	@Override
            	public void handle(ActionEvent event) {
            		try 
            		{
            			Leer();
            		}
            		catch(Exception e)
            		{
            			e.printStackTrace();
            		}
            	}
            });
            
    	    TableColumn<Estudiante, String> nombre = new TableColumn<>("Carne");
            nombre.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("carne"));
            TableColumn<Estudiante, String> apellido = new TableColumn<>("Nombre");
            apellido.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("nombre"));
            TableColumn<Estudiante, String> email = new TableColumn<>("Correo");
            email.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("correo"));
            TableColumn<Estudiante, String> tele = new TableColumn<>("Telefono");
            tele.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("telefono"));
            TableColumn<Estudiante, String> nick = new TableColumn<>("Nickname");
            nick.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("nickname"));
            tabla.getColumns().addAll(nombre, apellido, email, tele, nick);
            
            root.getChildren().add(btn);
            root.getChildren().add(tabla);
            primaryStage.setTitle("Prueba");
            primaryStage.setScene(scene);
            primaryStage.show();
            
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
	}
	public static void main(String[] args) {
		launch(args);
	}

}
