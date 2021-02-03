package abstracaoEncapsulamento;
public class Quadrado {
    private double Lado;
    public Quadrado(double lado) {
        this.Lado = lado;
    }
    public Quadrado() {
        this(0);
    }
    public double getLado() {
        return this.Lado;
    }
    public void setLado(double lado) {
        this.Lado = lado;
    }
    public double getArea() {
        return (this.Lado * this.Lado);
    }
    public double getPerimetro() {
        return (4 * this.Lado);
    }
}
