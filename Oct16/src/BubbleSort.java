import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
//		int[] data = {3, 11, 23, -10, 16, 5};
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] data = new int[num];
		for (int i = 0; i < data.length; i++) {
			data[i]=sc.nextInt();
		}
		sort(data);
		System.out.print(Arrays.toString(data));

	}
	public static void sort(int[] data) {
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
