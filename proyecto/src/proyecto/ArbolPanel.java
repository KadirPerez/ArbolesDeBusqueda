package proyecto;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class ArbolPanel extends JPanel {
    
    private ArbolBinario arbol;
    
    public ArbolPanel(ArbolBinario arbol){
	this.arbol = arbol;
    }
    
    public Dimension getPreferredSize() {
	return new Dimension(6000, 3000); // Especifica el tamaño preferido del panel
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(3)); 

	dibujarArbol(g2d, arbol.getRaiz(), getWidth() / 2, 30);		
    }
    
    private void dibujarArbol(Graphics2D g2d, Nodo raiz, int x, int y){
	if (raiz != null) {
	    int ancho = 1;
	    int alto = 60;
	    int niveles = raiz.obtenerNivelesDebajo(raiz);
	    int extremos = ((int) Math.pow(2, niveles + 1) - 1) * 10;
		    
	    int radio = 25;

	    g2d.setColor(Color.BLACK);
	    g2d.fillOval(x, y , 2 * radio, 2 * radio);
	    
	    if(raiz.getIzquierda() != null){
		g2d.drawLine(x + radio, y + radio, x - ancho - extremos + radio, y +  alto + radio);
	    }
	    if(raiz.getDerecha() != null){
		g2d.drawLine(x + radio, y + radio, x + ancho + extremos + radio, y +  alto + radio);
	    }
	    
	    g2d.setFont(new Font("Arial", Font.PLAIN, 20));
	    g2d.setColor(Color.WHITE);
	    g2d.drawString(raiz.getValor() + "", x + radio / 2, y + radio);
	    
	    dibujarArbol(g2d, raiz.getIzquierda(), x - ancho - extremos, y + alto);
	    dibujarArbol(g2d, raiz.getDerecha(), x + ancho + extremos, y + alto);
	}
    }
    
}

