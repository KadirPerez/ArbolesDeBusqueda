
package proyecto;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JDialog;
import javax.swing.JPanel;

public final class ArbolBinarioGrafico extends JDialog{
    
    private ArbolPanel arbolPanel;
    
    public ArbolBinarioGrafico(String titulo, ArbolBinario arbol){
	setBounds(600, 50, 1300, 1000);
        setTitle(titulo);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	int[] extremos = {0,0,0,0};
	arbolPanel = new ArbolPanel(arbol, extremos);
        getContentPane().add(arbolPanel);
	
        setVisible(true);
    } 
    
    public int[] contarExtremosSubArboles(ArbolBinario arbol){
	int[] extremosSubArboles = {0,0,0,0};
	
	Nodo nodo = arbol.getRaiz().getIzquierda();
	while (nodo != null){
	    nodo = nodo.getIzquierda();
	    extremosSubArboles[0] ++;
	}
	
	nodo = arbol.getRaiz().getIzquierda();
	while(nodo != null){
	    nodo = nodo.getDerecha();
	    extremosSubArboles[1] ++;
	}
	
	nodo = arbol.getRaiz().getDerecha();
	while (nodo != null){
	    nodo = nodo.getIzquierda();
	    extremosSubArboles[2] ++;
	}
	
	nodo = arbol.getRaiz().getDerecha();
	while(nodo != null){
	    nodo = nodo.getIzquierda();
	    extremosSubArboles[3] ++;
	}
		
	return extremosSubArboles;
    }
    
    public void refrescar(ArbolBinario arbol){
	int[] extremos = contarExtremosSubArboles(arbol);
	arbolPanel.setExtremos(extremos);
	repaint();
    }
}

class ArbolPanel extends JPanel {
    
    private ArbolBinario arbol;
    private int[]extremos;
    private boolean vacio;
    
    public ArbolPanel(ArbolBinario arbol, int[]extremos){
	this.arbol = arbol;
	this.extremos = extremos;
    }
    
    public void setExtremos(int[] extremos){
	this.extremos = extremos;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(3)); 
	
	
	dibujarArbol(g2d, arbol.getRaiz());
		
    }
    
    private void dibujarArbol(Graphics2D g2d, Nodo raiz){
	if(raiz != null){
	    int padreX = getWidth() / 2;
	    int padreY = 30;
	    int radio = 25;

	    g2d.setColor(Color.BLACK);
	    g2d.fillOval(padreX - radio, padreY - radio, 2 * radio, 2 * radio);

	    g2d.setFont(new Font("Arial", Font.PLAIN, 30));
	    g2d.setColor(Color.WHITE);
	    g2d.drawString(raiz.valor + "", padreX - radio/2, padreY + radio/2);
	    dibujarHijos(g2d, padreX, padreY, arbol.getRaiz(), extremos, true);
	}
    }
    
    private void dibujarHijos(Graphics2D g2d, int padreX, int padreY, Nodo padre, int[]extremos, boolean primeraVez){
	
	int radio = 30;
	g2d.setColor(Color.BLACK);
	
	int hijoX;
	
	if(primeraVez)
	    hijoX = padreX - 40 - (40*(extremos[1]));
	else
	    hijoX = padreX - 40;
	
	
	int hijosY = padreY + 70;
	String valorD, valorI;
	    
	if( padre.getIzquierda() != null){
	    valorI = padre.getIzquierda().getValor() + "";
	    
	    g2d.setColor(Color.BLACK);
	    g2d.drawLine(padreX, padreY + radio/2, hijoX, hijosY - radio/2);
	    g2d.fillOval(hijoX - radio, hijosY - radio, 2 * radio, 2 * radio);

	    g2d.setFont(new Font("Arial", Font.PLAIN, 30));
	    g2d.setColor(Color.WHITE);
	    g2d.drawString(valorI, hijoX - radio/2, hijosY + radio/2);  
	    
	    dibujarHijos(g2d, hijoX, hijosY, padre.getIzquierda(), extremos, false);

	}
	    
	if(padre.getDerecha() != null){
	    valorD = padre.getDerecha().getValor() + "";
	    
	    if(primeraVez){
		hijoX = padreX + 40 + (40*(extremos[2]));
	    }
	    else
		hijoX = padreX + 40;
	    
		    
	    g2d.setColor(Color.BLACK);
	    g2d.drawLine(padreX, padreY + radio/2, hijoX, hijosY - radio/2);
	    g2d.fillOval(hijoX - radio, hijosY - radio, 2 * radio, 2 * radio);

	    g2d.setFont(new Font("Arial", Font.PLAIN, 30));
	    g2d.setColor(Color.WHITE);
	    g2d.drawString(valorD, hijoX - radio/2, hijosY + radio/2);  
	    
	    dibujarHijos(g2d, hijoX, hijosY, padre.getDerecha(), extremos, false);
	}
	
    }
}
