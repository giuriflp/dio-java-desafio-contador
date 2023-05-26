import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Imprima o primeiro parâmetro: ");
        int num1 = scanner.nextInt();
        System.out.println("Imprima o segundo parâmetro: ");
        int num2 = scanner.nextInt();

        try {
            contar(num1, num2);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro. Tente de novo!");
        }

    }
    static void contar(int n1, int n2) throws ParametrosInvalidosException {
        if(n2 > n1) {
            int contagem = n2 - n1;
            for(int i = n1; i < n2; i++) {
                System.out.println("Imprimindo o numero: " + i);
            }
        } else {
            throw new ParametrosInvalidosException();
        }
    }
}
