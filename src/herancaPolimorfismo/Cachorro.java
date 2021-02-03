package herancaPolimorfismo;

public class Cachorro extends Mamifero{
    public Cachorro(double peso, double altura, int idade, String som){
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
        som = "Som de um cachorro: " + som;
        return som;
    }
}
