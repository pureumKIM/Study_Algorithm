import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort2 {
	public static void main(String[] args) {
		int[] data = {3, 11, 23, -10, 16, 5};
		quickSort(data,0,data.length-1);
		System.out.print(Arrays.toString(data));
	}
	public static void quickSort(int[] data, int l, int r) {
		int left = l, right=r;
		int pivot = (left+right)/2;
		do{
			while(data[left]<data[pivot])left++;
			while(data[right]>data[pivot])right--;
			if(left<=right){
				int tmp = data[left];
				data[left]=data[right];
				data[right]=tmp;
				left++;
				right--;
			}
		}while(left<=right);
		
		if(left<r) quickSort(data,left,r);
		if(l<right) quickSort(data,l,right);
	}
}
