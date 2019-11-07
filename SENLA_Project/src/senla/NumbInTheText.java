package senla;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumbInTheText 
{
	public void text() throws Exception 
	{
		BufferedReader red = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println ("Необходимо написать программу, которая удаляет из текста числа. "
				+ "Текст вводится вручную во время выполнения программы.");
		
		System.out.print("Введите текст: ");
		String str = red.readLine();
		clear(str);
	}
	
	private void clear (String str) 
	{
		System.out.println(str.replaceAll("[0-9]", ""));
	}
}
