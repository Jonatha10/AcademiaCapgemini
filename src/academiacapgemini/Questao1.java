package academiacapgemini;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;



/**
 *
 * @author jonatha
 * 
 */
public class Questao1 {

    public static int mediana(int[] elements) {

		List<Integer> listaNumeros = new ArrayList<>();

		for(int elemento : elements){
			listaNumeros.add(elemento);
		}

		Collections.sort(listaNumeros);

		int mediana;
		mediana = listaNumeros.get(listaNumeros.size() / 2);
		return mediana;
	}

	public static void main(String[] args) {
		int[] numero = {9, 2, 1, 4, 6};

		System.out.println(mediana(numero));

	}
    }
    

