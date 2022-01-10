package breecrowd.problems;

import java.util.Scanner;

public class p1174 {
	
	//Seleção em Vetor I
	//https://www.urionlinejudge.com.br/judge/pt/problems/view/1174

	public static void main(String[] args) {

		float [] A = new float [6]; 
		Scanner entrada = new Scanner (System.in);
			
		for (int i=0; i < A.length; i++)
		{
			A[i] = entrada.nextInt(); 
		}
		
		for (int i=0; i< A.length; i++)
		{
			if (A[i] <= 10)
			{
				System.out.println("A["+i+"]= " + A[i]);
			}
		}
	}
}
