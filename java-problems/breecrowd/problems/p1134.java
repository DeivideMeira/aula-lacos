package breecrowd.problems;

import java.util.Scanner;

import javax.swing.JOptionPane;

// Tipo_de_Combustível
// https://www.urionlinejudge.com.br/judge/pt/problems/view/1134


public class p1134 {

	public static void main(String[] args) {
		

		//Scanner entrada = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int tecla = 0;
		
		while (tecla != 4){
			//tecla = entrada.nextInt();
			tecla = Integer.parseInt(JOptionPane.showInputDialog("Qual foi o teu tipo de combustível?"));


					while (tecla>4 && tecla<9)
					{
						//tecla = entrada.nextInt();
						tecla = Integer.parseInt(JOptionPane.showInputDialog("Qual foi o teu tipo de combustível?"));
					}
					if (tecla == 1)
					{
						alcool++;
					}
					if (tecla == 2)
					{
						gasolina++;
					}
					if (tecla == 3)
					{
						diesel++;
					}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " +alcool);
		System.out.println("Gasolina: " +gasolina);
		System.out.println("Diesel: " +diesel);
		JOptionPane.showMessageDialog(null, "MUITO OBRIGADO"+"\n"+"Álcool: "+alcool+ 
																"\n"+ "Gasolina: " +gasolina+ 
																	"\n" +"Diesel: "+diesel);

	}

}
