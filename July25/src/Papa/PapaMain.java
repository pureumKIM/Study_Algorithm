package Papa;

public class PapaMain {
	public static void main(String[] args) {
		Pureum p = new Pureum();
		p.takeMoney(100);
		System.out.println("ÀÜ¾×Àº\t"+Papa.money);
		
		Jandi j = new Jandi();
		j.takeMoney(100);
		System.out.println("ÀÜ¾×Àº\t"+Papa.money);
		
		Minjung m = new Minjung();
		m.takeMoney(100);
		System.out.println("ÀÜ¾×Àº\t"+Papa.money);
		
	}
}
