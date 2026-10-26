/*
# Practica-3
# *@author Sergio Itan Jasso Jimenez
*@version 1.0
*@numero de cuenta 324316348
*@Since  20/10/2026
*/
public class ejercicio10 {

    private StringBuilder contenido;
    private StringBuilder anterior;

    public EditorTexto() {
        contenido = new StringBuilder();
        anterior = null;
    }

    private void validarRango(int inicio, int fin) {
        if (inicio < 0 || fin > contenido.length() || inicio > fin) {
            throw new IllegalArgumentException(
                "Rango inválido: [" + inicio + ", " + fin + "]"
            );
        }
    }

    private void guardarEstado() {
        anterior = new StringBuilder(contenido);
    }

    public void escribir(String texto) {
        if (texto == null || texto.isEmpty()) {
            return;
        }
        guardarEstado();
        contenido.append(texto);
    }

    public void insertar(int posicion, String texto) {
        if (texto == null || texto.isEmpty()) return;
        validarRango(posicion, posicion);
        guardarEstado();
        contenido.insert(posicion, texto);
    }

    public void eliminar(int inicio, int fin) {
        validarRango(inicio, fin);
        guardarEstado();
        contenido.delete(inicio, fin);
    }

    public void reemplazar(int inicio, int fin, String texto) {
        if (texto == null || texto.isEmpty()) return;
        validarRango(inicio, fin);
        guardarEstado();
        contenido.replace(inicio, fin, texto);
    }

    public void deshacer() {
        if (anterior == null) {
            return;
        }
        contenido = anterior;
        anterior = null;
    }

    public String obtenerTexto() {
        return contenido.toString();
    }
}
