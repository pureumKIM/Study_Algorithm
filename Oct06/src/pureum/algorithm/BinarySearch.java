package pureum.algorithm;

public class BinarySearch {
	public static void main(String[] args) {
		int [] data ={2,3,6,7,10,21,32,42,12};
		int result = search(data,0,data.length-1,21);
		System.out.println(data[result]);
	}
	public static int search(int [] data, int begin,int end, int target) {
		if(begin>end) return -1;
		else{
			int middle = (begin+end)/2;
			if(target == data[middle]) return middle;
			else if(target<data[middle]){
				return search(data,begin,middle-1,target);
			}else{
				return search(data,middle+1,end,target);
			}
		}
	}
}
