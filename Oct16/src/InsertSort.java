import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertSort {
	public static void main(String[] args) {
		int[] data = {3, 11, 23, -10, 16, 5};
		sort(data);
		System.out.print(Arrays.toString(data));
	}
	public static void sort(int[] data) {
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
