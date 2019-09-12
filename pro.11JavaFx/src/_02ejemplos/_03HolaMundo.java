package _02ejemplos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class _03HolaMundo extends Application {
	FlowPane root;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	//Stage es el "escenario", que representa la venta principal
	// de la aplicacion.
	public void start(Stage primaryStage) throws Exception {
		//Los componentes del programa se colocarán sobre un contenedor. 
		// root es el contenedror principal sobre el que colocaremos otros
		// componentes.
		//El tipo de Pane utilizado (Stacks en este caso) determnará cómo
		// se distribuyen los elementos en el Pane (y por tanto en la plantilla)
		//Distintos tipos de Pane tienen distintos layouts
		// El tipo FlowPane coloca en linea de izquiera a derecha y cuando se acaba el espacio
		// de abajo a arriba siguiendo la norma izquierda derecha.
		root = new FlowPane();
		
		//El Scene es el contenedor principal de la aplicación
		// Al crearlo indicamos las dimensiones que queremos que tenga
		// y añadimos el contenedor root	
		Scene escena = new Scene(root, 400,300);
		
		//Asociamos la escena con el escenario.
		primaryStage.setScene(escena);
		
		//Inicializar componentes
		inicializar();
		
		//Damos título a la ventana y la mostramos
		primaryStage.setTitle("Mi primera aplicación");
		primaryStage.show();
	}

	private void inicializar() {
		Button btnHola = new Button("Di 'Hello World'");
		//Con las expresiones landa podemos pasar codigo como parametro
		btnHola.setOnAction((event)->{
			hola();
		});	
		root.getChildren().add(btnHola);
		
		Button btnAdios = new Button("Di 'Bye World'");
		btnAdios.setOnAction((event)->{
			Alert aviso = new Alert(AlertType.NONE,"Bye World!!!", ButtonType.FINISH);
			aviso.showAndWait();
		});
		root.getChildren().add(btnAdios);	
	}
	
	private void hola() {
		Alert aviso = new Alert(AlertType.WARNING,"Hello World", ButtonType.FINISH);
		aviso.showAndWait();
	}
	

}
