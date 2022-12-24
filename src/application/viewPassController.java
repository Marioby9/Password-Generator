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
   
    Password p1 = new Password(); //CREA UN OBJETO CONTRASEÑA
   
   public void initialize() {
	   boxInsertar.getItems().add("Principio");
	   boxInsertar.getItems().add("Medio");
	   boxInsertar.getItems().add("Final");
	   boxInsertar.setValue("Principio");
   }
    
    
    //FUNCIONES
    
    
    @FXML
    void clickBPlay(MouseEvent event) {
    	
    	
    	lblLong.setText("Longitud: "+ Integer.toString((int)(sldLongitud.getValue())));
    	if((sldLongitud.getValue()<txtClave.getText().length()) || (txtClave.getText().equals("")==false) && checkMayus.isSelected()==false && checkMinus.isSelected()==false && checkNum.isSelected()==false && checkSignos.isSelected()==false) {
    		p1.longitud= txtClave.getText().length();
    		lblLong.setText("Longitud: "+ txtClave.getText().length());
    		sldLongitud.setValue(txtClave.getText().length());
    	}
    	else if((txtClave.getText().equals("")==true) && checkMayus.isSelected()==false && checkMinus.isSelected()==false && checkNum.isSelected()==false && checkSignos.isSelected()==false) {
    		p1.longitud=0;
    		lblLong.setText("Longitud: "+ 0);
    		sldLongitud.setValue(0);
    	}
    	else {
    		p1.longitud = (int)(sldLongitud.getValue());
    	}
    	
    	if(checkMayus.isSelected()) {	p1.bMay=true;	}	else {p1.bMay=false;}
    	if(checkMinus.isSelected()) {	p1.bMin=true;	}	else {p1.bMin=false;}
    	if(checkNum.isSelected())   {	p1.bNum=true;	}	else {p1.bNum=false;}
    	if(checkSignos.isSelected()){	p1.bSigno=true;	}	else {p1.bSigno=false;}
    	
    	p1.setPClave(txtClave.getText());
    	if(!p1.pClave.equals("")) {p1.bClave=true;}		else {p1.bClave=false;}
    	
    	p1.insertar = boxInsertar.getValue();
    	
    	lblPassword.setText(p1.getPassword());
    	fuerzaBarra();
    	
    }

    public void fuerzaBarra() {
    	
    	if(!lblPassword.getText().equals("")) {
    	barraFuerza.setProgress(p1.getFuerza());
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
    	Portapapeles Port1 = new Portapapeles();
    	Port1.copyPassword(lblPassword.getText());
    	
    }
}
    
    
	    
    
  


