package fila;

public class FilaClasse {
    public static void main(String[] args) {
        EstruturaFila fila = new EstruturaFila();

        fila.inserir("Stefany");
        fila.inserir("Johana");
        fila.inserir("Igor");

        fila.mostrar();

        System.out.println("Removendo elemento: " + fila.remover());

        fila.mostrar();

    }
}
