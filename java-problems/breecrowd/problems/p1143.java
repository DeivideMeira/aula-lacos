package breecrowd.problems;

import java.util.Scanner;

import javax.swing.JOptionPane;

// Quadrado_e_ao_Cubo
// https://www.urionlinejudge.com.br/judge/pt/problems/view/1143 

public class p1143 {

	public static void main(String[] args) {
		

		
		Scanner entrada = new Scanner(System.in);
		
		int N;
		String linha1 = " ", linha2 = " ", linha3 = " ";
		
		//System.out.println("Digite os valores para N");
		
		//N = entrada.nextInt();
		N = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N"));



		if(1<N && N<1000)
		{
			for (int i=1; i<=N; i++)
			{
			linha1 = linha1 + i + " ";
			
			linha2 = linha2 + Math.pow(i, 2) + " ";
			
			linha3 = linha3 + Math.pow(i, 3) + " ";
			}

		}
		System.out.println(linha1 + " ");
		System.out.println(linha2 + " ");
		System.out.println(linha3 + " ");
		
		JOptionPane.showMessageDialog(null,linha1+ "\n" + linha2+ "\n" + linha3+ " ");


	}

}
