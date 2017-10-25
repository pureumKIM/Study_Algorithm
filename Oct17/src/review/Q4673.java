package review;

public class Q4673 {
	public static int [] numbers = new int[10000];
	public static void main(String[] args) {
		
		for (int i = 1; i < 10000; i++) {
			selfNum(i);
		}
		for (int i = 1; i < numbers.length; i++) {
			if(numbers[i]==0){
				System.out.println(i);
			}
		}
	}
	public static void selfNum(int num) {

		int sum=num;
		while(num>0){
			sum +=num%10;
			num /= 10;
		}
		if(sum<10000)
		numbers[sum]=1;
	}
}
