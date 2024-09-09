import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.println("Digite seu peso (kg): ");
            double peso = scanner.nextDouble();

            System.out.println("Digite sua altura (m): ");
            double altura = scanner.nextDouble();

            IMC imc = new IMC(peso, altura);
            double valorIMC = imc.calcularIMC();
            String classificacao = imc.classificarIMC();

            System.out.printf("Seu IMC é: %.2f\n", valorIMC);
            System.out.println("Classificação: " + classificacao);

            System.out.println("Deseja calcular novamente? (s/n): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("s"));

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}
