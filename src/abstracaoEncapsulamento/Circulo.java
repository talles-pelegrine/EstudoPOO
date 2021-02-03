package abstracaoEncapsulamento;
public class Circulo {
    private float raio;
    public Circulo() {
        this.raio = 0;
    }
    public Circulo (float raio) {
        this.raio = raio;
    }
    public float getRaio() {
        return raio;
    }
    public void setRaio(float raio) {
        this.raio = raio;
    }
    public double getArea() {
        return (Math.PI * Math.pow(this.raio, 2));
    }
    public double getPerimetro() {
        return (2 * Math.PI * this.raio);
    }
}
