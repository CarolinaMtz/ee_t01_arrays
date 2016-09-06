/*
 *  @author Carolina Martinez 
 */
package ee_t01_arrays;

/**
 *Crear un proyecto llamado: ee_t01_arrays
Este proyecto consiste en una clase que lee un archivo, 
especificado como el primer parametro de la clase 
lo siguiente:
ENTRADA:
6
1
2
3
4
5
6
SALIDA:
6
5
4
3
2
1
La primer linea es el numero de elementos y las siguientes son los elementos especificos.
Lo anterior se almacena en un array y se imprime en consola el mismo de manera descendente.
 * 
 */
import java.io.*;
import java.util.*;
public class Archivo {
    
    private BufferedReader br;
     
    public void analizar()//Metodo en el que se realizaran diferentes instrucciones
    {
        try {
            br = new BufferedReader(new FileReader( "Numeros.txt")); // Direccion del archivo
            String s = br.readLine();       
            int a []= new int [Integer.parseInt(s)];//Arreglo que almacena todos los numeros que tiene el archivo
            String x = ""; // Cadena que almacena el valor de los numeros del archivo
            s = br.readLine();
            
            while (s != null)
                  {
                   for(int i =0;i<a.length;i++)
                      {
                       a [i] = Integer.parseInt(s); // Se guardan en el arreglo los elementos leidos del archivo 
                       x +=   a[i];  
                       s = br.readLine();
                       }
                    }
             
                    System.out.println("Entrada:");
                    for(int i =0;i<a.length;i++)
                       {
                       System.out.println(a [i]); // Se imprimen los elementos del archivo
                       }
                    
                       Integer b []= new Integer [x.length()]; // Arreglo que contiene los numeros a ordenar
                       for(int j = 0;j<b.length;j++)
                          {
                           b[j] = Integer.parseInt(x.charAt(j)+"");
                          }
            
                           Arrays.sort(b, Collections.reverseOrder()); // Se usa el reverseOrder para ordenar de manera descendente
                           System.out.println("Salida:");
                           for(int j = 0;j<b.length;j++) 
                              {
                              System.out.println(b[j]);//Se imprimen los elementos del archivo ya ordenados de manera descendente
                              }
   
            } catch(IOException e) { //Se atrapan las excepciones que puedan surgir
                     System.out.println("Error E/S: " + e);
        }            
    }


    
    public static void main(String[] args) //Metodo main para crear el objeto
    {
       Archivo ee = new Archivo(); //Se crea un nuevo objeto
       ee.analizar();//Se manda a llamar el metodo analizar
    }
}  
    




