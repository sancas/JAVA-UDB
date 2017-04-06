/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa120974;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

/**
 *
 * @author sanch
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblMensaje;
    
    @FXML
    private ComboBox<String> cmbIdioma;
    
    @FXML
    private RadioButton rbtnSaludo;
    
    @FXML
    private RadioButton rbtnDespedida;
    
    @FXML
    private void limpiarButtonAction(ActionEvent event) {
        lblMensaje.setText("");
    }
    
    @FXML
    private void enviarButtonAction(ActionEvent event) {
        if (rbtnSaludo.isSelected())
        {
            if (cmbIdioma.getValue().equals("Español"))
                lblMensaje.setText("Buenos Dias");
            else if (cmbIdioma.getValue().equals("Aleman"))
                lblMensaje.setText("Guten Morgen");
            else if (cmbIdioma.getValue().equals("Portugues"))
                lblMensaje.setText("Bom Dia");
            else if (cmbIdioma.getValue().equals("Ingles"))
                lblMensaje.setText("Good Morning");
        }
        else if (rbtnDespedida.isSelected())
        {
            if (cmbIdioma.getValue().equals("Español"))
                lblMensaje.setText("Buenas Noches");
            else if (cmbIdioma.getValue().equals("Aleman"))
                lblMensaje.setText("Guten Abend");
            else if (cmbIdioma.getValue().equals("Portugues"))
                lblMensaje.setText("Boa Noite");
            else if (cmbIdioma.getValue().equals("Ingles"))
                lblMensaje.setText("Good Evening");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cmbIdioma.getItems().setAll("Español", "Aleman", "Portugues", "Ingles");
    }    
}
