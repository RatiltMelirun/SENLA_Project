package senla;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberFibonacci {

	public void fibonacci() throws IOException {
		BufferedReader red = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println ("\nНеобходимо написать рекурсивный алгоритм, который находит числа Фибоначчи в пределах \n"
				+ "от 1 до N. N – вводится вручную во время выполнения программы.\n");
		
		System.out.print("Укажите размер: ");
		int n = Integer.parseInt(red.readLine());
		factorial(0, 1, n);

	}

	private void factorial(int n1, int n2, int n) {
		if (n <= n1) {
			return;
		}
		System.out.print(n1 + " ");
		int next = n1 + n2;
		factorial(n2, next, n);
	}
}

