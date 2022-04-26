import java.util.*;

public class Calculadora {
    int numero;


    public void menorValor(){

        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <=3; i++) {
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite o número inteiro: ");
            numero = ler.nextInt();
            numeros.add(numero);
        }

        Collections.sort(numeros);

        System.out.println("Números digitados: "+ numeros);
        System.out.println("E o menor valor digitado foi: " + numeros.get(0));

    }
}