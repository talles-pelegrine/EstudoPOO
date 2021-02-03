package main;
import abstracaoEncapsulamento.*;
import java.util.Scanner;

public class Figuras {

    public static void main(String[] args) {
        Scanner input;
        int opcao;
        System.out.println("Escolha uma opção:");
        System.out.println("1) Calcular a área e perimetro de um Circulo");
        System.out.println("2) Calcular a área e perimetro de um Quadrado");
        System.out.println("3) Calcular a área e perimetro de um Retangulo");
        System.out.println("*) Sair");
        input = new Scanner(System.in);
        opcao = input.nextInt();
        switch (opcao) {
            case 1:
                Circulo circulo = new Circulo();
                System.out.print("Valor para o Raio:");
                float raio = input.nextFloat();
                circulo.setRaio(raio);
                System.out.println("A área do Circulo é: " + circulo.getArea());
                System.out.println("O Perimetro  do Circulo é: " + circulo.getPerimetro());
                break;
            case 2:
                Quadrado Quadrado = new Quadrado();
                System.out.print("Valor para lado: ");
                Quadrado.setLado(input.nextDouble());
                System.out.println("A área  Quadrado é: " + Quadrado.getArea());
                System.out.println("O Perimetro do Quadrado é: " + Quadrado.getPerimetro());
                break;
            case 3:
                System.out.print("Valor para Base: ");
                double base = input.nextDouble();
                System.out.print("Valor para Altura: ");
                double altura = input.nextDouble();
                Retangulo Retangulo = new Retangulo(base, altura);
                System.out.println("A área do Retangulo é: " + Retangulo.getArea());
                System.out.println("O Perimetro do Retangulo é: " + Retangulo.getPerimetro());
                break;
            default:
                System.out.println("Programa encerrado!!!");
        }
    }
}
