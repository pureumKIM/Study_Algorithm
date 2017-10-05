package Papa;

public class Pureum {
	public Pureum() {
		// TODO Auto-generated constructor stub
	}
	public void takeMoney(int money){
		if(Papa.money>money){
		Papa.money = Papa.money-money;
		}else{
			System.out.println("½÷¸® µ·¾ø´ç");
		}
		
	}
}
