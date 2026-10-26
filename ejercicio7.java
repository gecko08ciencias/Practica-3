/*
# Practica-3
# *@author Sergio Itan Jasso Jimenez
*@version 1.0
*@numero de cuenta 324316348
*@Since  20/10/2026
*/
import java.util.Scanner;
public class ejercicio7{
public static String reemplazar(String texto, String buscar, String reemplazo){
//este if es para el caso de que nos pidan buscar algo vacio
if(buscar.length() > 0){
aqui si nos piden buscar algo que no esta en la cadena
if(texto.contains(buscar)){  
 
 StringBuilder resultado = new StringBuilder();
 //inicializamos los valores
 char busco = buscar.charAt(0);

 int largo = 0;
 int j=0;
 // comparamos las letras del texto con las que buscamos
 for (int i= 0; i < texto.length(); i++){ 
 char original = texto.charAt(i);
 busco = buscar.charAt(j);
 // si la letra del texto es igual a la que buscamos le suma uno al largo el cual utilizaremos para comparar con el length de buscar
     if(original == busco){
        largo= largo +1;
        j++;
// si es diferente al resultado le agregamos la letra diferente      
        }else{ resultado.append(texto.charAt(i));}
//comparamos el lenth y el largo para asegurarnos de que si encontro la palabra y se agrega el reemplazo al resultado
      if(largo == buscar.length()){ resultado.append(reemplazo);
//actualizamos los valores de j y largo para comenzar de nuevo el ciclo
      j = 0;
      largo = 0;
      }
    
  }
  
  return resultado.toString();
  }
  }
  return texto; 
  }
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
   System.out.println("¿Cual es la cadena?");
        String texto = scan.nextLine();
   System.out.println("¿Cual palabra quieres reemplazar?");
        String buscar = scan.nextLine();
   System.out.println("¿Cual es la palabra con la que vas a reemplazr?");
        String reemplazo = scan.nextLine();
        
        String resultado = reemplazar(texto, buscar, reemplazo);
        
        System.out.println(""+resultado);
      }
    }


