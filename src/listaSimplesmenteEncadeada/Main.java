package listaSimplesmenteEncadeada;

public class Main {
    public static void main(String[] args) {
        ListaLigada1 lista = new ListaLigada1();

        lista.inserirNoComeco(2);
        System.out.println(lista.toString());

        lista.inserirNoFim(3);
        System.out.println(lista.toString());

        lista.inserirNoComeco(1);
        System.out.println(lista.toString());
        
        lista.inserirNoFim(4);
        System.out.println(lista.toString());
        
        lista.inserirNoComeco(0);
        System.out.println(lista.toString());
        
        lista.removerNoComeco();
        lista.removerNoFim();
        lista.removerPorPosicao(1);
        System.out.println(lista.toString());

    }
}
