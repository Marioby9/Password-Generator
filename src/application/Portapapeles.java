package application;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public class Portapapeles implements ClipboardOwner{

	
	
    //PARA COPIAR AL PORTAPAPELES:
	public void copyPassword(String password) {
	    	StringSelection textoACopiar = new StringSelection(password);
	    	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(textoACopiar, this);
	    	
	    	
	}
	@Override
	public void lostOwnership(Clipboard clipboard, Transferable contents) {}
	}
