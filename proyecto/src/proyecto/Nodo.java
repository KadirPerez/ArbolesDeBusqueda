
package proyecto;

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
    
    public int nodosCompletos(Nodo nodo){
	if(nodo != null){
	    if(nodo.getDerecha() != null && nodo.getIzquierda() != null){
		return nodosCompletos(nodo.getIzquierda()) + nodosCompletos(nodo.getDerecha()) + 1;
	    }
	    return nodosCompletos(nodo.getIzquierda()) + nodosCompletos(nodo.getDerecha());
	}
	return 0;
    }
}