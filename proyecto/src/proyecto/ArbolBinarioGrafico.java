
package proyecto;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JDialog;
import javax.swing.JPanel;

public final class ArbolBinarioGrafico extends JDialog{
    
    public ArbolBinarioGrafico(String titulo){
	setBounds(600, 50, 1300, 1000);
        setTitle(titulo);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	
	int diametro = 0;
	
	ArbolBinario arbol = new ArbolBinario();
	
	arbol.insertar(10);
	arbol.insertar(7);
	arbol.insertar(3);
	arbol.insertar(12);
	arbol.insertar(8);
	arbol.insertar(15);
	arbol.insertar(17);
	arbol.insertar(16);
	
	ArbolPanel arbolPanel = new ArbolPanel(arbol);
        getContentPane().add(arbolPanel);
	
	
        setVisible(true);
    } 
    
}

class ArbolPanel extends JPanel {
    
    private ArbolBinario arbol;
    private int penultimoNodo;
    
    public ArbolPanel(ArbolBinario arbol){
	this.arbol = arbol;
	penultimoNodo = -1;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(3)); // Grosor de la línea

        dibujarRaiz(g2d, arbol.getRaiz());
	
	dibujarHijos(g2d, getWidth()/2, 75, arbol.getRaiz());
	
    }
    
    private void dibujarRaiz(Graphics2D g2d, Nodo raiz){
	int padreX = getWidth() / 2;
        int padreY = 75;
        int radio = 50;
        
        g2d.setColor(Color.BLACK);
        g2d.fillOval(padreX - radio, padreY - radio, 2 * radio, 2 * radio);
	
	g2d.setFont(new Font("Arial", Font.PLAIN, 30));
	g2d.setColor(Color.WHITE);
	g2d.drawString(raiz.valor + "", padreX - radio/2, padreY + radio/2);
    }
    
    private void dibujarHijos(Graphics2D g2d, int padreX, int padreY, Nodo padre){
	
	int radio = 50;
	g2d.setColor(Color.BLACK);

	int hijoX = padreX - 75;
	int hijosY = padreY + 175;
	String valorD, valorI;
	    
	if( padre.getIzquierda() != null){
	    valorI = padre.getIzquierda().getValor() + "";
	    
	    g2d.setColor(Color.BLACK);
	    g2d.drawLine(padreX, padreY + radio, hijoX, hijosY - radio);
	    g2d.fillOval(hijoX - radio, hijosY - radio, 2 * radio, 2 * radio);

	    g2d.setFont(new Font("Arial", Font.PLAIN, 30));
	    g2d.setColor(Color.WHITE);
	    g2d.drawString(valorI, hijoX - radio/2, hijosY + radio/2);  
	    
	    dibujarHijos(g2d, hijoX, hijosY, padre.getIzquierda());

	}
	    
	if(padre.getDerecha() != null){
	    valorD = padre.getDerecha().getValor() + "";
	    hijoX = hijoX + 150; 
		    
	    g2d.setColor(Color.BLACK);
	    g2d.drawLine(padreX, padreY + radio, hijoX, hijosY - radio);
	    g2d.fillOval(hijoX - radio, hijosY - radio, 2 * radio, 2 * radio);

	    g2d.setFont(new Font("Arial", Font.PLAIN, 30));
	    g2d.setColor(Color.WHITE);
	    g2d.drawString(valorD, hijoX - radio/2, hijosY + radio/2);  
	    
	    dibujarHijos(g2d, hijoX, hijosY, padre.getDerecha());
	}
	
    }
}
