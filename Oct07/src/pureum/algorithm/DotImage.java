package pureum.algorithm;
import java.util.Scanner;

public class DotImage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] mat = new int[num][num];
		int cnt=0;
		//입력받기
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		DotImage d = new DotImage();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if(mat[i][j]==1){
					cnt++;
					d.check(mat,i,j);
				}
			}
		}
		System.out.println(cnt);
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}

	}
	public int check(int [][] mat, int x, int  y) {
		if(x<0 || y<0 || x>=mat.length || y>= mat.length)
			return 0;
		else if(mat[x][y] != 1)
			return 0;
		else{
			mat[x][y]=2;
			return 1 + check(mat,x+1,y)+check(mat,x,y+1)+check(mat,x-1,y)+check(mat,x,y-1);
		}
	}	
}
