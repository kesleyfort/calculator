package com.kesley;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
	    int valorA = s.nextInt();
		char[] operador = s.next().toCharArray();
	    int valorB = s.nextInt();
	    operacoes o = new operacoes();
	    System.out.println(o.operacao(operador[0], valorA, valorB));
    }
}
