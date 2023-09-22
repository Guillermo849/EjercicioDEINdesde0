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
		Label lblSaludar = new Label("");
		Button btnCerrar = new Button("Cerrar");
		// Añadimos al botón de cerrar la acción de cerrar el programa
		btnCerrar.setOnAction(e -> {
			Platform.exit();
			});
		// Cuando se pulse Enter se ejecutará el metodo esKenobi
		tfNombre.setOnAction(e -> {
			lblSaludar.setText(esKenobi(tfNombre.getText()));
			});

		// Creamos el contenedor donde se guardarán todos los anteriores objetos
		VBox caja = new VBox();
		caja.getChildren().addAll(lblNombre, tfNombre, lblSaludar, btnCerrar);

		Scene scene = new Scene(caja,400,400);
		// Añadimos a la Scene la hoja de estilos CSS
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		// Hacemos que la ventana tenga un tamaño fijo que no se pueda modificar
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	
	// Este metodo comprueba si el nombre coincide con el nombre Ovi Wan
	private String esKenobi(String nombre) {
		if (nombre.equals("Obi Wan")) {
			alertaGrievous();
			return "";
		} if (nombre.equals("")) {
			return "";
		} else {
			return "Hola " + nombre;
		}
	}
	
	// Abre una ventana de Aviso
	private void alertaGrievous() {
		Alert alerta = new Alert(Alert.AlertType.WARNING);
		alerta.setHeaderText(null);
		alerta.setTitle("General Grievous");
		alerta.setContentText("General Kenobi!");
		alerta.showAndWait();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
