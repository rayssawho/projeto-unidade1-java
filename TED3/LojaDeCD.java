import java.util.*;
public class LojaDeCD {
    private int cor;

    public int getCor() {
        return cor;
    }
    public void setCor(int cor) {
        this.cor = cor;
    }

    public void verificaCor(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual é a cor da etiqueta do CD?\n(Digite 1 para vermelho, 2 para verde, 3 para azul ou 4 para amarelo) \n" );
        setCor(entrada.nextInt());
        switch (getCor()) {
            case 1:
                System.out.println("O valor do seu CD é R$ 40,00");
                break;
            case 2:
                System.out.println("O valor do seu CD é R$ 10,00");
                break;
            case 3:
                System.out.println("O valor do seu CD é R$ 20,00");
                break;
            case 4:
                System.out.println("O valor do seu CD é R$ 30,00");
                break;

            }
        }

    }


    