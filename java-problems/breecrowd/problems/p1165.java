package breecrowd.problems;

import java.util.Scanner;

import javax.swing.JOptionPane;

//  Número_Primo
//  https://www.urionlinejudge.com.br/judge/pt/problems/view/1165

public class p1165 {

	public static void main(String[] args) {
		


		//Scanner entrada = new Scanner(System.in);

		int N, X;
		//System.out.print("Digite um número entre 1 e 100: ");
		//N = entrada.nextInt();
		
		N = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor entre 1 e 100, para seus testes:"));


		if(1<=N && N<=1000)
		{
			for (int i=1; i<=N; i++)
			{
				//X = entrada.nextInt();
				X = Integer.parseInt(JOptionPane.showInputDialog(""));


						if (X>1 && X<= Math.pow(10, 7))
						{
						
							if (X % 2 != 0)
							{
								
								System.out.println(X + " eh primo ");
								JOptionPane.showMessageDialog(null, X + " eh primo ");

							}
						    else
							{
								if(X == 2)
								{
								System.out.println(X + " eh primo ");
								JOptionPane.showMessageDialog(null, X + " eh primo ");

								}
								
								else
								{
							System.out.println(X + " nao eh primo");
							JOptionPane.showMessageDialog(null, X + " nao eh primo ");

								}
							}
								
						}
			}
		}
	}

}
