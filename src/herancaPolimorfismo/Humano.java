package herancaPolimorfismo;

public class Humano extends Mamifero{

    public Humano(double peso, double altura, int idade, String som){
        super(idade,som);
        setPeso(peso);
        setAltura(altura);
    }
    public void mostraAnimal(){
        System.out.println(getPeso());
        System.out.println(getAltura());
        System.out.println(idade);
    }
    public String emitirSom(String som){
        som = "Som de um humano: " + som;
        return som;
    }
}
