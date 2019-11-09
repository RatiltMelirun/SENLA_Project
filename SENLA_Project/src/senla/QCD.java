package senla;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QCD {
	public void qcd_lcm() throws Exception {

		BufferedReader red = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Необходимо написать рекурсивный алгоритм для нахождения НОД и НОК двух чисел. \n"
				+ "Два числа вводятся вручную во время выполнения программы.\n");

		System.out.print("Введите первое число: ");
		int firstNumb = Integer.parseInt(red.readLine());

		System.out.print("Введите второе число: ");
		int secondNumb = Integer.parseInt(red.readLine());

		System.out.println("\nНаименьший общий делитель: " + qcd(firstNumb, secondNumb));
		System.out.println("Наименьшее общее кратное: " + lcm(firstNumb, secondNumb) + "\n");
	}

	private int qcd(int a, int b) {
		if (b == 0) {
			return Math.abs(a);
		}
		return qcd(b, a % b);
	}

	private int lcm(int a, int b) {
		return a / qcd(a, b) * b;
	}
}
