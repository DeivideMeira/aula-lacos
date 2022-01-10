package exams;
import java.util.Scanner;
import javax.swing.JOptionPane;

		public class which_triangle {

			public static void main(String[] args) {
				float A, B, C;
				float seg;
				String angulo = "", formato = "";
				
				Scanner entrada = new Scanner(System.in);
				
				System.out.println("Digite os valores dos lados A, B e C");
				
				A = entrada.nextFloat();
				B = entrada.nextFloat();
				C = entrada.nextFloat();

				if(B > A)
				{
					seg = A;
					A = B;
					B = seg;
				}
				if(C > A)
				{
					seg = A;
					A = C;
					C = seg;
				}
				if(C > B)
				{
					seg = B;
					B = C;
					C = seg;
				}
				
				if (A >= B+C)
				{
					System.out.println("NAO FORMA TRIANGULO");
					JOptionPane.showMessageDialog(null,"NAO FORMA TRIANGULO");
				}
				
				else if (Math.pow(A, 2) == (Math.pow(B, 2)) + (Math.pow(C, 2)))
				{
					System.out.println("TRIANGULO RETANGULO");
					angulo = "TRIANGULO RETANGULO"; //SAIDA PARA DUAS MSG NO JOption

				}
				else if (Math.pow(A, 2) > (Math.pow(B, 2)) + (Math.pow(C, 2)))
				{
					System.out.println("TRIANGULO OBTUSANGULO");
					angulo = "TRIANGULO OBTUSANGULO";

				}
				else if (Math.pow(A, 2) < (Math.pow(B, 2)) + (Math.pow(C, 2)) && (B+C)<A)
				{
					System.out.println("TRIANGULO ACUTANGULO");
					angulo = "TRIANGULO ACUTANGULO";

				}
				if ( A == B && A == C)
				{
					System.out.println("TRIANGULO EQUILATERO");
					formato = "TRIANGULO EQUILATERO";


				}
				if (A != B && A == C || A != C && A==B || B != A && B == C)
				{
					System.out.println("TRIANGULO ISOCELES");
					formato = "TRIANGULO ISOCELES";

				}
				JOptionPane.showMessageDialog(null, angulo + "\n" +formato);

			}
		}
