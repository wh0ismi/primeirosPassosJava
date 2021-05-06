/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraaplicacaojavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author miria
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label labelMensagem;
    private Button btnTestar;
    
    @FXML
    private void clicouBotao(ActionEvent event) {
        labelMensagem.setText("Tudo certo por aqui também xP");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
