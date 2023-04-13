package application;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class viewPassController {

	@FXML private Pane pOptions;		//PANELES
	@FXML private Pane pPasswprd;
	
    @FXML private ImageView bCopiar;	//BOTONES
    @FXML private ImageView bPlay;
   
    @FXML private Label lblPassword; 	//LABELS
    @FXML private Label lblLong;
    
    @FXML private TextField txtClave;	//INPUTS
    @FXML private ProgressBar barraFuerza;
    @FXML private Slider sldLongitud;
    @FXML private CheckBox checkMayus;
    @FXML private CheckBox checkMinus;
    @FXML private CheckBox checkNum;
    @FXML private CheckBox checkSignos;
    
    @FXML private ChoiceBox<String> boxInsertar;
    
    
    int longitud = 0;
    String password;
    String pClave;
    String insertar;
    
    //BOOLEANS
    boolean bMayus = false;
    boolean bMinus = false;
    boolean bNums = false;
    boolean bSigns = false;
   
   
    Password p1 = new Password(); //CREA UN OBJETO CONTRASEÑA
   
   public void initialize() {
	   initComponents();
   }
    
    
    //FUNCIONES
    
   
   public void initComponents() {
	   boxInsertar.getItems().add("Principio");
	   boxInsertar.getItems().add("Medio");
	   boxInsertar.getItems().add("Final");
	   boxInsertar.setValue("Principio");
   }
   
   
    
    @FXML
    void clickBPlay(MouseEvent event) {
    	
    	
    	lblLong.setText("Longitud: "+ Integer.toString((int)(sldLongitud.getValue())));
    	if((sldLongitud.getValue()<txtClave.getText().length() || !txtClave.getText().equals("")) && !checkMayus.isSelected() && !checkMinus.isSelected() && !checkNum.isSelected() && !checkSignos.isSelected()) {
    		longitud= txtClave.getText().length();
    		lblLong.setText("Longitud: "+ longitud);
    		sldLongitud.setValue(longitud);
    	}
    	else if(txtClave.getText().equals("") && !checkMayus.isSelected() && !checkMinus.isSelected() && !checkNum.isSelected() && !checkSignos.isSelected()) {
    		longitud=0;
    		lblLong.setText("Longitud: "+ 0);
    		sldLongitud.setValue(0);
    	}
    	else {
    		longitud = (int)(sldLongitud.getValue());
    	}
    	
    	if(checkMayus.isSelected()) {	bMayus=true;	}	else {bMayus=false;}
    	if(checkMinus.isSelected()) {	bMinus=true;	}	else {bMinus=false;}
    	if(checkNum.isSelected())   {	bNums=true;		}	else {bNums=false;}
    	if(checkSignos.isSelected()){	bSigns=true;	}	else {bSigns=false;}
    	
    	pClave = txtClave.getText();
    	
    	
    	insertar = boxInsertar.getValue();
    	
    	password = Password.getPassword(longitud, bMayus, bMinus, bNums, bSigns, pClave, insertar);
    	lblPassword.setText(password);
    	fuerzaBarra();
    	
    }

    public void fuerzaBarra() {
    	
    	if(!lblPassword.getText().equals("")) {
    	barraFuerza.setProgress(Password.getFuerza(password));
    	}
    	else {
    		barraFuerza.setProgress(0);
    	}
    	
    	if(barraFuerza.getProgress()==0.05) {
    		barraFuerza.setStyle("-fx-accent: B33E34");
    	}
    	else if(barraFuerza.getProgress()==0.25) {
    		barraFuerza.setStyle("-fx-accent: B33E34");
    	}
    	else if(barraFuerza.getProgress()==0.5) {
    		barraFuerza.setStyle("-fx-accent: E9CE36");
    	}
    	else if(barraFuerza.getProgress()==0.75) {
    		barraFuerza.setStyle("-fx-accent: AECD5E");
    	}
    	else if(barraFuerza.getProgress()==1) {
    		barraFuerza.setStyle("-fx-accent: green");
    	}
    
    }
    
    @FXML
    void clickBCopiar(MouseEvent event) {
    	Portapapeles.copyPassword(lblPassword.getText());
    	
    }
}
    
    
	    
    
  


