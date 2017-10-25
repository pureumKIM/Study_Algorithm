package review;

import java.util.Scanner;

public class midas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int tft = sc.nextInt();
		int total = n + m;// 총 사원수
		int part;

		if (n / 2 >= m) {// 사원이 팀장*2보다 많을 때
			part = m;
		} else {// 사원이 적을 때
			part = n / 2;
		}

		total -= part * 3;
		while (total <= tft) {
			part--;
			total += 3;
		}

		System.out.println(part);
	}
}
