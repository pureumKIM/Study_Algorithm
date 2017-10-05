package Papa;

public class Minjung {
	public void takeMoney(int money){
		if(Papa.money>money){
		Papa.money = Papa.money-money;
		}else{
			System.out.println("½÷¸® µ·¾ø´ç");
		}
	}
}
