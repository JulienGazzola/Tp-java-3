package org.diginamic.Tp_java_3;

public class TestArray1 {
	public static void main(String[] args) {
		int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		int i = 0;
		int sizeMax = 0;
		for (i = 0; i < array.length ;i++){
			System.out.println(array[i]);
		}
		for (i = array.length - 1; i >= 0; i--){
			System.out.println(array[i]);
		}
		for (i = 0; i < array.length ;i++){
			if (array[i] > 3){
				System.out.println(array[i]);
			}
		}
		for (i = 0; i < array.length ;i++){
			if (array[i] % 2 == 0){
				System.out.println(array[i]);
			}
		}
		for (i = 0; i < array.length ;i++){
			if (sizeMax < array[i]){
				sizeMax = array[i];
			}
		}
		System.out.println(sizeMax);
		int sizeMin = sizeMax;
		for (i = 0; i < array.length ;i++){
			if (sizeMin > array[i]){
				sizeMin = array[i];
			}
		}
		System.out.println(sizeMin);
	}
}
