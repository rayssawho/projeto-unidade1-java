package TED5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Numeros numero1 = new Numeros();

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        numero1.numero = ler.nextInt();

        numero1.verificaNumero();


    }
}
