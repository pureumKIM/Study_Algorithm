package pureum.algorithm;

public class SelectionSort {
	public static void selectionSort(int[] arr) {
		int max;
		int n = arr.length;
		int indexMax=0;
		int tmp;
		for (int i = 0; i < n-1; i++) {
			max=arr[0];
			for (int j = 0; j <n-i ; j++) {
				if(max<=arr[j]) {
					indexMax=j;
				}		
			}
			tmp = arr[n-i-1];
			arr[n-i-1]=arr[indexMax];
			arr[indexMax]=tmp;
		}

	}
	public static void main(String[] args) {
		int[] ex = {13, 8, 11, 21, 3};
		selectionSort(ex);			
		for (int i = 0; i < ex.length; i++) {
			System.out.print(ex[i]+" ");
		}
	}
}
