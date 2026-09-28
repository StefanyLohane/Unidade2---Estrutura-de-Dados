package revisao.questao4.main;

import revisao.questao4.basica.Processo;
import revisao.questao4.estrutura.Pilha;

public class Principal {

    public static void main(String[] args) {

        Pilha pilha = new Pilha();

        Processo p1 = new Processo(1, "Documento");
        Processo p2 = new Processo(2, "Trabalho");
        Processo p3 = new Processo(3, "Foto");
        Processo p4 = new Processo(4, "Relatório");

        pilha.empilhar(p1);
        pilha.empilhar(p2);
        pilha.empilhar(p3);
        pilha.empilhar(p4);

        System.out.println("Elementos da pilha:");
        pilha.imprimir();

        System.out.println("\nElemento do topo:");
        System.out.println(pilha.verificarTop());

        System.out.println("\nElemento desempilhado:");
        System.out.println(pilha.desempilhar());

        System.out.println("\nPilha depois do desempilhamento:");
        pilha.imprimir();

        System.out.println("\nNovo elemento do topo:");
        System.out.println(pilha.verificarTop());
    }
}