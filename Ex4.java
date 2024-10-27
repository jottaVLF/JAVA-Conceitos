package ex4;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String nome;
        
        System.out.println("Digite o seu nome: ");
        nome = sc.nextLine();
        
        String[] palavras = nome.split(" ");
        
        System.out.print("Abreviatura: ");
        
        for (String palavra : palavras) {
            if (palavra.length() > 2) {
                System.out.print(palavra.charAt(0) + ". ");
            } else {
                System.out.print(palavra + ". ");
            }
        }  
    }
}
