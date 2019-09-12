package _02ejemplos;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class _04SaludoPersonalizado extends Application{
	// panel en cuadriculas
	GridPane root;
	
	public static void main(String[]args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		root = new GridPane();
		Scene escena = new Scene (root, 300,300);
		primaryStage.setScene(escena);
		inicializar();
		primaryStage.setTitle("Saludo personalizado");
		primaryStage.show();
		
	}

	private void inicializar() {
		//añadimos elementos
		Label lblNombre= new Label ("Nombre: ");
		TextField tfNombre = new TextField("");
		Button btnSaludar = new Button("Saludar");		
		
		//Colocamos los elementos sobre la ventana
		//podemos definir la posición de los componenetes
		root.setAlignment(Pos.CENTER);
		//tambien la separación entre los mismos
		root.setHgap(10);
		root.setVgap(10);
		//la posición columna / fila (al reves que en matrices)
		root.add(lblNombre, 0, 0);
		root.add(tfNombre, 1, 0);
		root.add(btnSaludar, 0, 1);

		//vamos a hacer que se salude al nombre que pongamos en el textfield
		btnSaludar.setOnAction((event)->{
			saludar(tfNombre.getText());
		});
		
		}

	private void saludar(String nombre) {
		//alert nos saca una ventana con un mensaje
		Alert aviso = new Alert(AlertType.NONE,"Hola " + nombre, ButtonType.OK);
		aviso.showAndWait();
		
	}


}
