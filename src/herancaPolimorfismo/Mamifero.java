package herancaPolimorfismo;

public class Mamifero extends Animal{
    public int idade;
    public String som;
    public Mamifero(int idade, String som){
        this.idade = idade;
        this.som = som;
    }
    public String emitirSom(String som){
        som = "Som de um mamifero: " + som;
        return som;
    }
    public String emitirSom(String som, int idade){
        som = "Som de um mamifero: " + som + ", Idade: " + idade;
        return som;
    }
}
