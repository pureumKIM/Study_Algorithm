package pureum.algorithm;

public class SequentialSearch {
	public static void main(String[] args) {
		int [] data ={3,4,2,1,7,6,2,11,9,10};
		int result = search(data,0,data.length-1,7);
		System.out.println(data[result]);
	}
	public static int search(int [] data, int begin,int end, int target) {
		if(begin>end) return -1;
		else if(target == data[end]) return end;
		else{
			return search(data, begin, end-1,target);
		}
	}
}
