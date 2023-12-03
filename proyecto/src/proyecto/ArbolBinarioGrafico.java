package proyecto;

import javax.swing.JDialog;
import javax.swing.JFrame;

public final class ArbolBinarioGrafico extends JFrame{
    
    private ArbolPanel arbolPanel;
    
    public ArbolBinarioGrafico(String titulo, ArbolBinario arbol){
	setBounds(600, 50, 1300, 1000);
        setTitle(titulo);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	arbolPanel = new ArbolPanel(arbol);
        getContentPane().add(arbolPanel);
	
        setVisible(true);
    } 
    
    public void refrescar(ArbolBinario arbol){
	repaint();
    }
}

