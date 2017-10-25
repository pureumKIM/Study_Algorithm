package pureum.review;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] data = {3, 11, 23, 7, 1, 5};
		bubbleSort(data);
		System.out.println(Arrays.toString(data));
	}
	public static void bubbleSort(int[] data) {
		int n = data.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if(data[j]>data[j+1]){
					int tmp = data[j+1];
					data[j+1]=data[j];
					data[j]=tmp;
				}
			}
		}
	}
}
