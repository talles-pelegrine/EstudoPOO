package herancaPolimorfismo;

public class Animal {
    private double peso;
    private double altura;

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public String emitirSom(String som){
        som = "Som de um animal: " + som;
        return som;
    }
    public String emitirSom(String som, double altura, double peso){
        som = "Som de um animal: " + som + ", Altura: " + altura + ", Peso: "+peso;
        return som;
    }
}
