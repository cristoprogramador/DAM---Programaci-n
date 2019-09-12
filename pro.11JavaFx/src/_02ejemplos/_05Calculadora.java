package _02ejemplos;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class _05Calculadora extends Application {
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
		Label lblNum1= new Label ("Num 1: ");
		Label lblNum2= new Label ("Num 2: ");
		TextField tfNum1 = new TextField("");
		TextField tfNum2 = new TextField("");
		Button btnSumar = new Button("+");	
		Button btnRestar = new Button("-");
		Button btnMultiplicar = new Button("x");
		Button btnDividir = new Button("/");
		Label lblResul= new Label ("RESULTADO: ");
		TextField tfResul = new TextField("");
		
		//Colocamos los elementos sobre la ventana
		//podemos definir la posición de los componenetes
		root.setAlignment(Pos.CENTER);
		//tambien la separación entre los mismos
		root.setHgap(10);
		root.setVgap(10);
		//la posición columna / fila (al reves que en matrices)
		root.add(lblNum1, 0, 0);
		root.add(tfNum1, 1, 0);
		root.add(lblNum2, 0, 1);
		root.add(tfNum2, 1, 1);
		root.add(btnSumar, 3, 0);
		root.add(btnRestar, 3, 1);
		root.add(btnMultiplicar, 3, 2);
		root.add(btnDividir, 3, 3);
		root.add(lblResul, 0, 3);
		root.add(tfResul, 1, 3);

		//vamos a hacer que se salude al nombre que pongamos en el textfield
		btnSumar.setOnAction((event)->{
			tfResul.setText(calcular(tfNum1.getText(), tfNum2.getText(), 1));
		});
		btnRestar.setOnAction((event)->{
			tfResul.setText(calcular(tfNum1.getText(), tfNum2.getText(), 2));
		});
		btnMultiplicar.setOnAction((event)->{
			tfResul.setText(calcular(tfNum1.getText(), tfNum2.getText(), 3));
		});
		btnDividir.setOnAction((event)->{
			tfResul.setText(calcular(tfNum1.getText(), tfNum2.getText(), 4));
		});
		
		}

	private String calcular(String num1, String num2, int operacion) {
		double numero1 = Integer.parseInt(num1);
		double numero2 = Integer.parseInt(num2);
		if (operacion == 1) {
			return String.valueOf(numero1 + numero2);
		}
		if (operacion == 2) {
			return String.valueOf(numero1 - numero2);
		}
		if (operacion == 3) {
			return String.valueOf(numero1 * numero2);
		}
		if (operacion == 4) {
			return String.valueOf(numero1 / numero2);
		}
		return "0";
		
		
	}


}
