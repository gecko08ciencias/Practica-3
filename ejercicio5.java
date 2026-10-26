/*
# Practica-3
# *@author Sergio Itan Jasso Jimenez
*@version 1.0
*@numero de cuenta 324316348
*@Since  20/10/2026
*/
import java.util.Scanner;
public class ejercicio5{

public static boolean esPalindromo(String texto){
//Borro todos los espacios y cambio las mayúsculas por minusculas
texto= texto.toLowerCase().replaceAll(" ", "").replaceAll("['?¡¿!#$%&/=*+]","");

int i= 0;
int j = texto.length() -1;
//Comparo la ultima letra con la primera
if (texto.charAt(i) == texto.charAt(j)){
  for(i=0; i< texto.length()/2; i++){
 }
 for(j=texto.length()-1; j> texto.length()/2; j--){
 }
// utilize los for para que llegaran a la mitad de la palabra para despues compararlas 
 if( i==j){
 return true; 
 }else{
  return false;
   }
 }else{
  return false;
 }
 }
 
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
   System.out.println("Dame la cadena :)");
        String prueba = scan.nextLine();
  if(esPalindromo(prueba)) {
   System.out.println("True");
   }else{ 
    System.out.println("False");
    }          
           
    }
    
}  
