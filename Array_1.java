/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array_1;

import javax.swing.JOptionPane;

public class Array_1 {

    public static void main(String[] args) {
        int[] numero = new int[5];
        int menor, maior;
        
        do{

            for (int i=0; i < numero.length; i++){
                numero[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com o " + (i+1) +"º número: "));
            }

            menor = numero[0];
            maior = numero[0];

            for (int i=0; i < numero.length; i++){
                if(numero[i] < menor)
                    menor = numero[i];
                if (numero[i] > maior)
                    maior = numero[i];
            }

            System.out.println("O menor valor é: " + menor);
            System.out.println("O maior valor é: " + maior);

            int saida = JOptionPane.showConfirmDialog(null ,"Deseja fechar a aplicação?",
                 "Saída",JOptionPane.YES_NO_OPTION);
            if (saida == JOptionPane.YES_OPTION ) {
                    System.exit(0);
            }
        }while(true);
    }
    
}
