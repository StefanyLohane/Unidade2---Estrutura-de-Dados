package fila;

public class Fila {
    public static void main(String[] args) {
        Estrutura fila = new Estrutura();

        fila.inserir("Stefany");
        fila.inserir("Johana");
        fila.inserir("Igor");

        fila.mostrar();

        System.out.println("Removendo elemento: " + fila.remover());

        fila.mostrar();

    }
}
