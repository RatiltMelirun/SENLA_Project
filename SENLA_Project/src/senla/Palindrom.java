package senla;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palindrom 
{
	public void checkPalindrom () throws Exception 
	{
		BufferedReader red = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println ("Необходимо написать программу, которая проверяет слово на палиндромность. \n"
				+ "Слово для проверки вводится вручную во время выполнения программы.\n");
		
		System.out.print("Введите слово: ");
		String n = red.readLine();
		System.out.println (check(n)?"Это слово палиндром \n" : "Это слово не палиндром \n");
	}
	
	private boolean check (String str) {
		for(int i = 0; i < str.length()/2; i++)
		{
			if (str.charAt(i) != str.charAt(str.length()-i-1))
			{
				return false;
			}
		}
		return true;
	}
}