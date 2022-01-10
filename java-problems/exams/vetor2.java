package exams;
import java.util.Scanner;

public class vetor2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);

		int []impar = new int [5];
		int []par = new int[5];
		
		int tPar=0;
		int tImpar=0;

		int x;
		
		for (int i=0; i< 15; i++)
		{
			x = entrada.nextInt();
			
			if (x % 2 == 0)
			{
				par[tPar] = x;
				tPar++;
				
				if(tPar == 5) //vetor cheio
				{
					tPar = 0;
						for (int a = 0; a < par.length; a++) //imprime vetor cheio
						{
							System.out.println("par["+a+"] = " + par[a]);
						}
				}
			}
			else
			{
				impar[tImpar] = x;
				tImpar++;
				
				if(tImpar == 5)
				{
					tImpar = 0;
						for (int a = 0; a < impar.length; a++)
						{
							System.out.println("impar["+a+"] = " +impar[a]);
						}
				}
			}
		}
		
        for (int i = 0; i < tImpar; i++) //vetor incompleto
        {
			System.out.println("impar["+i+"] = " +impar[i]); //imprime até valor incompleto
			
        }
        for (int i = 0; i < tPar; i++) 
        {
			System.out.println("par[" + i + "] = " +par[i]);
        }
	}
}
