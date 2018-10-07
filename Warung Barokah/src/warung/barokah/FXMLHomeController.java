/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warung.barokah;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class FXMLHomeController implements Initializable {

    @FXML
    private JFXCheckBox mak1;
    @FXML
    private JFXCheckBox mak2;
    @FXML
    private JFXCheckBox mak3;
    @FXML
    private JFXCheckBox mak4;
    @FXML
    private JFXCheckBox mak5;
    @FXML
    private Label hrg1;
    @FXML
    private Label hrg2;
    @FXML
    private Label hrg3;
    @FXML
    private Label hrg4;
    @FXML
    private Label hrg5;
    @FXML
    private TextField jmlh1;
    @FXML
    private TextField jmlh2;
    @FXML
    private TextField jmlh3;
    @FXML
    private TextField jmlh4;
    @FXML
    private TextField jmlh5;
    @FXML
    private JFXButton btnHitung;
    @FXML
    private Label Total;
    @FXML
    private JFXTextArea hasilPemesanan;
    @FXML
    private JFXTextField jumlahUang;
    @FXML
    private JFXButton btnPrint;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Hitung(ActionEvent event) {
    }
    
}
