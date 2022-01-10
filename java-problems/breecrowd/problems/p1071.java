package breecrowd.problems;

import javax.swing.JOptionPane;

// Soma_de_Impares_Consecutivos_I
// https://www.urionlinejudge.com.br/judge/pt/problems/view/1071

public class p1071 {
	
	public static void main(String[] args) {

		int x, y;
		int soma=0;
		
		//System.out.println("Digite os valores de x e y.");
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de x"));
		//x = entrada.nextInt();
		y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de y"));
		//y = entrada.nextInt();
		
		if(x > y)
		{
			for (int i = x-1; i>y; i--)
			{
				if (i % 2 != 0)
				{
					soma += i;
				}
			}
		}
		else
		{
			for (int i = x; i<y; i++)
			{
				if (i%2!=0)
				{
					soma += i;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "As somas dos ímpares entre os valores digitados é: " +soma);
		System.out.println("As somas dos ímpares entre os valores digitados é: " +soma);
	}

}
