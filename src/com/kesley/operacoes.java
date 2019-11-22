package com.kesley;

public class operacoes {
    private char operador;

    public int operacao(char operador, int valorA, int valorB){
        int total = 0;
        if(operador == '+'){
            total = valorA+valorB;
        }
        else if(operador == '-'){
            total = valorA-valorB;
        }
        else if(operador == '/'){
            total = valorA/valorB;
        }
        else if (operador == '*'){
            total = valorA*valorB;
        }
        return total;
    }
}
