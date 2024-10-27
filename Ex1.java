package Ex1;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //CLASSE QUE VIABLIZA A LEITURA DE ENTRADAS

        int ano;
        int mes;
        int dia;
        int idadeDias;
        
        System.out.println("Forneca sua idade em ano: ");
        ano = sc.nextInt();
        
        System.out.println("Forneca sua idade em meses: ");
        mes = sc.nextInt();
        
        System.out.println("Forneca sua idade em dias: ");
        dia = sc.nextInt();
        
        idadeDias = ano*365 + mes*30 + dia;
        
        System.out.println(ano + " anos, " + mes + " meses, " + dia + " dias = " + idadeDias + " dias");
    }
}
