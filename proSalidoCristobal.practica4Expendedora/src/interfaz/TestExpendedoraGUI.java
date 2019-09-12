package interfaz;

import excepciones.AlcoholHorarioIlegal;
import excepciones.CreditoInsuficienteException;
import excepciones.NoHayCambioException;
import excepciones.NoHayProductoException;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import modelo.Expendedora;
import modelo.Producto;

public class TestExpendedoraGUI extends Application {
	GridPane root;
	Expendedora exp;
	TextField tfCredito;
	TextField tfVentas;
	TextField tfCambio;
	Button btnComprar;

	public static void main(String[] args) {
		// Lanzamos el interfaz gr�fico
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		root = new GridPane();
		Scene escena = new Scene(root, 500, 500);
		primaryStage.setScene(escena);
		inicializar();
		primaryStage.setTitle("Expendedora");
		primaryStage.show();
	}

	private void inicializar() {
		// Creamos una expendedora que vende 10 botellas de agua a 0.70
		// y con 5 euros de cambio
		Producto p = new Producto("AGUA_1.5L", "Agua 1.5 litros", 0.1, 0.70, 10);
		exp = new Expendedora(5, p);

		// Para el estado de la expendedora: Etiquetas y cuadros de texto
		Label lblCredito = new Label("Credito:");
		Label lblVentas = new Label("Total vendido:");
		Label lblCambio = new Label("Cambio disponible:");
		
		tfCredito = new TextField("0.0");
		tfVentas = new TextField("0.0");
		tfCambio = new TextField("0.0");
		
		tfCredito.setEditable(false);
		tfVentas.setEditable(false);
		tfCambio.setEditable(false);
		
		// Creamos los botones del dinero y los agregamos a un panel
		
		Button btn5 = new Button("0.05 �", new ImageView(new Image("iconos/5.jpg")));
		Button btn10 = new Button("0.10 �", new ImageView(new Image("iconos/10.gif")));
		Button btn20 = new Button("0.20 �", new ImageView(new Image("iconos/20.gif")));
		Button btn50 = new Button("0.50 �", new ImageView(new Image("iconos/50.gif")));
		Button btn100 = new Button("1 �", new ImageView(new Image("iconos/100.gif")));
		Button btn200 = new Button("2 �", new ImageView(new Image("iconos/200.gif")));
		//Boton devoluci�n
		Button btnDev = new Button("Devoluci�n de cr�dito");
		
		//Damos a todos los botones la misma anchura y altura
		int ancho = 140, alto = 120;
		btn5.setPrefSize(ancho, alto);
		btn10.setPrefSize(ancho, alto);
		btn20.setPrefSize(ancho, alto);
		btn50.setPrefSize(ancho, alto);
		btn100.setPrefSize(ancho, alto);
		btn200.setPrefSize(ancho, alto);
		
		btn5.setOnAction((event) -> {
			dinero(0.05);
		});
		btn10.setOnAction((event) -> {
			dinero(0.10);
		});
		btn20.setOnAction((event) -> {
			dinero(0.20);
		});
		btn50.setOnAction((event) -> {
			dinero(0.50);
		});
		btn100.setOnAction((event) -> {
			dinero(1);
		});
		btn200.setOnAction((event) -> {
			dinero(2);
		});
		btnDev.setOnAction((event) -> {
			devolucionDeCredito();
		});

		GridPane panelDinero = new GridPane(); 
		//HBox panelDinero = new HBox();
		panelDinero.setPadding(new Insets(10, 10, 10, 10));
		panelDinero.setHgap(10);
		panelDinero.setVgap(10);
		//panelDinero.setSpacing(10);
//		panelDinero.getChildren().add(btn5);
//		panelDinero.getChildren().add(btn10);
//		panelDinero.getChildren().add(btn20);
//		panelDinero.getChildren().add(btn50);
//		panelDinero.getChildren().add(btn100);
//		panelDinero.getChildren().add(btn200);
		
		panelDinero.add(btn5,0,0);
		panelDinero.add(btn10,1,0);
		panelDinero.add(btn20,2,0);
		panelDinero.add(btn50,0,1);
		panelDinero.add(btn100,1,1);
		panelDinero.add(btn200,2,1);
		panelDinero.add(btnDev,0,3);

		// Boton para comprar
		HBox panelProducto = new HBox();
		panelProducto.setPadding(new Insets(10, 10, 10, 10));
		panelProducto.setSpacing(10);
		panelProducto.setAlignment(Pos.CENTER);
		String textoBotonComprar = "AGUA_1.5L" + "\n(" + exp.getPrecio() + " �)\n" + exp.getStock() + " uds";
		btnComprar = new Button(textoBotonComprar,new ImageView(new Image("iconos/agua.jpg")));
		btnComprar.setOnAction((event) -> {
			comprar();
		});
		panelProducto.getChildren().add(btnComprar);

		// Distribuimos elementos en la cuadr�cula
		root.setAlignment(Pos.CENTER);
		root.setHgap(10);
		root.setVgap(5);

		root.add(panelDinero, 0, 0, 2, 1);

		root.add(lblCredito, 0, 1);
		root.add(lblCambio, 0, 2);
		root.add(lblVentas, 0, 3);
		root.add(tfCredito, 1, 1);
		root.add(tfCambio, 1, 2);
		root.add(tfVentas, 1, 3);

		root.add(panelProducto, 0, 4, 2, 1);

		// Mostrar estado de la expendedora
		mostrarEstado();

	}

	private void saludar(String nombre) {
		Alert aviso = new Alert(AlertType.NONE, "Hola " + nombre, ButtonType.OK);
		aviso.showAndWait();
	}

	private void dinero(double importe) {
		exp.introducirDinero(importe);
		mostrarEstado();
	}
	private void devolucionDeCredito() {
		exp.solicitarDevolucion();
		mostrarEstado();
	}

	private void comprar() {
		Alert aviso;
		try {
			double cambio = exp.comprarProducto();
			aviso = new Alert(AlertType.INFORMATION,"Gracias por la compra. Su cambio: " + cambio + " euros", ButtonType.OK);
			aviso.showAndWait();
			mostrarEstado();		
		} catch (NoHayCambioException e1) {
			aviso = new Alert(AlertType.ERROR,"No hay cambio suficiente para devolverle. Introduzca importe exacto", ButtonType.OK);
			aviso.showAndWait();		
		} catch (NoHayProductoException e1) {
			aviso = new Alert(AlertType.ERROR,"Se ha agotado el producto. Disculpe las molestias", ButtonType.OK);
			aviso.showAndWait();
		} catch (CreditoInsuficienteException e1) {
			aviso = new Alert(AlertType.ERROR,"Credito insuficiente. Debe introducir al menos " + exp.getPrecio() + " euros", ButtonType.OK);
			aviso.showAndWait();
		}catch (AlcoholHorarioIlegal e1) {
			aviso = new Alert(AlertType.ERROR,"Prohibida la venta de bebidas alcoh�licas de 22:00 a 9:00 ", ButtonType.OK);
			aviso.showAndWait();
		}
	}

	private void mostrarEstado() {
		tfCambio.setText("" + exp.getCambio());
		tfCredito.setText("" + exp.getCredito());
		tfVentas.setText("" + exp.getImporteVendido());
		String textoBotonComprar = "AGUA_1.5L" + "\n(" + exp.getPrecio() + " �)\n" + exp.getStock() + " uds";
		btnComprar.setText(textoBotonComprar);
	}
}
