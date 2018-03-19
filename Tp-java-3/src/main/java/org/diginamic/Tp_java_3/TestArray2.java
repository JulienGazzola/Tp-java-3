package org.diginamic.Tp_java_3;

public class TestArray2 {
	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int i = 0;
		int moy = 0;
		int som = 0;
		for (i = 0; i < array.length ;i++){
			som += array[i];
		}
		moy = som / array.length;
		System.out.println(moy);
		for (i = 0; i < array.length ;i++){
			if (array[i] == 15){
				System.out.println(i + 1);
			}
		}
	}
}
