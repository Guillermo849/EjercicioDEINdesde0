package application;
	
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.Event;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		TextField tfNombre = new TextField();
		Label lblNombre = new Label("Introduzca su nombre");
		Label lblGenerico = new Label("");
		Button btnCerrar = new Button("Cerrar");
		// Creamos el contenedor donde se guardarán todos los anteriores objetos
		VBox caja = new VBox();
		caja.getChildren().addAll(lblNombre, tfNombre, lblGenerico, btnCerrar);

		Scene scene = new Scene(caja,400,400);
		// Añadimos a la Scene la hoja de estilos CSS
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		// Hacemos que la ventana tenga un tamaño fijo que no se pueda modificar
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
