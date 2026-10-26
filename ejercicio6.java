/*
# Practica-3
# *@author Sergio Itan Jasso Jimenez
*@version 1.0
*@numero de cuenta 324316348
*@Since  20/10/2026
*/
import java.util.Scanner;
public class ejercicio6{
public static String eliminarDuplicados(String texto){
//defino que debe hacer si nos pasan una palabra vacia
if(texto.length() == 0) return "";
 StringBuilder resultado = new StringBuilder();
 // el anterior inicia desde el cero
 char anterior = texto.charAt(0);

 // En este for detecto los caracteres repetidos comparando la letra anterior con el actual
 for (int i= 1; i < texto.length(); i++){  
 //actual inicia desde el 1 para comparar el anterior con él
     char actual = texto.charAt(i);
 // si son el diferentes le va agregando al resultado el la letra del anterior
     if(actual != anterior){
        resultado.append(anterior);
        anterior = actual;
     }
// en simples palabras compara las letra anterior con la siguiente y si son diferentes las agrega al resultado
    
  }
  resultado.append(anterior);
  return resultado.toString();
  }
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
   System.out.println("¿Cual es la cadena que quieres comprimir?");
        String prueba = scan.nextLine();
        String resultado = eliminarDuplicados(prueba);
        System.out.println(""+resultado);
      }
}  
