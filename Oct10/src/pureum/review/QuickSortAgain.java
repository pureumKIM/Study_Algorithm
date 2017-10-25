package pureum.review;

import java.util.Arrays;

public class QuickSortAgain {
	public static void main(String[] args) {
		int[] data = {3, 11, 23, 7, 1, 5};
		quickSort(data,0,data.length-1);
		System.out.println(Arrays.toString(data));
	}
	public static void quickSort(int[] data, int l, int r) {
		int left =l, right=r;
		int pivot =(left+right)/2;
		do{
			while(data[left]<data[pivot])left++;
			while(data[right]>data[pivot])right--;
			if(left<=right){
				int tmp =data[right];
				data[right]=data[left];
				data[left]=tmp;
				left++;
				right--;
			}
		}while(left<=right);
		if(l<right) quickSort(data,l,right);
		if(r>left) quickSort(data,left,r);
	}
}
