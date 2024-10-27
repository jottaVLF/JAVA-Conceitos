package ex2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //CLASSE QUE VIABLIZA A LEITURA DE ENTRADAS
        
        float num1;
        float num2;
        float num3;
        
        System.out.println("Digite o numero 1: ");
        num1 = sc.nextInt();
        
        System.out.println("Digite o numero 2: ");
        num2 = sc.nextInt();
        
        System.out.println("Digite o numero 3: ");       
        num3 = sc.nextInt();
        
        float media = (num1 + num2 + num3) / 3;
        float med1 = num1 / media;
        float med2 = num2 / media;
        float med3 = num3 / media;
        
        System.out.println("Media aritmetica: " + media);
        System.out.println("Media 1: " + med1);
        System.out.println("Media 2: " + med2);
        System.out.println("Media 3: " + med3);
    }
    
}
