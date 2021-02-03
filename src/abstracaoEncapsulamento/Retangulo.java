package abstracaoEncapsulamento;
public class Retangulo {
    private double Base;
    private double Altura;
    public Retangulo(double base, double altura) {
        this.Base = base;
        this.Altura = altura;
    }
    public double getBase() {
        return Base;
    }
    public void setBase(double base) {
        this.Base = base;
    }
    public double getAltura() {
        return Altura;
    }
    public void setAltura(double altura) {
        this.Altura = altura;
    }
    public double getArea() {
        return this.Base * this.Altura;
    }
    public double getPerimetro() {
        return (2 * (this.Base + this.Altura));
    }
}
