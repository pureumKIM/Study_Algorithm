package pureum.review;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] data = {3, 11, 23, 7, 1, 5};
		selectionSort(data);
		System.out.println(Arrays.toString(data));
	}
	public static void selectionSort(int[] data) {
		int n = data.length;
		for (int i = 0; i < n-1; i++) {
			int max = data[0];
			int maxI= 0;
			for (int j = 0; j < n-i; j++) {
				if(max<=data[j]){
					max=data[j];
					maxI=j;
				}
			}
			int tmp = data[n-i-1];
			data[n-i-1]=data[maxI];
			data[maxI]=tmp;
		}
	}
}
