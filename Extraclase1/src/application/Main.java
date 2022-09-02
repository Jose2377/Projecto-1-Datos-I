package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;

/**
 * Clase Main de la aplicacion
 * @author Jose Maria Vindas
 *
 */
public class Main extends Application {
    private TableView<Estudiante> tabla = new TableView<Estudiante>();
    
    /**
     * Clase que permite abrir y leer un archivo .csv para luego poner una tabla con la informacion del archivo
     *      */
    public void Leer()
    {
    	ObservableList<Estudiante> data = FXCollections.observableArrayList();
        BufferedReader br;
        FileChooser file = new FileChooser();
        file.setTitle("Seleccione el archivo");
        file.getExtensionFilters().add(new FileChooser.ExtensionFilter("CSV","*.csv"));
        File file1 = file.showOpenDialog(null);
        try {
        	br = new BufferedReader(new FileReader(file1));
            String line = br.readLine();
            String[] Posi = line.split(";", -1);

    	    TableColumn<Estudiante, String> carne = new TableColumn<>(Posi[0]);
            carne.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("carne"));
            TableColumn<Estudiante, String> nombre = new TableColumn<>(Posi[1]);
            nombre.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("nombre"));
            TableColumn<Estudiante, String> email = new TableColumn<>(Posi[2]);
            email.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("correo"));
            TableColumn<Estudiante, String> tele = new TableColumn<>(Posi[3]);
            tele.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("telefono"));
            TableColumn<Estudiante, String> nick = new TableColumn<>(Posi[4]);
            nick.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("nickname"));
            TableColumn<Estudiante, String> tipo = new TableColumn<>(Posi[5]);
            tipo.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("tipo"));
            tipo.setPrefWidth(50);
            TableColumn<Estudiante, String> exam = new TableColumn<>(Posi[6]);
            exam.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("exam"));
            TableColumn<Estudiante, String> quiz = new TableColumn<>(Posi[7]);
            quiz.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("quic"));
            TableColumn<Estudiante, String> tarea = new TableColumn<>(Posi[8]);
            tarea.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("tarea"));
            TableColumn<Estudiante, String> pro1 = new TableColumn<>(Posi[9]);
            pro1.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("pro1"));
            pro1.setPrefWidth(100);
            TableColumn<Estudiante, String> pro2 = new TableColumn<>(Posi[10]);
            pro2.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("pro2"));
            pro2.setPrefWidth(100);
            TableColumn<Estudiante, String> pro3 = new TableColumn<>(Posi[11]);
            pro3.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("pro3"));
            pro3.setPrefWidth(100);
            TableColumn<Estudiante, String> prom1 = new TableColumn<>("Prom. Proyectos");
            prom1.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("prom1"));
            prom1.setPrefWidth(100);
            TableColumn<Estudiante, String> prom2 = new TableColumn<>("Prom. Trabajos");
            prom2.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("prom2"));
            prom2.setPrefWidth(100);
            TableColumn<Estudiante, String> promf = new TableColumn<>("Prom. Final");
            promf.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("promf"));
            promf.setPrefWidth(80);
            
            tabla.getColumns().addAll(carne, nombre, email, tele, nick, tipo, exam, quiz, tarea, pro1, pro2, pro3, prom1, prom2, promf);
            
            line = br.readLine();
            
            while (line != null) {
                Posi = line.split(";", -1);
                if (Posi.length > 11)
                {
                	Estudiante est;
                	if (Posi[5].equals("A"))
                	{
                		est = new EstudianteA(Posi[0], Posi[1], Posi[2], Posi[3], Posi[4], Posi[5], Posi[6], Posi[7], Posi[8], Posi[9], Posi[10], Posi[11]); 
                	}
                	else
                	{
                		est = new EstudianteB(Posi[0], Posi[1], Posi[2], Posi[3], Posi[4], Posi[5], Posi[6], Posi[7], Posi[8], Posi[9], Posi[10], Posi[11]); 
                	}
                	data.add(est);
                }
                line = br.readLine();
            }
            tabla.setItems(data);
 
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }	
    @Override
    /** 
     * Metodo Principal del main, que crea una aplicacion con una tabla vacia y un boton
     * que permite abrir un archivo cvs.
     */
	public void start(Stage primaryStage) {
    	try {
    		//Crea una escena
    		Pane root = new Pane();
            Scene scene = new Scene(root, 1270, 500);
            
            //Creando el boton con el evento que lleva a la funcion leer
            Button btn = new Button("Abrir archivo");
            btn.setLayoutX(600);
            btn.setLayoutY(420);
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
            // Se agregan a la escena
            root.getChildren().add(btn);
            root.getChildren().add(tabla);
            // Se crea la aplicacion
            primaryStage.setResizable(false);
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
