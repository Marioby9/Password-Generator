package application;


/***
 * 
 * @author MarioMartinDev
 * @version 1.1
 *
 */
public class Password {
	
	
	private static String minus = "abcdefghijklmnñopqrstuvwxyz";
	private static String uppers = minus.toUpperCase();
	private static String nums = "0123456789";
	private static String signos = "@#$&%*!-_";
	
	public static double getFuerza(String password) {

		int longitud = password.length();
		double fuerza = 0;  //ENTRE 0 Y 1
		
		if(longitud==0) {
			fuerza=0;
		}
		else if(longitud >0 && longitud<5) {
			fuerza=0.05;
		}
		else if(longitud>=5 && longitud <8) {
			fuerza = 0.25;
		}
		else if(longitud>=8 && longitud <10) {
			fuerza = 0.5;
		}
		else if(longitud>=10 && longitud <=12) {
			fuerza = 0.75;
		}
		else if(longitud>12) {
			fuerza = 1;
		}

		return fuerza;	
	}


	public static String getPassword(int longi, boolean bMayus, boolean bMinus, boolean bNums, boolean bSignos, String pClave, String insertar ) {
		
		String posibles = "";
		String password = "";
		
		if(pClave!=null) {
			longi = longi - pClave.length();
		}
		
		if(bMayus) {posibles+=uppers; }
		if(bNums) {posibles+=nums; }
		if(bSignos) {posibles+=signos; }
		if(bMinus) {posibles+=minus;}
		
		int pos;

		for(int i=0; i<longi; i++) {
			pos = (int)(Math.random()*(posibles.length()));
			password+=posibles.charAt(pos);
		}


		//SI QUIERE PALABRA CLAVE
		if(pClave != null) {
			
			if(insertar.equalsIgnoreCase("principio")) {
				password = pClave+password;
			}
			else if(insertar.equalsIgnoreCase("final")) {
				password = password + pClave;
			}
			else if (insertar.equalsIgnoreCase("medio")){
				if(longi%2==0) {//SI ES UN NUMERO PAR

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


		return password;

	}



}




