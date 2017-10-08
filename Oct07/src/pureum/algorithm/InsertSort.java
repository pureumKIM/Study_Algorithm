package pureum.algorithm;

public class InsertSort {
	public static void insertSort(int[] arr) {
		int n = arr.length;
		int tmp;
		for (int i = 1; i < n; i++) {//이부분이 다르다!
			for (int j = i; j > 0; j--) {
				if(arr[j]<arr[j-1]){
					tmp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j]=tmp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] ex = {5, 2, 3, 4, 1};
		insertSort(ex);			
		for (int i = 0; i < ex.length; i++) {
			System.out.print(ex[i]+" ");
		}
	}
}
