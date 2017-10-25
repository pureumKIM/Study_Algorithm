import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] data = {3, 11, 23, -10, 16, 5};
		sort(data);
		System.out.print(Arrays.toString(data));
	}
	public static void sort(int[] data) {
		int n = data.length;
		for (int i = 0; i < n-1; i++) {
			int max = data[0];
			int maxI = 0;
			for (int j = 0; j < n-i; j++) {
				if(max<data[j]){
					max = data[j];
					maxI=j;
				}
			}
			int tmp = data[n-i-1];
			data[n-i-1]=data[maxI];
			data[maxI]=tmp;
		}
	}
}
