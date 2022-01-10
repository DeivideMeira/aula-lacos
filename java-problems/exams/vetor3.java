package exams;

import java.util.Arrays;
import java.util.Scanner;

public class vetor3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//Digitar o maior e menor antes de ordem e sua posição
		//Ordenar em ordem crescente dentro do vetor
		
		
		Scanner entrada = new Scanner (System.in);

		int maior=0;
		int menor= 0;
		int i;
		int posicaomenor = 0;
		int posicaomaior = 0;

		
		int x[] = new int[5];
		
		for (i=0; i < x.length; i++)
		{
			x[i] = entrada.nextInt(); //alimenta o vetor
			menor = x[0];
			maior = x[0];
		}
		
		for(i=0; i<x.length; i++)
		{
			if (x[i] < menor)
			{
				menor = x[i];
				posicaomenor = i;
			}
		}
		for(i=0; i<x.length; i++)
		{
			if (x[i] > maior)
			{
				maior = x[i];
				posicaomaior = i;
			}
		}	
		System.out.println("menor = "+menor+" na posição x["+posicaomenor+"]");	
		System.out.println("maior = "+maior+" na posição x["+posicaomaior+"]");

		
		Arrays.sort(x);
		for (i=0; i < x.length; i++)
		{
			System.out.println("x["+i+"]= " +x[i]);
		}
	}
}

