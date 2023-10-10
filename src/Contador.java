
import java.util.Scanner;

public class Contador {
    public static  void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro parâmetro: ");
        int parametroUm = entrada.nextInt();
        System.out.println("Digite o valor do segundo parâmetro: ");
        int parametroDois = entrada.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (Exception e) {
            System.out.println("Erro: Segundo parametro tem que ser maior que o primeiro!!");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ValoresInvalidosException {
        if(parametroDois < parametroUm){
            System.out.println("Valor inválido, digite novamente!");
        }

        int contagem = parametroDois - parametroUm;
       for (int i = 1; i <= contagem; i++){
           System.out.println("Imprimindo número: " + i);
       }
    }
    }

