package Array;

import java.util.Arrays;

//ð�������㷨
public class MaoPao {

	public static void main(String[] args) {
		maopao();
	}

	public static void maopao() {
		int[] arr = { 7, 3, 12, 1, 0 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
