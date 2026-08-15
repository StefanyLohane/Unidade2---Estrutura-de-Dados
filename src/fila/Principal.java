package fila;

public class Principal {
    public static void main(String[] args) {
        Pilha p = new Pilha();

        p.inserir("Stefany");
        p.inserir("Johana");
        p.inserir("Igor");

        p.mostrar();

        System.out.println("Removendo elemento: " + p.remover());

        p.mostrar();

    }
    
}
