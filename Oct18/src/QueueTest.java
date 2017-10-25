import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		Queue q = new LinkedList();
		q.offer("a");//큐에 값넣기
		q.offer("b");
		q.offer("c");
		System.out.println(q);//큐 모두 출력
		System.out.println("맨앞"+q.peek());//맨 앞 가져오기
		while(!q.isEmpty()){
			System.out.println(q.poll());//맨 앞 가져오고 삭제
		}
	}
}
