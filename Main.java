import java.util.Scanner;

class Calculator {

    public double addition(double x, double y) {
        return x + y;
    }

    public double subtraction(double x, double y) {
        return x - y;
    }

    public double multiplication(double x, double y) {
        return x * y;
    }

    public double division(double x, double y) {
        return x / y;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        System.out.println("Escolha um número referente a operação matemática desejada: ");
        int choice = sc.nextInt();

        Calculator calc = new Calculator();

        System.out.println("Digite o valor de x: ");
        double num1 = sc.nextDouble();
        System.out.println("Digite o valor de y: ");
        double num2 = sc.nextDouble();

        sc.close();
        
        switch (choice) {
            case 1 -> {
                System.out.println("O resultado da soma é: " + calc.addition(num1, num2));
            }
            case 2 -> {
                System.out.println("O resultado da subtração é: " + calc.subtraction(num1, num2));
            }
            case 3 -> {
                System.out.println("O resultado da multiplicação é: " + calc.multiplication(num1, num2));
            }
            case 4 -> {
                if (num2 == 0){
                    System.out.println("Não dá para dividir por zero!");
                } else {
                    System.out.println("O resultado da divisão é: " + calc.division(num1, num2));
                }
            }

            default -> System.out.println("Opção inválida! Escolha entre 1 e 4.");
        }
    }
}
