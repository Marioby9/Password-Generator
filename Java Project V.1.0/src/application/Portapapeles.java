package application;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;


/***
 * 
 * @author MarioMartinDev
 * @version 1.1
 *
 */

public class Portapapeles implements ClipboardOwner{

	
	
    //PARA COPIAR AL PORTAPAPELES:
	public static void copyPassword(String password) {
	    	StringSelection textoACopiar = new StringSelection(password);
	    	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(textoACopiar, null);
	    	
	}
	@Override
	public void lostOwnership(Clipboard clipboard, Transferable contents) {}
	}
