package breecrowd.problems;

import java.util.Scanner;

public class p1173 {
	
	//Preenchimento de Vetor I

	//https://www.urionlinejudge.com.br/judge/pt/problems/view/1173 

	public static void main(String[] args) {

		int[] N = new int [10]; 
		int x = 0;
		Scanner entrada = new Scanner (System.in);
		
		while(!(x<= 50 && x>0))
		{
			x = entrada.nextInt();
		}

		for(int i = 0; i<N.length; i++)
		{
			System.out.println("N["+i+"]= " + x);
			x = x * 2;
		}
	}
}
