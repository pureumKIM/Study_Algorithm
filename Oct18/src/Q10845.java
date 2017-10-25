import java.util.Scanner;

public class Q10845 {
	public static int[] queue;
	public static int rear;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		init();
		int num = sc.nextInt();
		queue=new int[num];
		for (int i = 0; i < num; i++) {
			String str =sc.next();
			if(str.equals("push")){
				int t = sc.nextInt();
				push(t);
			}else if(str.equals("pop")){
				System.out.println(pop());
			}else if(str.equals("size")){
				System.out.println(size());
			}else if(str.equals("empty")){
				System.out.println(empty());
			}else if(str.equals("front")){
				System.out.println(front());
			}else if(str.equals("back")){
				System.out.println(back());
			}
		}
	}
	public static void init() {
		rear = -1;
	}
	public static void push(int num) {
		rear++;
		queue[rear]=num;
	}
	public static int pop() {
		if(empty()==1) return -1;
		int tmp = queue[0];
		for (int i = 0; i < rear; i++) {
			queue[i]=queue[i+1];
		}
		rear--;
		return tmp;//밀리는 과정
	}
	public static int size() {
		if(rear<0) return 0;
		return rear+1;
	}
	public static int empty() {
		if(rear == -1)
			return 1;
		else return 0;
	}
	public static int front() {
		if(empty()==1) return -1;//런타임 에러 방지 위해서
		return queue[0];
	}
	public static int back() {
		if(empty()==1||rear ==-1)return -1;//런타임에러방지를 위해
		return queue[rear];
	}
}
