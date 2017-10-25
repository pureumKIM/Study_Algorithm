import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] data = {3, 11, 23, -10, 16, 5};
		mergeSort(data,0,data.length-1);
		System.out.print(Arrays.toString(data));
	}
	public static void mergeSort(int[] data, int left, int right) {
		if(left<right){//작을때까지만 해야함!
			int mid = (left+right)/2;
			mergeSort(data,left,mid);
			mergeSort(data,mid+1,right);
			sort(data,left,mid,right);
		}
	}
	public static void sort(int[] data, int l, int m, int r) {
		int left =l, right=m+1, put=l;
		int [] tmp = new int[data.length];
		while(left<=m && right<=r){
			if(data[left]<data[right]){
				tmp[put++]=data[left++];
			}else{
				tmp[put++]=data[right++];
			}
		}
		while(left<=m){
			tmp[put++]=data[left++];
		}
		while(right<=r){
			tmp[put++]=data[right++];
		}
		for (int i = l; i <= r; i++) {//여기가 포인트
			data[i]=tmp[i];
		}

	}
}
