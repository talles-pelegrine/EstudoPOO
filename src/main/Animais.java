package main;

import herancaPolimorfismo.Animal;
import herancaPolimorfismo.Cachorro;
import herancaPolimorfismo.Humano;
import herancaPolimorfismo.Mamifero;

import java.util.Scanner;

public class Animais{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double peso = input.nextDouble();
        double altura = input.nextDouble();
        int idade = input.nextInt();
        input.nextLine();
        String som = input.nextLine();

        input.close();

        Humano humano = new Humano(peso,altura,idade,som);
        Cachorro cachorro = new Cachorro(peso,altura,idade,som);
        Mamifero mamifero = new Mamifero(idade,som);
        Animal animal = new Animal();

        humano.mostraAnimal();
        System.out.println(humano.emitirSom(som));
        cachorro.mostraAnimal();
        System.out.println(cachorro.emitirSom(som));
        System.out.println(mamifero.emitirSom(som));
        System.out.println(mamifero.emitirSom(som,idade));
        System.out.println(animal.emitirSom(som));
        System.out.println(animal.emitirSom(som,altura,peso));

        System.out.println(cachorro.emitirSom(som,altura,peso));
    }
}
