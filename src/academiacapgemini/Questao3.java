/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academiacapgemini;

import java.util.Scanner;

/**
 *
 * @author jonatha
 */
public class Questao3 {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String messagem = "";
        
        String string = "Sua mensagem criptografada: \n";
        
         System.out.println("Informe a mensagem a ser criptografada: ");
        messagem =sc.nextLine();
        
        messagem = messagem.replaceAll("\\s+","");
        
        double calc = Math.sqrt(messagem.length());
        
        calc = Math.ceil(calc);
        System.out.println(calc);
        System.out.println(messagem.length());
           
        for(int i = 0; i < calc; i++){
            
            for(int j = i; j < messagem.length(); j+=calc){
                System.out.print(messagem.charAt(j));
                string += messagem.charAt(j);
            }
            System.out.println("\n");
            
            string += " ";
        }
        
         System.out.println(string);
    }
}

