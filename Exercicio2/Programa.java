import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        String opcao;

        do {
            System.out.println("Escolha uma operação:");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.print("Digite o número da operação desejada (1/2/3/4): ");
            int escolha = scanner.nextInt();

            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado = 0;

            switch (escolha) {
                case 1:
                    resultado = calculadora.somar(num1, num2);
                    break;
                case 2:
                    resultado = calculadora.subtrair(num1, num2);
                    break;
                case 3:
                    resultado = calculadora.multiplicar(num1, num2);
                    break;
                case 4:
                    try {
                        resultado = calculadora.dividir(num1, num2);
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            System.out.printf("Resultado: %.2f\n", resultado);

            System.out.print("Deseja realizar outra operação? (s/n): ");
            opcao = scanner.next();

        } while (opcao.equalsIgnoreCase("s"));

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}
