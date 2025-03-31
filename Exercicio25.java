package com.mycompany.exercicio25;
import javax.swing.JOptionPane;

public class Exercicio25 {

    public static void main(String[] args) {
        int numeros[] = new int[20];
        int soma = 0;
        for(int i = 0;i<20;i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o" + (i+1) + "º numero"));
            soma += numeros[i];
        }
        double media = soma/20;
        JOptionPane.showMessageDialog(null,"A soma de todos os numeros e: " + soma);
        JOptionPane.showMessageDialog(null,"A media de todos os numeros e: " + media);
    }
}
//editado =)
