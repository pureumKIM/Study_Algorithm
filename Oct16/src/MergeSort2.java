import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort2 {
	public static void main(String[] args) {
		int[] data = {3, 11, 23, -10, 16, 5};
		mergeSort(data,0,data.length-1);
		System.out.print(Arrays.toString(data));
	}
	public static void mergeSort(int[] data, int left, int right) {
		if(left<right){
			int mid = (left+right)/2;
			mergeSort(data,left,mid);
			mergeSort(data,mid+1,right);
			merge(data,left,mid,right);
		}
	}
	public static void merge(int[] data, int left,int mid,int right) {
		int l = left, r=mid+1, put=left;
		int[] tmp = new int[data.length];
		while(l<=mid && r<= right){
			if(data[l]<data[r]){
				tmp[put++]=data[l++];
			}else{
				tmp[put++]=data[r++];
			}
		}
		while(l<=mid){
			tmp[put++]=data[l++];
		}
		while(r<=right){
			tmp[put++]=data[r++];
		}
		for(int k=left;k<=right;k++){
			data[k]=tmp[k];
		}
	}
}
