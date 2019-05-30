package com.company;

public final class ComplexNumberApp {

    private final double re;
    private final double im;

    public static void main(String[] args) {
        ComplexNumberApp firstNumber = new ComplexNumberApp(1, 1);
        ComplexNumberApp secondNumber = new ComplexNumberApp(1, 1);
        System.out.print("firstNumber.equals(secondNumber) is ");
        System.out.println(firstNumber.equals(secondNumber));
        System.out.print("firstNumber.hashCode() ==  secondNumber.hashCode() is ");
        System.out.println(firstNumber.hashCode(firstNumber.getRe(), firstNumber.getIm()) == secondNumber.hashCode(secondNumber.getRe(),secondNumber.getIm()));
    }

    public boolean equals(ComplexNumber complexNumber) {
        return (this.getIm() == complexNumber.getIm()) && (this.getRe() == complexNumber.getRe());
    }

    public double hashCode(double re, double im) {
        double  result = 17;
        long longBitsRe = Double.doubleToLongBits(re);
        long longBitsIm = Double.doubleToLongBits(im);
        double resultRe = 37 * result + (int)(longBitsRe - (longBitsRe >>> 32));
        double resultIm = 37 * result + (int)(longBitsIm - (longBitsIm >>> 32));
        result = resultIm + resultRe;
        return result;
    }

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }
}
