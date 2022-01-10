package breecrowd.problems;

import java.util.Scanner;

public class p1180 {
	
	//Menor e Posição
	//https://www.urionlinejudge.com.br/judge/pt/problems/view/1180

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int N = 0;
		int posicao = 0;
		int menor = 0;

		while(!(N>1 && N<1000))
		{
			System.out.println("Digite um valor entre 1 e 1000!");
			N = entrada.nextInt(); 
		}
		
		int [] X = new int [N]; 

		for (int i = 0; i < X.length; i++)
		{
			X[i] = entrada.nextInt();
			menor = X[0];

		}
		
		for (int i = 0; i < X.length; i++)
		{
			if (X[i] < menor)
			{
				menor = X[i];
				posicao = i;
			}
		}
		System.out.println("Menor valor: " +menor+ "\n" + "Posicao: " +posicao);
	}

}
