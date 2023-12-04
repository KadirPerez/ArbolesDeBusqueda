package proyecto;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public final class ArbolBinarioGrafico extends JFrame {
    
    private final ArbolPanel arbolPanel;
    
    public ArbolBinarioGrafico(String titulo, ArbolBinario arbol) {
	setBounds(600, 50, 3000, 1000);
        setTitle(titulo);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        
	arbolPanel = new ArbolPanel(arbol);
        
        JScrollPane scrollPane = new JScrollPane(arbolPanel);
	
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        getContentPane().add(scrollPane);
	
        setVisible(true);
    } 
    
    public void refrescar(ArbolBinario arbol) {
        repaint();
        }
}

