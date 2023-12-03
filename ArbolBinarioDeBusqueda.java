/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolbinariodebusqueda;

import java.util.ArrayList;

/**
 *
 * @author felix
 */
public class ArbolBinarioDeBusqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
        System.out.println("Mostrar nivel: ");
        ArrayList<Integer> lv0Aux = arbol.mostrarNivel(2);
        for (Integer i:lv0Aux)
        {
            System.out.print(i.toString() + "--");
        }
        System.out.println("Codigo de 20:");
        System.out.println(arbol.obtenerCódigo(12));
        
        
        
        arbol.recorrerPorNivel(arbol.raiz);
        // Eliminación de nodos
        arbol.eliminar(5);
        arbol.eliminar(15);
        // Impresión del árbol después de la eliminación
        System.out.println("\nÁrbol después de la eliminación:");
        System.out.println("Recorrido Inorden: " + arbol.recorrerInorden(arbol.raiz));
        System.out.println("Recorrido Preorden: " + arbol.recorrerPreorden(arbol.raiz));
        System.out.println("Recorrido Postorden: " + arbol.recorrerPostorden(arbol.raiz));
        System.out.println("-------------------------------------------------");
        System.out.println("Mostrar nivel: ");
        ArrayList<Integer> lv0 = arbol.mostrarNivel(2);
        for (Integer i:lv0)
        {
            System.out.print(i.toString() + "--");
        }
        arbol.recorrerPorNivel(arbol.raiz);
        
    }
    
}
