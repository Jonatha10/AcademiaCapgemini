/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academiacapgemini;

/**
 *
 * @author jonatha
 */
public class Questao2 {
    
    public static int pares(int[] vetor, int numero) {
		
		int count = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			for(int j = 0; j < i; j++) {
				
				if((Math.abs(vetor[i] - vetor[j]) == numero) && i != j) {
					count++;
				}
			}
		}
		return count;
                
	} 
        
        public static void main(String[] args) {

		int[] n = {1,5,3,4,2};
		int x = 2;
		
		System.out.println(pares(n, x));
	}
}	
    

