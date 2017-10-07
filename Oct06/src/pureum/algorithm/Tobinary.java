package pureum.algorithm;

public class Tobinary {
	public static void main(String[] args) {
		binary(10);
	}
	public static void binary(int num) {
		if(num<2) 
			System.out.print(num);
		else{
			binary(num/2);//넣는게 먼저
			System.out.print(num%2);//나중에 프린트가 되야하니까
		}
	}
}
