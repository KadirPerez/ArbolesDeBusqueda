
package proyecto;

public class Nodo {
    int valor;
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
}