package pureum.algorithm;

public class SequentialSearch2 {
	public static void main(String[] args) {
		int [] data ={3,4,2,1,7,6,2,11,9,10};
		int result = search(data,0,data.length-1,7);
		System.out.println(data[result]);
		
	}
	public static int search(int [] data, int begin,int end, int target) {
		if(begin>end) return -1;
		else{
			int middle = (begin+end)/2;
			if(data[middle]==target) return middle;
			
			int index = search(data, begin, middle+1, target);
			if(index != -1) return index;
			else{
				return search(data, middle+1, end, target);
			}
		}
	}
}
