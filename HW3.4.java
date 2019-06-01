package com.company;

public final class ComplexNumber {

    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public static void main(String[] args) {
        ComplexNumber firstNumber = new ComplexNumber(22, 22);
        ComplexNumber secondNumber = new ComplexNumber(22, 22);
        System.out.print("firstNumber.equals(secondNumber) is ");
        System.out.println(firstNumber.equals(secondNumber));
        System.out.print("firstNumber.hashCode() ==  secondNumber.hashCode() is ");
        System.out.println(firstNumber.hashCode() == secondNumber.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        ComplexNumber firstNumber = (ComplexNumber) obj;
        return (getRe() == firstNumber.getRe() && getIm() == firstNumber.getIm());
    }

    public int hashCode() {
        int result = 1;
        final int constant = 31;
        result = (int) (constant * result + getIm() * constant + getRe() * constant);
        return result;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }
}

