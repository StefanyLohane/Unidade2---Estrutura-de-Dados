package fila;

public class PrincipalPilha {
    public static void main(String[] args) {
        PilhaClasse p = new PilhaClasse();

        p.inserir("Stefany");
        p.inserir("Johana");
        p.inserir("Igor");

        p.mostrar();

        System.out.println("Removendo elemento: " + p.remover());

        p.mostrar();

    }
    
}
