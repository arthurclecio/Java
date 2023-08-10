package ConversorIdade;

import java.util.Scanner;

public class ConversorIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a idade da pessoa em dias: ");
        int idadeDias = scanner.nextInt();
        
        Idade idadePessoa = new Idade(idadeDias);
        
        System.out.println("Idade: " + idadePessoa.getAnos() + " anos, " +
                           idadePessoa.getMeses() + " meses e " + idadePessoa.getDias() + " dias");
        
        scanner.close();
    }
}

class Idade {
    private int anos;
    private int meses;
    private int dias;
    
    public Idade(int totalDias) {
        this.anos = totalDias / 365;
        totalDias %= 365;
        
        this.meses = totalDias / 30;
        this.dias = totalDias % 30;
    }
    
    public int getAnos() {
        return anos;
    }
    
    public int getMeses() {
        return meses;
    }
    
    public int getDias() {
        return dias;
    }
}
