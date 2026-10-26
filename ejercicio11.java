/*
# Practica-3
# *@author Sergio Itan Jasso Jimenez
*@version 1.0
*@numero de cuenta 324316348
*@Since  20/10/2026
*/
public class ejercicio7{
 public static void main(String [] args){
   int[] numeros = {8, 3, 10, 5, 4};
   int suma = 0;
// ciclo for para la suma
    for(int i=0; i< numeros.length; i++){
    int actual = numeros [i];
    suma = suma + actual;


 }
 
 int promedio = 0;
 //utilizo la suma para sacara el promedio
 promedio = suma/numeros.length;
 
 int mayor = numeros [0];
 //ciclo for para sacar el maaximo
 
   for( int j = 1; j < numeros.length; j ++){    
    int actual = numeros [j];
    if( actual >= mayor){
    mayor = actual;
    
    } 
 
   }
   System.out.println("suma: " + suma + ", promedio: " + promedio + ", mayor: " + mayor);
 }
}
