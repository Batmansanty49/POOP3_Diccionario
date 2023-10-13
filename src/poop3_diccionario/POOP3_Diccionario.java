/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package poop3_diccionario;
/**
 * Bibliotecas utilizadas en el programa
 */
import java.util.Hashtable;
import java.util.Enumeration;
/**
 * @author Ruiz Ramírez Santiago
 * Clase que realiza un diccionario utilizando Hashtable
 */
public class POOP3_Diccionario {

    /**
     * @param args the command line arguments
     * Funcion main
     */
    public static void main(String[] args) 
    {
        System.out.println("\n...... Hashtable ......");
        System.out.println("\n----Ejercicio 1");
        System.out.println("\nInstrucciones: Realizar un diccionario con 5 palabras usando Hashtable e imprimir todos los elementos.");
        System.out.println("\n     >> DICCIONARIO <<");
        Hashtable<String, String> diccionario = new Hashtable<String, String>();
        
        /**
         * Agrega las palabras y sus definiciones al diccionario
         */
        diccionario.put ("Noquear","Dejar al adversario fuera de combate.");
        diccionario.put ("Pinchar","Clavar algo punzante en alguien o algo.");
        diccionario.put ("Impronunciable","Imposible de pronunciar o de muy dificil pronunciacion.");
        diccionario.put ("Pereza","Negligencia, tedio o descuido en las cosas a que estamos obligados.");
        diccionario.put ("Nisayo","Desperdicio de las comidas que se recoge para alimentar a los cerdos.");
        
        /**
         * Imprime los datos del diccionario
         */
        Enumeration<String> palabras = diccionario.keys ();
        while (palabras.hasMoreElements())
        {
            String palabra = palabras.nextElement();
            String significado = diccionario.get(palabra);
            System.out.println("\nPalabra: " + palabra + "\nSignficado: "+ significado);
        }
    }
    
}

