package org.diginamic.Tp_java_3;

import java.util.Arrays;
import java.util.Scanner;

public class TestFibonacci {
	public static void main(String[] args) {
		System.out.println("Choisissez un rang N.");
		Scanner askRangN = new Scanner(System.in);
		int rangN = askRangN.nextInt();
		int[] array = {0,1};
		for (int i = 2; i < rangN + 1; i++){
			array = Arrays.copyOf(array, array.length + 1);
			array[i] = array[i - 1] + array[i - 2];
		}
		System.out.println(array[rangN]);
	}
}
