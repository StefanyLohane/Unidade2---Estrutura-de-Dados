package listaDuplamenteEncadeada;

import java.util.Scanner;

public class MainDupla {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Iniciando lista... \n");
        ListaLigada2 lista = new ListaLigada2();

        System.out.print("Digite o número para colocar no fim: \n");
        lista.inserirNoFim(scan.nextInt());
        
        System.out.print("\nDigite o número para colocar no começo: \n");
        lista.inserirNoComeco(scan.nextInt());
        
        System.out.print("\nDigite o número para colocar outro no fim: \n");
        lista.inserirNoFim(scan.nextInt());

        lista.inserirEmQualquerPosicao(7, 1);

        System.out.println("\nLista atualmente:");
        System.out.println(lista.toString());
    }
}
