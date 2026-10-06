package recursao;

import java.util.Scanner;

public class Mainp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Base: ");
        int base = scan.nextInt();

        System.out.println("Expoente: ");
        int expoente = scan.nextInt();

        System.out.println(base + " elevado a " + expoente + " = "
                + Potencia.calcular(base, expoente));
    }
}
