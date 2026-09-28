package revisao.main;

import revisao.estrutura.Fila;

public class Principal {

    public static void main(String[] args) {

        Fila fila = new Fila();

        // Inserindo elementos na fila
        fila.inserir("A");
        fila.inserir("B");
        fila.inserir("C");
        fila.inserir("D");

        // Mostrando a fila
        System.out.println("Fila original:");
        fila.mostrar();

        // Verificando se a fila está vazia
        System.out.println("\nA fila está vazia? " + fila.verificar());

        // Removendo o primeiro elemento
        System.out.println("\nElemento removido: " + fila.remover());

        // Mostrando a fila depois da remoção
        System.out.println("\nFila depois da remoção:");
        fila.mostrar();

        // Invertendo a fila
        fila.inverter();

        // Mostrando a fila invertida
        System.out.println("\nFila invertida:");
        fila.mostrar();
    }
}