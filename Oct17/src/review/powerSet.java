package review;

public class powerSet {
	public static char[] ch ={'a','b','c','d','e'};//이렇게 값을 주고 초기화하는건 밖에
	public static boolean[] include;
	int n = 5;
	public static void main(String[] args) {
		include = new boolean[5];// 이건 안에 선언해도 상관 없음
		set(0);
	}
	public static void set(int level) {
		if(level==5){
			for (int i = 0; i < ch.length; i++) {
				if(include[i]==true){
					System.out.print(ch[i]+" ");
				}
			}
			System.out.println();
		}else{
			
			include[level]=true;
			set(level+1);
			include[level]=false;
			set(level+1);
			
		}

	}
}
