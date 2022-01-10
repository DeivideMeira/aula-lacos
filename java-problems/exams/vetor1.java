package exams;
import java.util.Scanner;

public class vetor1 {

	public static void main(String[] args) {
		
		int[] x = new int [4]; /*vetor x com 4 posições
		0 1 2 3*/
		
		Scanner entrada = new Scanner (System.in);
		
		for(int i=0; i < x.length; i++)
		{
			x[i] = entrada.nextInt(); //alimenta o vetor
		}
		
		for(int i=0; i<x.length; i++)
		{
			System.out.println("x["+i+"]= " + x[i]); //mostra o valores do vetor
		}
		System.out.print("Olá");
	}

}
