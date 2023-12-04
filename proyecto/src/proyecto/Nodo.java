
package proyecto;

import java.util.LinkedList;
import java.util.Queue;

public class Nodo {
    private int valor, altura;

    public int getAltura() {
	return altura;
    }

    public void setAltura(int altura) {
	this.altura = altura;
    }
    private Nodo izquierda, derecha;

    public Nodo(int valor) {
        this.valor = valor;
        this.izquierda = this.derecha = null;
    }
    
    public Nodo getDerecha(){
	return derecha;
    }
    
    public Nodo getIzquierda(){
	return izquierda;
    }
    
    public int getValor(){
	return valor;
    }
    
    public void setDerecha(Nodo derecha){
	this.derecha = derecha;
    }
    
    public void setIzquierda(Nodo izquierda){
	this.izquierda = izquierda;
    }
    
    public void setValor(int valor){
	this.valor = valor;
    }
    
    public int nodos(Nodo nodo){
	if(nodo != null){
	    return nodos(nodo.getIzquierda()) + nodos(nodo.getDerecha()) + 1;
	}
	return 0;
    }
    
    public int getLevelsBelowNode(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }

        Queue<Nodo> queue = new LinkedList<>();
        queue.offer(nodo);

        int levelsBelow = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Nodo current = queue.poll();

                if (current.getIzquierda() != null) {
                    queue.offer(current.getIzquierda());
                }

                if (current.getDerecha() != null) {
                    queue.offer(current.getDerecha());
                }
            }

            levelsBelow++;
        }

        return levelsBelow - 1;
    }
}