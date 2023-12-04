package proyecto;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
    
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
        
        aux = aux.substring(0, aux.length() - 2);
        
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

    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            return new Nodo(valor);
        }

        if (valor < nodo.getValor()) {
            nodo.setIzquierda(insertarRecursivo(nodo.getIzquierda(), valor));
        } else if (valor > nodo.getValor()) {
            nodo.setDerecha(insertarRecursivo(nodo.getDerecha(), valor));
        } else {
            // No se permiten duplicados
            return nodo;
        }

        actualizarAltura(nodo);

        // Realizar balanceo después de la inserción
        return balancear(nodo);
    }

    public boolean eliminar(int valor) {
        AtomicBoolean eliminado = new AtomicBoolean(false);
    
        raiz = eliminarRecursivo(raiz, valor, eliminado);
        
        return eliminado.get();
    }

    private Nodo eliminarRecursivo(Nodo nodo, int valor, AtomicBoolean eliminado) {
        if (nodo == null) {
            return nodo;
        }

        if (valor < nodo.getValor()) {
            nodo.setIzquierda(eliminarRecursivo(nodo.getIzquierda(), valor, eliminado));
        } else if (valor > nodo.getValor()) {
            nodo.setDerecha(eliminarRecursivo(nodo.getDerecha(), valor, eliminado));
        } else {
            // Nodo encontrado, realizar la eliminación
            eliminado.set(true);
            if (nodo.getIzquierda() == null || nodo.getDerecha() == null) {
                // Caso 1 o 2: Nodo con uno o ningún hijo
                Nodo temp = (nodo.getIzquierda() != null) ? nodo.getIzquierda() : nodo.getDerecha();

                if (temp == null) {
                    // No tiene hijos, simplemente eliminar el nodo
                    nodo = null;
                } else {
                    // Tiene un hijo, copiar el contenido del hijo al nodo actual
                    nodo = temp;
                }
            } else {
                // Caso 3: Nodo con dos hijos
                Nodo sucesor = encontrarSucesor(nodo.getDerecha());
                nodo.setValor(sucesor.getValor());
                nodo.setDerecha(eliminarRecursivo(nodo.getDerecha(), sucesor.getValor(), eliminado));
            }
        }

        if (nodo != null) {
            // Actualizar la altura y realizar balanceo después de la eliminación
            actualizarAltura(nodo);
            nodo = balancear(nodo);
        }

        return nodo;
    }

    private Nodo encontrarSucesor(Nodo nodo) {
        while (nodo.getIzquierda() != null) {
            nodo = nodo.getIzquierda();
        }
        return nodo;
    }

    private int altura(Nodo nodo) {
        return (nodo == null) ? 0 : nodo.getAltura();
    }

    private void actualizarAltura(Nodo nodo) {
        if (nodo != null) {
            nodo.setAltura(1 + Math.max(altura(nodo.getIzquierda()), altura(nodo.getDerecha())));
        }
    }

    private int obtenerBalance(Nodo nodo) {
        return (nodo == null) ? 0 : altura(nodo.getIzquierda()) - altura(nodo.getDerecha());
    }

    private Nodo rotacionDerecha(Nodo y) {
        Nodo x = y.getIzquierda();
        Nodo T2 = x.getDerecha();

        // Realizar la rotación
        x.setDerecha(y);
        y.setIzquierda(T2);

        // Actualizar alturas
        actualizarAltura(y);
        actualizarAltura(x);

        return x;
    }

    private Nodo rotacionIzquierda(Nodo x) {
        Nodo y = x.getDerecha();
        Nodo T2 = y.getIzquierda();

        // Realizar la rotación
        y.setIzquierda(x);
        x.setDerecha(T2);

        // Actualizar alturas
        actualizarAltura(x);
        actualizarAltura(y);

        return y;
    }

    private Nodo balancear(Nodo nodo) {
        if (nodo == null) {
            return null;
        }

        // Actualizar la altura del nodo actual
        actualizarAltura(nodo);

        // Obtener el factor de balance del nodo
        int balance = obtenerBalance(nodo);

        // Casos de desequilibrio

        // Caso izquierda izquierda (LL)
        if (balance > 1 && obtenerBalance(nodo.getIzquierda()) >= 0) {
            return rotacionDerecha(nodo);
        }

        // Caso izquierda derecha (LR)
        if (balance > 1 && obtenerBalance(nodo.getIzquierda()) < 0) {
            nodo.setIzquierda(rotacionIzquierda(nodo.getIzquierda()));
            return rotacionDerecha(nodo);
        }

        // Caso derecha derecha (RR)
        if (balance < -1 && obtenerBalance(nodo.getDerecha()) <= 0) {
            return rotacionIzquierda(nodo);
        }

        // Caso derecha izquierda (RL)
        if (balance < -1 && obtenerBalance(nodo.getDerecha()) > 0) {
            nodo.setDerecha(rotacionDerecha(nodo.getDerecha()));
            return rotacionIzquierda(nodo);
        }

        // El árbol sigue balanceado, devolver el nodo sin cambios
        return nodo;
    }
}