package Papa;

public class Jandi {
	public void takeMoney(int money){
		if(Papa.money>money){
		Papa.money = Papa.money-money;
		}else{
			System.out.println("���� ������");
		}
	}
}
