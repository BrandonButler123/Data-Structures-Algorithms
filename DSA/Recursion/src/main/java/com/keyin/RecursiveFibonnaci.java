package com.keyin;

public class RecursiveFibonnaci {
    public static void main(String[] args) {

        RecursiveFibonnaci recursiveFibonnaci = new RecursiveFibonnaci();
        int result = recursiveFibonnaci.fibonnaci(5);
        System.out.println(result);
    }

    public int fibonnaci (int n){

        if (n < 1){
            return 1;
        }

        if (n == 1 || n == 0){
            return n;
        }

        return fibonnaci(n-1) + fibonnaci(n-2);
    }
}

//0,1,1,2,3,5,8,13,21,34,55

