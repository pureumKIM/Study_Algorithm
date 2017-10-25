import java.util.Scanner;

public class Sugar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sugar = sc.nextInt();
		
		if(sugar%5==0){
			System.out.println(sugar/5);
			return;
		}else{
			int bt = sugar/5;//26
			int nam = sugar-bt*5;//1
			for (int i = bt; i>0; i--) {//bt=25, nam=6
				if(nam%3==0){
					System.out.println(i+(nam/3));
					return;
				}
				nam+=5;
			}
		}
		
		if(sugar%3==0){
			System.out.println(sugar/3);
		}else{
			System.out.println(-1);
		}
	}
}
