
package Entidades;

import Interfaz.CalculoForma;

public class Formas<T> implements CalculoForma{
    
    protected double base;
    protected double altura;
    protected double radio;

    public Formas() {
    }

    public Formas(double base, double altura, double radio) {
        this.base = base;
        this.altura = altura;
        this.radio = radio;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void perimetro(double perimetro) {
    
    }

    @Override
    public void area(double area) {
    
    }
    
    
    
}
