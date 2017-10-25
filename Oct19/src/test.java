import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 
class Pair{     //큐에  x,y 짝을 저장하기 위한 class
    int x,y;
    Pair(int x, int y){
        this.x=x;
        this.y=y;
    }
}
 
 
public class test {
    static int dx[]={0,0,1,-1};
    static int dy[]={1,-1,0,0};
    static int count;
    static int result[];
    static int arr[][];
    static int N;
 
     
    static void bfs(int x, int y){
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(x,y));
         
        arr[x][y]=count;
         
        while(!q.isEmpty()){
            Pair tmp=q.remove();
            result[count]++;
            for(int i=0;i<4;i++){
                int cx=dx[i]+tmp.x;
                int cy=dy[i]+tmp.y;
                if(cx>=0 && cx<N && cy>=0 && cy<N){
                    if(arr[cx][cy]==1){
                        q.add(new Pair(cx,cy));
                        arr[cx][cy]=count;
                         
                    }
                }
            }
        }
    }
    public static void main(String args[]){
    	long startNum = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        arr=new int[N][N];
        result=new int[N*N];
         
        for(int i=0;i<N;i++){
            String tmp=sc.next();
            char ch[]=tmp.toCharArray();
            for(int j=0;j<ch.length;j++){
                arr[i][j]=ch[j]-'0';
            }
        }
        count=2;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(arr[i][j]==1){
                    bfs(i,j);
                    //System.out.println(" ");
                    count++;
                }
            }
        }
        System.out.println(count-2);
        Arrays.sort(result);
        for(int i=N*N-count+2;i<N*N;i++){
            System.out.println(result[i]);
        }
        long endNum = System.currentTimeMillis();
        System.out.println(endNum-startNum);
    }
 
}