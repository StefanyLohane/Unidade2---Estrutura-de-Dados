package revisao.estrutura;

import java.util.LinkedList;
import java.util.Stack;

public class Fila {

    Stack<String> pilha = new Stack<>();
    LinkedList<String> fila = new LinkedList<>();
    int quantidade = 0;

    // Insere um elemento no final da fila
    public void inserir(String e) {
        fila.addLast(e);
        quantidade++;
    }

    // Remove o primeiro elemento da fila
    public String remover() {

        if (verificar()) {
            System.out.println("A lista está vazia!");
            return null;
        } 
        else {
            quantidade--;
            return fila.removeFirst();
        }
    }

    // Verifica se a fila está vazia
    public boolean verificar() {

        if (this.fila.isEmpty()) {
            return true;
        }

        return false;
    }

    // Mostra os elementos da fila
    public void mostrar() {

        if (verificar()) {
            System.out.println("A lista tá vazia");
        } 
        else {
            System.out.println("Fila: " + fila);
        }
    }

    // Inverte a fila usando uma pilha auxiliar
    public void inverter() {

        // Retira os elementos da fila e coloca na pilha
        while (!fila.isEmpty()) {
            pilha.push(fila.removeFirst());
        }

        // Retira os elementos da pilha e coloca novamente na fila
        while (!pilha.isEmpty()) {
            fila.addLast(pilha.pop());
        }
    }
}