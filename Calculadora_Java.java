import java.util.Scanner;
/**
 *
 * @author Felipe Yudi Okuba
 */
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("\n\n--- CALCULADORA ---");

    // Declarando números a serem calculados
    System.out.print("Caso deseje calcular porcentagem \nadicionar \"0\" ao segundo valor.\n");

    // variável continua → gatilho para repetição While.
    String continua = "";
    while (!continua.equals("nao")){

      // Valores lidos pelo usuário.
      System.out.print("\nDigite o primeiro valor: ");
      float n1 = sc.nextFloat();

      System.out.print("Digite o segundo valor: ");
      float n2 = sc.nextFloat();

      System.out.println("\n\nEscolha a operação desejada.");
      System.out.println("1 - Adição");
      System.out.println("2 - Subtração");
      System.out.println("3 - Multiplicação");
      System.out.println("4 - Divisão");
      System.out.println("5 - Acrescentar porcentagem");
      System.out.println("6 - Reduzir porcentagem");
      
      // variavel op ativa o switch para operações matemáticas.
      int op = sc.nextInt();
      //variavel de resultado.
      float res;

      switch (op){
        case 1:
        res = n1 + n2;
        System.out.print("\n\nA soma entre os dois valores é: "+res);
        break;

        case 2:
        res = n1 - n2;
        System.out.print("\n\nA subtração entre os dois valores é: "+res);
        break;

        case 3:
        res = n1 * n2;
        System.out.print("\n\nA multiplicação entre os dois valores é: "+res);
        break;

        case 4:
        res = n1 / n2;
        System.out.print("\n\nA divisão entre os dois valores é: "+res);
        break;

        case 5:
        System.out.println("Quanto % você quer acrescentar? ");
  
        float somaPorc = sc.nextFloat();
        res = ((somaPorc / 100)*n1)+n1;
        System.out.printf("\nO acréscimo da porcertagem é: %.2f",res); 
        break;

        case 6:
        System.out.println("Quanto % você quer reduzir? ");
  
        float subPorc = sc.nextFloat();
        res = (((subPorc / 100)*n1)-n1)*-1;
        System.out.printf("\nA redução da porcentagem é: %.2f",res); 
        break; 
      }
      System.out.println("\n\nDeseja Continuar? sim/nao");

      /* Ler variavel de continuação do código. 
      Qualquer coisa diferente de N continuará o código */
      continua = sc.nextLine();
        continua = sc.nextLine();

    }
    System.out.println("\n\nObrigado por utilizar a calculadora !!");
  }
}