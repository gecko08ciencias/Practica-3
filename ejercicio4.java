/*
# Practica-3
# *@author Sergio Itan Jasso Jimenez
*@version 1.0
*@numero de cuenta 324316348
*@Since  20/10/2026
*/
import java.util.Scanner;
public class ejercicio4{


public static String comprimir(String texto){
 if(texto.length() == 0) return "";
 StringBuilder resultado = new StringBuilder();
 char grupo = texto.charAt(0);
 int repeticiones = 1;
 
 for (int i= 1; i < texto.length(); i++){    
     char actual = texto.charAt(i);
     if(actual == grupo){
        repeticiones++;
     }else{
        resultado.append(grupo).append(repeticiones);
        grupo = actual;
        repeticiones = 1;
     }
  }
  resultado.append(grupo).append(repeticiones);
  return resultado.toString();
  }
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
   System.out.println("¿Cual es la cadena que quieres comprimir?");
        String prueba = scan.nextLine();
        String resultado = comprimir(prueba);
        System.out.println(""+resultado);
      }
}  
