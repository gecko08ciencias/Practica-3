# Practica-3
# *@author Sergio Itan Jasso Jimenez
*@version 1.0
*@numero de cuenta 324316348
*@Since  20/10/2026
*/

##Ejercicio 1. 
-Indica qué imprime cada instrucción y qué variables comparten un objeto.
System.out.println(a == b); Imprime false
System.out.println(a == c); Imprime true
System.out.println(a == d); Imprime false
System.out.println(a.equals(d)); Imprime true
System.out.println(a); imprime java
System.out.println(b); imprime java 21

-Explica el papel del String Pool, la diferencia entre == y equals() y qué ocurre con concat().

String pool es donde se guardan las cadenas para reutilizarlas despues.
La diferencia de == y equals es que el primero compara las direcciones y el segundo el contenido
El concat() agrega a la cadena lo que esta entre parentesis



##Ejercicio 2.

- Determina la salida exacta y el contenido tras cada modificación.
StringBuilder sb = new StringBuilder("ABCDE");
sb.delete(1, 4);  Borra BCD  y queda AE
sb.insert(1, "xyz"); inserta desde el "A" "xyz" y queda como "AxyzE"
sb.reverse(); invierte el orden de las letras y queda como "zyxBA"
sb.replace(1, 4, "-"); reemplaza "zyx" con "-" y queda como "E-A"
System.out.println(sb);  imprime "E-A"
System.out.println(sb.length()); imprime "3"
System.out.println(sb.capacity()); Imprime "18"


- Explica por qué delete(1, 4) no significa eliminar cuatro caracteres. Diferencia length() de capacity().

En delete no se borran 4 porque el uno marca desde donde vas a borrar y el 4 donde vas a terminar, se detiene cuando llega al 4.
length ta va a dar el largo de la cadena y capacyti la cantidad de espacio que tienes dsiponible para mas characteres.

## Ejercicio 3.

- Escribe todas las salidas y explica cómo afecta cada modificación a las variables.

StringBuilder a = new StringBuilder("Hola");
StringBuilder b = a;
StringBuilder c = new StringBuilder("Hola");
a.append(" mundo"); le agrega al a "mundo" y queda como "Hola mundo" 
b.delete(0, 5); se borra toda la cadena y queda como " mundo"
System.out.println(a); Imprime " mundo"
System.out.println(b); Imprime " mundo"
System.out.println(c); Imprime "Hola"
System.out.println(a == b); True
System.out.println(a.equals(b)); True
System.out.println(a.equals(c)); False

- Dibuja un esquema de memoria con las variables, los objetos y sus referencias.
         ------------                    ---------
         | Hola     |-----a              | mundo |------C
         |          |-----b              |       |
         ------------                    ---------
 a.append(" mundo");        
         ------------                    ---------
         | Hola     |-----a              | mundo |------C
         | mundo    |-----b              |       |
         ------------                     --------
 b.delete(0, 5)        
         
         ------------                    ---------
         |          |-----a              | mundo |------C
         | mundo    |-----b              |       |
         ------------                     --------
         
         
