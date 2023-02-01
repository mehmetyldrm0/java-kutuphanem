package org.csystem.util.array.test;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class SubtractMatricesTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();

		System.out.print("Bir sayı giriniz:");
		int count = kb.nextInt();

		for (int i = 0; i < count; ++i) {
			int m = r.nextInt(3, 8);
			int n = r.nextInt(3, 8);
			int [][] m1 = ArrayUtil.getRandomMatrix(r, m, n, 0, 99);
			int [][] m2 = ArrayUtil.getRandomMatrix(r, m, n, 0, 99);
			System.out.println("----------------------------------------------------");
			ArrayUtil.print(2, m1);
			System.out.println("+");
			ArrayUtil.print(2, m2);
			System.out.println("=");
			ArrayUtil.print(3, ArrayUtil.subtractMatrices(m1, m2));
			System.out.println("----------------------------------------------------");
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}