package revisao.estruturaqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Fila {

    Queue<String> fila = new LinkedList<>();
    Stack<String> pilha = new Stack<>();

    int quantidade = 0;

    // Insere um elemento na fila
    public void inserir(String e) {
        fila.add(e);
        quantidade++;
    }

    // Remove o primeiro elemento da fila
    public String remover() {

        if (verificar()) {
            System.out.println("A fila está vazia!");
            return null;
        }

        quantidade--;
        return fila.poll();
    }

    // Verifica se a fila está vazia
    public boolean verificar() {
        return fila.isEmpty();
    }

    // Mostra os elementos da fila
    public void mostrar() {

        if (verificar()) {
            System.out.println("A fila está vazia!");
        } else {
            System.out.println("Fila: " + fila);
        }
    }

    // Inverte a fila usando uma pilha
    public void inverter() {

        while (!fila.isEmpty()) {
            pilha.push(fila.poll());
        }

        while (!pilha.isEmpty()) {
            fila.add(pilha.pop());
        }
    }
}