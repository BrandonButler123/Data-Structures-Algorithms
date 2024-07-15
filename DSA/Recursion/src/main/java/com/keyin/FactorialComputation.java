package com.keyin;

public class FactorialComputation {
    public static void main(String[] args) {
        FactorialComputation factorialComputation = new FactorialComputation();
        int result = factorialComputation.factorial(5);
        System.out.println(result);
    }

    public int factorial(int n){

        //Second step
        if (n < 1) {
            return 1;
        }

        //third step
        if (n == 1) {
            return 1;
        }

        //First step
        return n * factorial(n-1);
    }
}
