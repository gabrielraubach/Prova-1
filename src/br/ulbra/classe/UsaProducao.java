
package br.ulbra.classe;

import java.util.Scanner;

public class UsaProducao 
{
    public static void main(String[] args) 
    {
        Producao prod = new Producao();
        Scanner ler = new Scanner(System.in);
        
        prod.calcularHMS();
        
        System.out.println(prod.toString());
        
        System.out.println("Digite a peça desejada:");
                
        prod.setPeca(ler.nextLine());
        
        System.out.println("digite o valor em segundos!");
        
        prod.setSegundos(ler.nextInt());
        
        prod.calcularHMS();
        
        System.out.println(prod.toString());
    }
    
         
}
