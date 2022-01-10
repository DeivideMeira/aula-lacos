package breecrowd.problems;

import java.util.Scanner;

public class p1175 {

	//Troca em Vetor I
	//https://www.urionlinejudge.com.br/judge/pt/problems/view/1175
	
	public static void main(String[] args) {

		int [] N = new int [20]; 
		int i, aux;

		Scanner entrada = new Scanner (System.in);
		
		for (i = 0; i < N.length; i++)
		{
			N[i] = entrada.nextInt(); 

		}
		
		for (i = 0; i < N.length/2; i++)
		{
			aux = N[i];
			N[i] = N[(N.length-1)-i];
			N[(N.length-1)-i] = aux;

		}
		
		for (i=0; i < N.length; i++)
		{
			System.out.println("N["+i+"]= " + N[i]);
		}
	}
}
