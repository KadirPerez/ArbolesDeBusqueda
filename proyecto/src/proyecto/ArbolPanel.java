package proyecto;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class ArbolPanel extends JPanel {
    
    private ArbolBinario arbol;
    private int[] extremos;
    
    public ArbolPanel(ArbolBinario arbol){
	this.arbol = arbol;
	extremos = new int[4];
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(3)); 

	dibujarArbol(g2d, arbol.getRaiz());		
    }
    
    private void dibujarArbol(Graphics2D g2d, Nodo raiz){
	if (raiz != null) {
	    int padreX = getWidth() / 2;
	    int padreY = 30;
	    int radio = 25;

	    g2d.setColor(Color.BLACK);
	    g2d.fillOval(padreX - radio, padreY - radio, 2 * radio, 2 * radio);

	    g2d.setFont(new Font("Arial", Font.PLAIN, 30));
	    g2d.setColor(Color.WHITE);
	    g2d.drawString(raiz.getValor() + "", padreX - radio/2, padreY + radio/2);
	    dibujarHijos(g2d, padreX, padreY, arbol.getRaiz());
	}
    }
    
    private void dibujarHijos(Graphics2D g2d, int padreX, int padreY, Nodo padre){
	int radio = 30;
	g2d.setColor(Color.BLACK);
	
	int hijoX;	
	
	int hijosY = padreY + 70;
	String valorD, valorI;
	    
	if( padre.getIzquierda() != null) {
	    int[] extremosHijo = contarExtremosSubArboles(padre.getIzquierda().getDerecha());
	    
	    extremos = contarExtremosSubArboles(padre.getIzquierda());
	    
	    hijoX =  padreX - 40 - extremos[0] * 40 - extremosHijo[1] * 40;	    	  
	    
	    valorI = padre.getIzquierda().getValor() + "";
	    
	    g2d.setColor(Color.BLACK);
	    g2d.drawLine(padreX, padreY + radio/2, hijoX, hijosY - radio/2);
	    g2d.fillOval(hijoX - radio, hijosY - radio, 2 * radio, 2 * radio);

	    g2d.setFont(new Font("Arial", Font.PLAIN, 30));
	    g2d.setColor(Color.WHITE);
	    g2d.drawString(valorI, hijoX - radio/2, hijosY + radio/2);  
	    
	    dibujarHijos(g2d, hijoX, hijosY, padre.getIzquierda());
	}
	
	if(padre.getDerecha() != null){
	    valorD = padre.getDerecha().getValor() + "";
	    
	    int[] extremosHijo = contarExtremosSubArboles(padre.getDerecha().getIzquierda());
	    
	    extremos = contarExtremosSubArboles(padre.getDerecha());
	    
	    hijoX =  padreX + 40 + extremos[1] * 40 + extremosHijo[0] * 40;	    
		    
	    g2d.setColor(Color.BLACK);
	    g2d.drawLine(padreX, padreY + radio/2, hijoX, hijosY - radio/2);
	    g2d.fillOval(hijoX - radio, hijosY - radio, 2 * radio, 2 * radio);

	    g2d.setFont(new Font("Arial", Font.PLAIN, 30));
	    g2d.setColor(Color.WHITE);
	    g2d.drawString(valorD, hijoX - radio/2, hijosY + radio/2);  
	    
	    dibujarHijos(g2d, hijoX, hijosY, padre.getDerecha());
	}
    }
    
    public int[] contarExtremosSubArboles(Nodo padre){
	
	int[] extremosSubArboles = {0, 0};
	
	if(padre != null) {
	    if(padre.getDerecha() != null) {
		Nodo nodo = padre.getDerecha();
		while(nodo != null) {
		    nodo = nodo.getDerecha();
		    extremosSubArboles[0] ++;
		}
	    }

	    if(padre.getIzquierda()!= null) {
		Nodo nodo = padre.getIzquierda();
		while(nodo != null) {
		    nodo = nodo.getIzquierda();
		    extremosSubArboles[1] ++;
		}
	    }
	}
	
	return extremosSubArboles;
    }
}

