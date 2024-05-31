import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Control {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnGuardar;

    @FXML
    private Button btnLimpiar;

    @FXML
    private Label lblCodigo;

    @FXML
    private Label lblDatosPersona;

    @FXML
    private Label lblEmail;

    @FXML
    private Label lblNombre;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextArea txtresultados;

    @FXML
    void guardarDatos(ActionEvent event) {
        
        txtresultados.setText(txtCodigo.getText());

    }

    @FXML
    void limpairDatos(ActionEvent event) {

    }

    public void startUi(){
        String nombre = persona.getNombre();
        String codigo = persona.getCodigo();
        String email = persona.getEmail();
        
        txtNombre.setText(nombre);
        txtCodigo.setText(codigo);
        txtEmail.setText(email);
    }
    
    private Persona persona;
    
    @FXML
    void initialize() {
        assert btnGuardar != null : "fx:id=\"btnGuardar\" was not injected: check your FXML file 'Untitled'.";
        assert btnLimpiar != null : "fx:id=\"btnLimpiar\" was not injected: check your FXML file 'Untitled'.";
        assert lblCodigo != null : "fx:id=\"lblCodigo\" was not injected: check your FXML file 'Untitled'.";
        assert lblDatosPersona != null : "fx:id=\"lblDatosPersona\" was not injected: check your FXML file 'Untitled'.";
        assert lblEmail != null : "fx:id=\"lblEmail\" was not injected: check your FXML file 'Untitled'.";
        assert lblNombre != null : "fx:id=\"lblNombre\" was not injected: check your FXML file 'Untitled'.";
        assert txtCodigo != null : "fx:id=\"txtCodigo\" was not injected: check your FXML file 'Untitled'.";
        assert txtEmail != null : "fx:id=\"txtEmail\" was not injected: check your FXML file 'Untitled'.";
        assert txtNombre != null : "fx:id=\"txtNombre\" was not injected: check your FXML file 'Untitled'.";
        assert txtresultados != null : "fx:id=\"txtresultados\" was not injected: check your FXML file 'Untitled'.";

    }

}