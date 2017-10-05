
public class CalculClass {
	public static void main(String[] args) {
		CalculClass ha = new CalculClass();
		ha.sum(123);

	}
	
	public void sum(int num) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		while(num !=0){
			sum += num%10;
			
			num= num/10;
		}
		System.out.println(sum);
	}
}
