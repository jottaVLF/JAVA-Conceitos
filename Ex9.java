package com.mycompany.ex9;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //CLASSE QUE VIABLIZA A LEITURA DE ENTRADAS

        Controle control = new Controle();
        
        //CONFIGURAÇÃO PADRÃO DO CONTROLE
        control.setCanais(5);
        control.setVolume(5);
        control.setLigar(false);
        
        while(true) {
            System.out.println("1 - Para ligar/desligar");
            System.out.println("2 - Para configuracoes de volume");
            System.out.println("3 - Para configuracoes de canais");
            
            int escolha;
            escolha = sc.nextInt();

            if (escolha == 1) {
                if (control.isLigar()) {
                    control.setLigar(false);
                    System.out.println("TV desligada");
                } else {
                    control.setLigar(true);
                    System.out.println("TV ligada");
                }
            } else if (escolha == 2) {
                control.alterarVolume();
            } else if (escolha == 3) {
                control.alterarCanais();
            } else {
                System.out.println("Acabou a pilha do controle");
                break;
            }
        }
    }
}