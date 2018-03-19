package org.diginamic.Tp_java_3;
import java.util.Arrays;

import java.util.Scanner;

public class ProgramTab {
	public static void main(String[] args) {
		int tmp = 0;
		int[] array = new int[0];
		while (true){
			System.out.println(" 1. Ajouter un nombre.\n 2. Afficher les nombres existants.");
			Scanner askCommand = new Scanner(System.in);
			int command = askCommand.nextInt();
			if (command == 1){
				Scanner askNumber = new Scanner(System.in);
				int number = askNumber.nextInt();
				if (tmp < array.length){
					array[tmp] = number;
				}
				else {
					array = Arrays.copyOf(array, array.length + 1);
					array[tmp] = number;
				}
				tmp++;
			}
			if (command == 2){
				for (int i = 0; i < array.length ;i++){
					System.out.println(array[i]);
				}
			}
		}
	}
}
