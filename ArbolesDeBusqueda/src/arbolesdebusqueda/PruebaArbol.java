
package arbolesdebusqueda;

public class PruebaArbol {

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        // Inserción de nodos
        arbol.insertar(10);
        arbol.insertar(5);
        arbol.insertar(15);
        arbol.insertar(2);
        arbol.insertar(7);
        arbol.insertar(12);
        arbol.insertar(20);

        // Impresión del árbol después de la inserción
        System.out.println("Árbol después de la inserción:");
        System.out.println("Recorrido Inorden: " + arbol.recorrerInorden(arbol.raiz));
        System.out.println("Recorrido Preorden: " + arbol.recorrerPreorden(arbol.raiz));
        System.out.println("Recorrido Postorden: " + arbol.recorrerPostorden(arbol.raiz));

        // Eliminación de nodos
        arbol.eliminar(5);
        arbol.eliminar(15);

        // Impresión del árbol después de la eliminación
        System.out.println("\nÁrbol después de la eliminación:");
        System.out.println("Recorrido Inorden: " + arbol.recorrerInorden(arbol.raiz));
        System.out.println("Recorrido Preorden: " + arbol.recorrerPreorden(arbol.raiz));
        System.out.println("Recorrido Postorden: " + arbol.recorrerPostorden(arbol.raiz));
    }
}

