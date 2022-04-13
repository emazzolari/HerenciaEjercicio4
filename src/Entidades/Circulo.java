
package Entidades;

import Interfaz.CalculoForma;
import java.util.Scanner;

public class Circulo <T> implements CalculoForma{//extends Formas{
Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    

    @Override
    public void perimetro() {
   
        System.out.println("Ingrese el radio");
        setRadio(leer.nextDouble());
        double perimetro= pi*(getRadio()*2);
        System.out.println("El perimetro es "+perimetro);
    
    }

    @Override
    public void area() {
    double area=pi*(getRadio()*getRadio()); 
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
