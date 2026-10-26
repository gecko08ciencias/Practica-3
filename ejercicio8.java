/*
# Practica-3
# *@author Sergio Itan Jasso Jimenez
*@version 1.0
*@numero de cuenta 324316348
*@Since  20/10/2026
*/
import java.util.Scanner;
public class ejercicio7{
public static String invertirPalabras(String texto){

// creó 3 sreingbuilder para guardar las tres palabras de la oracion

StringBuilder a = new StringBuilder();
StringBuilder b = new StringBuilder();
StringBuilder c = new StringBuilder();


// incicializo i en 0 
 int i= 0;
// uso el while para que agregue al StringBuilder las letras de la primera palabra hasta que encuentre un espacio 

   while(i< texto.length() && texto.charAt(i) != ' '){
    a.append(texto.charAt(i));
    i++;
  }
// Uso un if para que si la frase es de una sola palabra no haga las demás 
  if(a.length() < texto.length()){    
// le pongo a i el valor del largo de a + 1 porque estoy contando el espacio y así inicie en la siguiente palabra
  i = a.length() +1;
  while(i< texto.length() && texto.charAt(i) != ' '){
    b.append(texto.charAt(i));
    i++;
    
  }
  b.append(" ");
    }
  if( (a.length() + b.length()) < texto.length()){
    i = a.length()+b.length()+1;
      while(i< texto.length() && texto.charAt(i) != ' '){
    c.append(texto.charAt(i));
    i++;
     
  }
  c.append(" ");
  }
// convierto los stringBuilder en String y los guardo en el resultado
     String resultado = c.toString() + b.toString() + a.toString();
        return resultado;
  }
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
   System.out.println("¿Cual es la cadena?");
        String texto = scan.nextLine();
        
    String resultado = invertirPalabras(texto);
   
    System.out.println(resultado);    
        
      }
}





