/*
# Practica-3
# *@author Sergio Itan Jasso Jimenez
*@version 1.0
*@numero de cuenta 324316348
*@Since  20/10/2026
*/
import java.util.Scanner;

public class ejercicio7 {

    public String addBinary(String a, String b) {
        //convertimos a arreglos de caracteres
        char[] arregloA = a.toCharArray();
        char[] arregloB = b.toCharArray();
        
        //creamos el arreglo 
        int tamañoMaximo = arregloA.length + b.length() + 1; 
        char[] resultadoInvertido = new char[tamañoMaximo];
        
        //indices para empezar desde el final de cada arreglo
        int i = arregloA.length - 1;
        int j = arregloB.length - 1;
        int k = 0; // Este va a contar cuántos caracteres metemos en el resultado
        
        int acarreo = 0;
        
        // Un while que para cuando ya no hay numeros que sumar
        while (i >= 0 || j >= 0) {
            int digitoA = 0;
            int digitoB = 0;
            
            //si todavía hay caracteres en A, los convertimos a número usando ifs simples
            if (i >= 0) {
                if (arregloA[i] == '1') {
                    digitoA = 1;
                } else {
                    digitoA = 0;
                }
                i--;
            }
            
            // Lo mismo para B
            if (j >= 0) {
                if (arregloB[j] == '1') {
                    digitoB = 1;
                } else {
                    digitoB = 0;
                }
                j--;
            }
            
            // Sumamos los dígitos de esta columna más lo que llevábamos arrastrando
            int sumaColumna = digitoA + digitoB + acarreo;
            
            
            if (sumaColumna == 0) {
                resultadoInvertido[k] = '0';
                acarreo = 0;
            } else if (sumaColumna == 1) {
                resultadoInvertido[k] = '1';
                acarreo = 0;
            } else if (sumaColumna == 2) {
                resultadoInvertido[k] = '0';
                acarreo = 1; // Llevamos 1
            } else if (sumaColumna == 3) {
                resultadoInvertido[k] = '1';
                acarreo = 1; // Llevamos 1
            }
            
            k++; // Avanzamos en el arreglo del resultado
        }
        
        // Si al final de todo el ciclo nos quedó un acarreo suelto, lo agregamos
        if (acarreo == 1) {
            resultadoInvertido[k] = '1';
            k++;
        }
        
        // Como fuimos sumando de atrás para adelante, el resultado quedó al revés
        // usamos for  para voltear el resultado
        String resultadoFinal = "";
        for (int x = k - 1; x >= 0; x--) {
            resultadoFinal = resultadoFinal + resultadoInvertido[x];
        }
        
        return resultadoFinal;
    }

    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Introduce la primera cadena binaria: ");
        String binario1 = scan.nextLine();
        
        System.out.print("Introduce la segunda cadena binaria: ");
        String binario2 = scan.nextLine();
        
        ejercicio7 objeto = new ejercicio7();
        String respuesta = objeto.addBinary(binario1, binario2);
        
        System.out.println("La suma binaria es: " + respuesta);
        
      
    }
}

