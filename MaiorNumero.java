package com.mycompany.ex7;

public class MaiorNumero {
    
    public MaiorNumero() {
        System.out.println("Construtor padrao");
    }
    
    public void verifica(int num1, int num2) {
       
        int maiorNumero;      
        
        if(num1 > num2) {
            maiorNumero = num1;
        } else {
            maiorNumero = num2;
        }
        System.out.println("O maior numero e: " + maiorNumero);
    }
}
