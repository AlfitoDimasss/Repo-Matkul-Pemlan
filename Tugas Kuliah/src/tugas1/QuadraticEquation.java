/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author Illuminare
 */
public class QuadraticEquation {

    private double a;
    private double b;
    private double c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getValueA() {
        return a;
    }

    public double getValueB() {
        return b;
    }

    public double getValueC() {
        return c;
    }

    public double getDiscriminant() {
        return (Math.pow(this.b, 2) - 4 * a * c);
    }

    public double getRoot1() {
        if (getDiscriminant() >= 0) {
            return (-this.b + Math.sqrt(getDiscriminant()));
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if (getDiscriminant() >= 0) {
            return (-this.b - Math.sqrt(getDiscriminant()));
        } else {
            return 0;
        }
    }

}
