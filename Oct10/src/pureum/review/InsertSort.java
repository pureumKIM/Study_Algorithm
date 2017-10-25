package pureum.review;

import java.util.Arrays;

public class InsertSort {
	public static void main(String[] args) {
		int[] data = {3, 11, 23, 7, 1, 5};
		insertSort(data);
		System.out.println(Arrays.toString(data));
	}
	public static void insertSort(int[] data) {
		int n = data.length;
		for (int i = 1; i < n; i++) {
			for (int j = i; j >0; j--) {
				if(data[j]<data[j-1]){
					int tmp = data[j-1];
					data[j-1]=data[j];
					data[j]=tmp;
				}
			}
		}
	}
}
