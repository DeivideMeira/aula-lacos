package breecrowd.problems;

import java.util.Scanner;

import javax.swing.JOptionPane;


// Sequência_de_Números_e_Soma
//https://www.urionlinejudge.com.br/judge/pt/problems/view/1101

public class p1101 {

	public static void main(String[] args) {

		
		//Scanner entrada = new Scanner(System.in);
		
		int M, N, z;
		int i;
		int Sum=0;
		int menor = 0;
		String valores="";
		
		//System.out.println("Digite os valores para M e N:");
		
		//M = entrada.nextInt();
		M = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de M"));
		//N = entrada.nextInt();
		N = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N"));

		
		while(M>0 && N>0)
		{
			if(M>N)
			{
				menor = N;
				N = M;
				M = menor;
			}
			
				for (i = M; i<=N; i++)
				{

						valores = valores + i + " ";
						Sum = Sum + i;
					
				}
				System.out.println(valores+ "\n" + "Sum=" +Sum);		
				M = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de M"));
				//N = entrada.nextInt();
				N = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N"));
				Sum = 0;
		   } 

		}	
	}
