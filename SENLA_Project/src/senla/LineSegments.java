package senla;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LineSegments 
{
	public void coordinates () throws Exception 
	{
		BufferedReader red = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println ("\nНеобходимо написать программу, которая определяет пересекаются ли два отрезка. \n"
				+ "Координаты отрезков вводятся вручную во время выполнения программы.\n");
		
		System.out.println("Введите координаты первого отрезка: ");
		double ax1 = Double.parseDouble(red.readLine());
		double ay1 = Double.parseDouble(red.readLine());
		double ax2 = Double.parseDouble(red.readLine());
		double ay2 = Double.parseDouble(red.readLine());

		System.out.println("Введите координаты второго отрезка: ");
		double bx1 = Double.parseDouble(red.readLine());
		double by1 = Double.parseDouble(red.readLine());
		double bx2 = Double.parseDouble(red.readLine());
		double by2 = Double.parseDouble(red.readLine());

		double v1, v2, v3, v4;

		v1 = (bx2-bx1)*(ay1-by1)-(by2-by1)*(ax1-bx1);
		v2 = (bx2-bx1)*(ay2-by1)-(by2-by1)*(ax2-bx1);
		v3 = (ax2-ax1)*(by1-ay1)-(ay2-ay1)*(bx1-ax1);
		v4 = (ax2-ax1)*(by2-ay1)-(ay2-ay1)*(bx2-ax1);

		if ((v1 * v2 < 0) && (v3 * v4 < 0)) 
		{
			System.out.println("Отрезки пересекаются \n");
		} else 
		{
			System.out.println("Отрезки не пересекаются \n");
		}
	}
}
