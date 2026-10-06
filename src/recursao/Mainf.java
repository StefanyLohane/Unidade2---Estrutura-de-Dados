package recursao;

import java.util.Scanner;

public class Mainf {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a posição de fibonacci para ver o número: ");
        int n = scan.nextInt();

        System.out.println("Fibonacci na posição " + n + ": "
                + Fibonacci.fibonacci(n));
    }
}
