package com.mycompany.ex8;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ComparaNumero numero = new ComparaNumero();
        
        int num1;
        int num2;
        
        System.out.println("Informe o primeiro numero");
        num1 = sc.nextInt();  
        System.out.println("Informe o segundo numero");
        num2 = sc.nextInt();    
        
        numero.verifica(num1, num2);
    }
}
