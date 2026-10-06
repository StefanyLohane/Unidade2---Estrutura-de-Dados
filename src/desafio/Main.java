package desafio;

public class Main {

    public static void main(String[] args) {

        FilaPPilha fila = new FilaPPilha();

        // Questão 1
        System.out.println("QUESTÃO 1");

        fila.inserir("A");
        fila.inserir("B");
        fila.inserir("C");
        fila.inserir("D");

        System.out.println("Fila original:");
        fila.mostrar();

        fila.inverter();

        System.out.println("Fila invertida:");
        fila.mostrar();


        // Questão 2
        System.out.println("\nQUESTÃO 2");

        String palavra = "ARARA";

        System.out.println("Palavra: " + palavra);

        if (fila.verificarPalindromo(palavra)) {
            System.out.println("É um palíndromo!");
        } 
        else {
            System.out.println("Não é um palíndromo!");
        }
    }


}