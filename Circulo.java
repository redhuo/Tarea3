/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jimmy
 */
public class Circu
no
    private double radio;
    private String color = "vacío";
    public static int cantidadCirculos =0;
    public final double PI = 3.14;

    public Circulo (double pRadio) {
        setRadio(pRadio);
        cantidadCirculos += 1;
    }

    public Circulo (double pRadio, String pColor) {
        setRadio(pRadio);
        setColor(pColor);
        cantidadCirculos += 1;
    }

    public void setRadio (double pRadio) {
        radio = pRadio;
    }

    public double getRadio () {
        return radio;
    }

    public void setColor (String pColor) {
        color = pColor;
    }

    public String setColor () {
        return color;
    }

    // Implementar setColor(…) y setColor()

    public double calcularArea () {
        return PI * (radio * radio);
    }
    
}

