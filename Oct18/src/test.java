import java.util.LinkedList;
import java.util.Queue;

public class test{
	public static void main(String[] args) {
		Queue<Students> q = new LinkedList<>();
		q.offer(new Students(24,94));
		q.offer(new Students(23,95));
		q.offer(new Students(19,99));
		System.out.println(q.peek().x);//
		System.out.println(q.poll().y);
		System.out.println(q.peek().x);
		System.out.println(q.peek().y);
		System.out.println(q.peek().x);
		System.out.println(q.peek().y);
		System.out.println(q.size());
		
	}
}
class Students{
	int x,y;
	Students(int x, int y){
		this.x = x;
		this.y = y;
	}
}