import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] data = {3, 11, 23, -10, 16, 5};
		quickSort(data,0,data.length-1);
		System.out.print(Arrays.toString(data));
	}
	public static void quickSort(int[] data, int l, int r) {
		int left =l, right=r;
		int pivot=(right+left)/2;
		do{
			while(data[pivot]>data[left]) left++;
			while(data[pivot]<data[right]) right--;
			if(left<=right){
				int tmp = data[right];
				data[right]=data[left];
				data[left]=tmp;
				left++;
				right--;
			}
		}while(left<=right);
		
		if(l<right) quickSort(data,l,right);
		if(left<r) quickSort(data,left,r);
	}
}
