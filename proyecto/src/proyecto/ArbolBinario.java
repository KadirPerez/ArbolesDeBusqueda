package proyecto;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author felix
 */
public class ArbolBinario {
    private Nodo raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public ArrayList<Integer> generarNúmeros(int k, int n) {
        ArrayList<Integer> salida = new ArrayList();
        Random random = new Random();
        
        for (int i = 0; i < n; i++)
            salida.add(random.nextInt(k + 1));

        return salida;
    }
    
    public String recorrerPorNivel (Nodo nuevaRaíz) {
        ArrayList<Integer> aux = obtenerNivel(1, 1, nuevaRaíz);
        int iterador = 1;
        
        String resultado = "";
        
        while (!aux.isEmpty()) {
            System.out.print("Nivel " + iterador + ": ");
            for (Integer i: aux) {
                resultado += i + ", ";
            }
            
            System.out.println("");
            iterador += 1;
            aux = obtenerNivel(iterador, 1, nuevaRaíz );
        }
        
        return resultado;
    }
 
public String mostrarNivel (int nivel) {
        ArrayList<Integer> salida = obtenerNivel(nivel, 1, this.raiz);
        String aux = "";
        
        for (Integer i:salida)
            aux += i + ", ";
        
        aux = aux.substring(aux.length() - 3);
        
        return aux;
    }
    
    private ArrayList<Integer> obtenerNivel (int lv, int lvActual, Nodo nodoActual) {
        ArrayList<Integer> salida = new ArrayList();
        ArrayList<Integer> aux;
        if (lvActual == lv)
        {
            salida.add(nodoActual.getValor());
        }
        else 
        {
            if (nodoActual.getIzquierda() != null)
            {
               salida = obtenerNivel(lv, lvActual+1, nodoActual.getIzquierda());
            }
            if (nodoActual.getDerecha() != null)
            {
                aux = obtenerNivel(lv, lvActual+1, nodoActual.getDerecha());
                for (Integer i:aux)
                {
                    salida.add(i);
                }
            }
        }
        return salida;
    }
    
    public String obtenerCódigo(int número) {
        String código = "";
        código = obtenerCódigo(número, this.raiz, código);
           
        return new StringBuilder(código).reverse().toString();
    }
    
    private String obtenerCódigo (int número, Nodo nodoActual, String codigo) {
        if (número == nodoActual.getValor()) {
            return codigo;
        } else {
            if (número > nodoActual.getValor()) {
                codigo += "1";
                codigo = obtenerCódigo (número, nodoActual.getDerecha(), codigo);
            } else {
                codigo += "0";
                codigo = obtenerCódigo (número, nodoActual.getIzquierda(), codigo);
            }
            
            return codigo;
        }
    }
    
    public void insertarNumeros(ArrayList<Integer> numeros) {
        for (Integer n: numeros) insertar(n);
    }
    
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            return new Nodo(valor);
        }

        if (valor < nodo.getValor())  nodo.setIzquierda(insertarRecursivo(nodo.getIzquierda(), valor));
        else if (valor > nodo.getValor()) nodo.setDerecha(insertarRecursivo(nodo.getDerecha(), valor));

        return nodo;
    }

    public void eliminar(int valor) {
        raiz = eliminarRecursivo(raiz, valor);
    }

    private Nodo eliminarRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            return nodo;
        }

        if (valor < nodo.getValor()) {
            nodo.setIzquierda(eliminarRecursivo(nodo.getIzquierda(), valor));
        } else if (valor > nodo.getValor()) {
            nodo.setDerecha(eliminarRecursivo(nodo.getDerecha(), valor));
        } else {
            if (nodo.getIzquierda() == null) {
                return nodo.getDerecha();
            } else if (nodo.getDerecha() == null) {
                return nodo.getIzquierda();
            }

            nodo.setValor(encontrarMenorValor(nodo.getDerecha()));

            nodo.setDerecha(eliminarRecursivo(nodo.getDerecha(), nodo.getValor()));
        }

        return nodo;
    }

    private int encontrarMenorValor(Nodo nodo) {
        int minValor = nodo.getValor();
        while (nodo.getIzquierda() != null) {
            minValor = nodo.getIzquierda().getValor();
            nodo = nodo.getIzquierda();
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
	    recorrerInordenAux(nodo.getIzquierda(), resultado);
	    resultado.append(nodo.getValor()).append(", ");
	    recorrerInordenAux(nodo.getDerecha(), resultado);
	}
    }

    public String recorrerPreorden(Nodo nodo) {
	StringBuilder resultado = new StringBuilder();
	recorrerPreordenAux(nodo, resultado);
	return resultado.toString();
    }

    private void recorrerPreordenAux(Nodo nodo, StringBuilder resultado) {
	if (nodo != null) {
	    resultado.append(nodo.getValor()).append(", ");
	    recorrerPreordenAux(nodo.getIzquierda(), resultado);
	    recorrerPreordenAux(nodo.getDerecha(), resultado);
	}
    }

    public String recorrerPostorden(Nodo nodo) {
	StringBuilder resultado = new StringBuilder();
	recorrerPostordenAux(nodo, resultado);
	return resultado.toString();
    }

    private void recorrerPostordenAux(Nodo nodo, StringBuilder resultado) {
	if (nodo != null) {
	    recorrerPostordenAux(nodo.getIzquierda(), resultado);
	    recorrerPostordenAux(nodo.getDerecha(), resultado);
	    resultado.append(nodo.getValor()).append(", ");
	}
    }

    public Nodo getRaiz(){
	return raiz;
    }
}