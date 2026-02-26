import java.util.Scanner;

class Sum {
    public static int sum(int a, int b) {
        return a + b;
    }
}

class Subtraction {
    public static int subtraction(int a, int b) {
        return a - b;
    }
}

class Division {
    public static int divison(int a, int b) {
        return a / b;
    }
}

class Multiplication {
    public static int multiplication(int a, int b) {
        return a * b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Soma\n2 - Subtração\n3 - Divisão\n4 - Multiplicação\n");
        System.out.println("Escolha um número entre 1 e 4: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Digite o primeiro valor a ser somado");
                int a = sc.nextInt();
                System.out.println("Digite o segundo valor a ser somado");
                int b = sc.nextInt();
                int result = Sum.sum(a, b);
                System.out.println("O resultado é: " + result);
            }

            case 2 -> {
                System.out.println("Digite o primeiro valor a ser subtraido");
                int a = sc.nextInt();
                System.out.println("Digite o segundo valor a ser subtraido");
                int b = sc.nextInt();
                int result = Subtraction.subtraction(a, b);
                System.out.println("O resultado é: " + result);
            }

            case 3 -> {
                System.out.println("Digite o primeiro valor a ser dividido");
                int a = sc.nextInt();
                System.out.println("Digite o segundo valor a ser dividido");
                int b = sc.nextInt();
                int result = Division.divison(a, b);
                System.out.println("O resultado é: " + result);
            }

            case 4 -> {
                System.out.println("Digite o primeiro valor a ser multiplicado");
                int a = sc.nextInt();
                System.out.println("Digite o segundo valor a ser multiplicado");
                int b = sc.nextInt();
                int result = Multiplication.multiplication(a, b);
                System.out.println("O resultado é: " + result);
            }

            default -> {
                System.out.println("Opção inválida");
            }
        }

    }
}