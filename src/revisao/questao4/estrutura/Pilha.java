package revisao.questao4.estrutura;

import java.util.Stack;
import revisao.questao4.basica.Processo;

public class Pilha {

    Stack<Processo> pilha = new Stack<>();

    public void empilhar(Processo processo) {
        pilha.push(processo);
    }

    public Processo desempilhar() {

        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia!");
            return null;
        }

        return pilha.pop();
    }

    public Processo verificarTop() {

        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia!");
            return null;
        }

        return pilha.peek();
    }

    public void imprimir() {

        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia!");
        } else {
            System.out.println("Pilha: " + pilha);
        }
    }
}