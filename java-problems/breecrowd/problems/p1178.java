package breecrowd.problems;

import java.util.Scanner;

public class p1178 {
	
	
	//Preenchimento de Vetor III
	//https://www.urionlinejudge.com.br/judge/pt/problems/view/1178
	
	public static void main(String[] args) {
		
		
		int [] N = new int [10]; 
		double x=0;

		Scanner entrada = new Scanner (System.in);
		
		//N[0] = entrada.nextInt(); 
		x = entrada.nextInt(); 

		/*for (int i = 0; i <N.length; i++)
		{
			N[i] = N[i-1]/2;
		}*/
		
		for (int i = 0; i <N.length; i++)
		{
			//System.out.println(String.format("N["+i+"]= %.4f", N[i]));
			
			System.out.println(String.format("N["+i+"]= %.4f",x));
			x = x/2;
		}

	}

}
