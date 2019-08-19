/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto07scamer;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Projeto07Scamer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //classe SCANNER deve ser importada de dentro do pacote java.util.Scanner
        //Definir um objeto 'entrada' da classe Scanner
        //usando a palavra reservada NEW
        //que é responsavel pela instaciacao de objetos
        //de uma classe JAVA
        
        String nome = "Rodler";
        Scanner entrada = new Scanner(System.in);
        
        
        /* criar um programa que receba Entrada de 2 valores e verifique qual
        o maior e o menor numero entre os dois*/
        
        int num1, num2;
        System.out.println("Digite o 1º Número: ");
        num1 = entrada.nextInt();
        System.out.println("Digite o 2º Número: ");
        num2 = entrada.nextInt();
        
        //valor atribuidos a num1 e num2
        System.out.println("Valor NUM1: " + num1);
        System.out.println("Valor NUM2: " + num2);
     
        if(num1 > num2){
            System.out.println("N1 Maior = " + num1);
            System.out.println("N2 Menor = " + num2);
        }else if (num2 > num1){
            System.out.println("N2 Maior = " + num2);
            System.out.println("N1 Menor = " + num1);
        }else{
            System.out.println("São iguais");
        }
    }
}
