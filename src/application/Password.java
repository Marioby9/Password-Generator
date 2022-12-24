package application;

public class Password {
	//STRINGS
	String password = "";
	String lmin = "abcdefghijklmnopqrstuvwxyz";
	String lmay = lmin.toUpperCase();
	String numeros= "0123456789";
	String signos = "@#$&%*!-_"; 
	String pClave = "";
	String insertar = "principio";
	
	//CONTADORES
	int longitud=0; //MÁXIMO SERÁ DE 25
	int numSignos = 0;
	int numMay = 0;
	int numMin = 0;
	int numNum = 0;
	public double fuerza = 0;  //ENTRE 0 Y 1
	
	//BOOLEANS 
	boolean bSigno = false;
	boolean bNum = false;
	boolean bClave = false;
	boolean bMay = false;
	boolean bMin = false;

	public Password(){
		
	}
	
	public void setPClave(String clave) {
		pClave = clave;
		bClave=true;
	}
	
	public String getPassword() {
		password="";
		int random;
		int ale; //SERÁ UN NÚMERO ALEATORIO QUE DECIDE QUE TIPO DE CARACTER VA A ELEGIR EL GENERADOR
		
		if(bClave) {//SI ES TRUE, LA LONGITUD DEBERÁ SER LA LONGITUD MENOS LO QUE MIDA LA PCLAVE
			longitud = longitud - pClave.length();
		}
		
		//SOLO UN TIPO DE CARACTER
		
		if(bMin==true && bSigno==false && bMay==false && bNum==false) { //FULL MIN
			for(int i=0;i<longitud;i++) {
				random = (int)(Math.random()*(lmin.length()));
				password += lmin.charAt(random);
			}
		}
		
		if(bMin==false && bSigno==false && bMay==true && bNum==false) { //FULL MAY
			for(int i=0;i<longitud;i++) {
				random = (int)(Math.random()*(lmay.length()));
				password += lmay.charAt(random);
			}
		}
		
		if(bMin==false && bSigno==true && bMay==false && bNum==false) { //FULL SIGNOS
			for(int i=0;i<longitud;i++) {
				random = (int)(Math.random()*(signos.length()));
				password += signos.charAt(random);
			}
		}
		
		if(bMin==false && bSigno==false && bMay==false  && bNum==true) { //FULL NUMEROS
			for(int i=0;i<longitud;i++) {
				random = (int)(Math.random()*(numeros.length()));
				password += numeros.charAt(random);
			}
		}
		
		//DOS TIPOS JUNTOS
		if(bMin==true && bSigno==false && bMay==true && bNum==false) { //MIN Y MAY
			for(int i=0;i<longitud;i++) {
				ale = (int)(Math.random()*2);
				if(ale==1) {
					random = (int)(Math.random()*(lmin.length()));
					password+=lmin.charAt(random);
				}
				else {
					random = (int)(Math.random()*(lmay.length()));
					password+=lmay.charAt(random);
				}
				
			}
		}
		
		if(bMin==true && bSigno==true && bMay==false && bNum==false) { //MIN Y SIGNOS
			for(int i=0;i<longitud;i++) {
				ale = (int)(Math.random()*2);
				if(ale==1) {
					random = (int)(Math.random()*(lmin.length()));
					password+=lmin.charAt(random);
				}
				else {
					random = (int)(Math.random()*(signos.length()));
					password+=signos.charAt(random);
				}
				
			}
		}
		
		if(bMin==true && bSigno==false && bMay==false && bNum==true) { //MIN Y NUM
			for(int i=0;i<longitud;i++) {
				ale = (int)(Math.random()*2);
				if(ale==1) {
					random = (int)(Math.random()*(lmin.length()));
					password+=lmin.charAt(random);
				}
				else {
					random = (int)(Math.random()*(numeros.length()));
					password+=numeros.charAt(random);
				}
				
			}
		}
		
		if(bMin==false && bSigno==true && bMay==true && bNum==false) { //SIGNO Y MAY
			for(int i=0;i<longitud;i++) {
				ale = (int)(Math.random()*2);
				if(ale==1) {
					random = (int)(Math.random()*(signos.length()));
					password+=signos.charAt(random);
				}
				else {
					random = (int)(Math.random()*(lmay.length()));
					password+=lmay.charAt(random);
				}
				
			}
		}
		
		if(bMin==false && bSigno==true && bMay==false && bNum==true) { //SIGNO Y NUM
			for(int i=0;i<longitud;i++) {
				ale = (int)(Math.random()*2);
				if(ale==1) {
					random = (int)(Math.random()*(signos.length()));
					password+=signos.charAt(random);
				}
				else {
					random = (int)(Math.random()*(numeros.length()));
					password+=numeros.charAt(random);
				}
				
			}
		}
		
		if(bMin==false && bSigno==false && bMay==true && bNum==true) { //MAY Y NUM
			for(int i=0;i<longitud;i++) {
				ale = (int)(Math.random()*2);
				if(ale==1) {
					random = (int)(Math.random()*(lmay.length()));
					password+=lmay.charAt(random);
				}
				else {
					random = (int)(Math.random()*(numeros.length()));
					password+=numeros.charAt(random);
				}
				
			}
		}
		
		//TRES TIPOS JUNTOS
		if(bMin==true && bSigno==true && bMay==true && bNum==false) { //MIN Y SIGNO Y MAY
			for(int i=0;i<longitud;i++) {
				ale = (int)(Math.random()*3);
				if(ale==1) {
					random = (int)(Math.random()*(lmin.length()));
					password+=lmin.charAt(random);
				}
				else if (ale==2){
					random = (int)(Math.random()*(signos.length()));
					password+=signos.charAt(random);
				}
				else {
					random = (int)(Math.random()*(lmay.length()));
					password+=lmay.charAt(random);
					
				}
				
			}
		}
		
		if(bMin==true && bSigno==true && bMay==false && bNum==true) { //MIN Y SIGNO Y NUM
			for(int i=0;i<longitud;i++) {
				ale = (int)(Math.random()*3);
				if(ale==1) {
					random = (int)(Math.random()*(lmin.length()));
					password+=lmin.charAt(random);
				}
				else if (ale==2){
					random = (int)(Math.random()*(signos.length()));
					password+=signos.charAt(random);
				}
				else {
					random = (int)(Math.random()*(numeros.length()));
					password+=numeros.charAt(random);
					
				}
				
			}
		}
		
		if(bMin==true && bSigno==false && bMay==true && bNum==true) { //MIN Y MAY Y NUM
			for(int i=0;i<longitud;i++) {
				ale = (int)(Math.random()*3);
				if(ale==1) {
					random = (int)(Math.random()*(lmin.length()));
					password+=lmin.charAt(random);
				}
				else if (ale==2){
					random = (int)(Math.random()*(numeros.length()));
					password+=numeros.charAt(random);
				}
				else {
					random = (int)(Math.random()*(lmay.length()));
					password+=lmay.charAt(random);
					
				}
				
			}
		}
		
		if(bMin==false && bSigno==true && bMay==true && bNum==true) { //SIGNO Y MAY Y NUM
			for(int i=0;i<longitud;i++) {
				ale = (int)(Math.random()*3);
				if(ale==1) {
					random = (int)(Math.random()*(signos.length()));
					password+=signos.charAt(random);
				}
				else if (ale==2){
					random = (int)(Math.random()*(lmay.length()));
					password+=lmay.charAt(random);
				}
				else {
					random = (int)(Math.random()*(numeros.length()));
					password+=numeros.charAt(random);
					
				}
				
			}
		}
		
		//TODOS JUNTOS
		if(bMin==true && bSigno==true && bMay==true && bNum==true) { 
			for(int i=0;i<longitud;i++) {
				ale = (int)(Math.random()*4);
				if(ale==1) {
					random = (int)(Math.random()*(lmin.length()));
					password+=lmin.charAt(random);
				}
				else if (ale==2){
					random = (int)(Math.random()*(lmay.length()));
					password+=lmay.charAt(random);
				}
				else if(ale==3) {
					random = (int)(Math.random()*(numeros.length()));
					password+=numeros.charAt(random);
					
				}
				else {
					random = (int)(Math.random()*(signos.length()));
					password+=signos.charAt(random);
				}
				
			}
		}
		
		//SI TOD0 ES FALSO Y NO HAY PALABRA CLAVE LA CONTRASEÑA ESTARÁ VACÍA
		
		
		
		
		
		
		//SI QUIERE PALABRA CLAVE, IRÁ ANTES QUE LA CONTRASEÑA GENERADA
		if(bClave) {
			if(insertar.equalsIgnoreCase("principio")) {
				password = pClave+password;
			}
			else if(insertar.equalsIgnoreCase("final")) {
				password = password + pClave;
			}
			else if (insertar.equalsIgnoreCase("medio")){
				if(longitud%2==0) {//SI ES UN NUMERO PAR
					
					String parte1 = password.substring(0, (password.length()/2));
					String parte2 = password.substring((password.length()/2), password.length());
					password = parte1 + pClave + parte2;
					
				}
				else {
					String parte1 = password.substring(0, (int)((password.length()/2)+0.5));
					String parte2 = password.substring((int)((password.length()/2)+0.5), password.length());
					password = parte1 + pClave + parte2;
				}
			}
			
		}
		
		//RETURN
		return password;
		
		
	}
	
	public double getFuerza() {
		
		if(bClave) { longitud= longitud + pClave.length(); } //SI HAY PALABRA CLAVE, LA LONGITUD SERÁ  LA LONGITUD + LO QUE MIDE LA CLAVE
		
		if(longitud==0) {
			fuerza=0;
		}
		if(longitud >0 && longitud<5) {
			fuerza=0.05;
		}
		if(longitud>=5 && longitud <8) {
			fuerza = 0.25;
		}
		if(longitud>=8 && longitud <10) {
			fuerza = 0.5;
		}
		if(longitud>=10 && longitud <=12) {
			fuerza = 0.75;
		}
		if(longitud>12) {
			fuerza = 1;
		}
	
	return fuerza;	
	}
	

	
	
	
}
