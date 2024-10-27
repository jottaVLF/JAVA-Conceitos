package com.mycompany.ex8;

public class ComparaNumero {
    
    public ComparaNumero() {
        System.out.println("Construtor padrao");
    }
    
    public void verifica(int num1, int num2) {
        if (num1 == num2) {
            System.out.println("Os numeros sao iguais: " + num1);
        } else {
            System.out.println("Os numeros sao diferentes");
            if (num1 > num2) {
                System.out.println("Maior: " + num1 + " Menor: " + num2);
            } else {
                System.out.println("Maior: " + num2 + " Menor: " + num1);                
            }
        }
    }
}
