package com.mycompany.ex9;

import java.util.Scanner;

public class Controle {
    
    private int volume;
    private int canais;
    private boolean ligar;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public int getCanais() {
        return canais;
    }

    public void setCanais(int canais) {
        this.canais = canais;
    }

    public boolean isLigar() {
        return ligar;
    }

    public void setLigar(boolean ligar) {
        this.ligar = ligar;
    }
    
    public Controle() {
        System.out.println("Construtor padrao");
    }
    
    public Controle(int volume, int canais, boolean ligar) {
        this.volume = volume;
        this.canais = canais;
        this.ligar = ligar;
    }
    
    public void alterarVolume() {
        Scanner sc = new Scanner(System.in); //CLASSE QUE VIABLIZA A LEITURA DE ENTRADAS
        
        if (this.isLigar() == false) {
            System.out.println("Nao e possivel aumentar o volume, a TV esta desligada");
            return;
        }
        
        String entrada;
        System.out.println("-------------------------------------------------");
        System.out.println("Presseione + para aumentar o volume");
        System.out.println("Presseione - para diminuir o volume");

        entrada = sc.nextLine();
        
        if (entrada.equals("+") && getVolume() < 11) {
            volume++;
            System.out.println(volume);
        } else if (entrada.equals("+") && getVolume() > 10) {
            System.out.println("Volume ja esta no maximo");
        } else if (entrada.equals("-") && getVolume() > 0) {
            volume--;
            System.out.println(volume);
        } else {
            System.out.println("Volume ja esta no minimo");
        }
    }
    
    public void alterarCanais() {
        Scanner sc = new Scanner(System.in); //CLASSE QUE VIABLIZA A LEITURA DE ENTRADAS

        if (this.isLigar() == false) {
            System.out.println("Nao e possivel mudar o canal, a TV esta desligada");
            return;
        }
        
        String entrada;
        System.out.println("-------------------------------------------------");
        System.out.println("Presseione > para avancar um canal");
        System.out.println("Presseione < para voltar um canal");

        entrada = sc.nextLine();
        
        if (entrada.equals(">") && canais < 11) {
            canais++;
            System.out.println("Canal: " + canais);
        } else if (entrada.equals(">") && canais > 10) {
            this.canais = 1;
            System.out.println("Canal: " + canais);
        } else if (entrada.equals("<") && canais > 0) {
            canais--;
            System.out.println("Canal: " + canais);
        } else {
            this.canais = 10;
            System.out.println("Canal: " + canais);
        }
    }
}