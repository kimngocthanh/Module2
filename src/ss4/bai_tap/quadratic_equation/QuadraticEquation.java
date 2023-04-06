package ss4.bai_tap.quadratic_equation;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDenta() {
        return getB() * getB() - 4 * getA() * getC();
    }

    public double getRoot() {
        return -getB() / 2 * getA();
    }

    public double getRoot1() {
        return (-getB() + Math.sqrt(getDenta())) / (2 * getA());
    }

    public double getRoot2() {
        return (-getB() - Math.sqrt(getDenta())) / (2 * getA());
    }


}
