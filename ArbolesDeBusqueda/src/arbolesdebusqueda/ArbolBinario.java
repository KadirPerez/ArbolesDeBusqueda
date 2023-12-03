
package arbolesdebusqueda;

public class ArbolBinario {
    Nodo raiz;
	    
    public ArbolBinario() {
        this.raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            return new Nodo(valor);
        }

        if (valor < nodo.valor)  nodo.izquierda = insertarRecursivo(nodo.izquierda, valor);
        else if (valor > nodo.valor) nodo.derecha = insertarRecursivo(nodo.derecha, valor);
        

        return nodo;
    }
    
    public void eliminar(int valor) {
        raiz = eliminarRecursivo(raiz, valor);
    }
    
    private Nodo eliminarRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            return nodo;
        }

        if (valor < nodo.valor) {
            nodo.izquierda = eliminarRecursivo(nodo.izquierda, valor);
        } else if (valor > nodo.valor) {
            nodo.derecha = eliminarRecursivo(nodo.derecha, valor);
        } else {
            if (nodo.izquierda == null) {
                return nodo.derecha;
            } else if (nodo.derecha == null) {
                return nodo.izquierda;
            }

            nodo.valor = encontrarMenorValor(nodo.derecha);

            nodo.derecha = eliminarRecursivo(nodo.derecha, nodo.valor);
        }

        return nodo;
    }
    
    private int encontrarMenorValor(Nodo nodo) {
        int minValor = nodo.valor;
        while (nodo.izquierda != null) {
            minValor = nodo.izquierda.valor;
            nodo = nodo.izquierda;
        }
        return minValor;
    }
    
    public String recorrerInorden(Nodo nodo) {
	StringBuilder resultado = new StringBuilder();
	recorrerInordenAux(nodo, resultado);
	return resultado.toString();
    }

    private void recorrerInordenAux(Nodo nodo, StringBuilder resultado) {
	if (nodo != null) {
	    recorrerInordenAux(nodo.izquierda, resultado);
	    resultado.append(nodo.valor).append(" ");
	    recorrerInordenAux(nodo.derecha, resultado);
	}
    }
    
    public String recorrerPreorden(Nodo nodo) {
	StringBuilder resultado = new StringBuilder();
	recorrerPreordenAux(nodo, resultado);
	return resultado.toString();
    }

    private void recorrerPreordenAux(Nodo nodo, StringBuilder resultado) {
	if (nodo != null) {
	    resultado.append(nodo.valor).append(" ");
	    recorrerPreordenAux(nodo.izquierda, resultado);
	    recorrerPreordenAux(nodo.derecha, resultado);
	}
    }
    
    public String recorrerPostorden(Nodo nodo) {
	StringBuilder resultado = new StringBuilder();
	recorrerPostordenAux(nodo, resultado);
	return resultado.toString();
    }

    private void recorrerPostordenAux(Nodo nodo, StringBuilder resultado) {
	if (nodo != null) {
	    recorrerPostordenAux(nodo.izquierda, resultado);
	    recorrerPostordenAux(nodo.derecha, resultado);
	    resultado.append(nodo.valor).append(" ");
	}
    }


}