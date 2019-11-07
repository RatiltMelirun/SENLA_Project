package senla;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeNumbers 
{
	public void checkPrimeNumb() throws Exception 
	{
		BufferedReader red = new BufferedReader(new InputStreamReader(System.in));
		System.out.println ("Необходимо написать программу, которая вычисляет простые числа \n"
				+ "в пределах от 1 до N. N – вводится вручную во время выполнения программы.\n");
		System.out.println("Укажите размер: ");
		int n = Integer.parseInt(red.readLine());
		check(n);
	}

	private void check(int n) 
	{
		int numb, b;
		for (numb = 2; numb < n; numb++) 
		{
			for (b = 2; numb % b > 0; b++)
			{
			}
			if (numb == b) 
			{
				System.out.print(numb + " ");
			}
		}
	}
}