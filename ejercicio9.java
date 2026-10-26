/*
# Practica-3
# *@author Sergio Itan Jasso Jimenez
*@version 1.0
*@numero de cuenta 324316348
*@Since  20/10/2026
*/
import java.util.Scanner;

public class ejercicio9 {
    public static boolean validar(String expresion) {
        
StringBuilder pila = new StringBuilder();
        
  for (int i = 0; i < expresion.length(); i++) {
            char actual = expresion.charAt(i);
 // en el if agrego a la pila las parentesis, corchetes y llaves que son para abrir ignorando todo lo que no sea eso           
          
    if (actual == '(' || actual == '[' || actual == '{') {
     pila.append(actual);
     // en este else lo que hace es que si encuentra uno cerrado lo va a comparar con el ultimo de la pila 
     } else if (actual == ')' || actual == ']' || actual == '}') {
     //este para el caso de que este vacia la pila porque en teoria tendria que tener los abiertos
       if (pila.length() == 0) {
      return false;
      }

      char ultimoEnPila = pila.charAt(pila.length() - 1);
       if ((actual == ')' && ultimoEnPila == '(') ||
           (actual == ']' && ultimoEnPila == '[') ||
          (actual == '}'  && ultimoEnPila == '{')){         
            pila.deleteCharAt(pila.length() - 1);} else {
            return false;
        }
      }
     }
   return pila.length() == 0;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Cual es la cadena?");
        String expresion = scan.nextLine();
        
        
        boolean resultado = validar(expresion);
        
        System.out.println("Resultado: " + resultado);
    }
}

