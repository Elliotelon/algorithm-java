import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        /*

        // N개의 숫자의 합

        //스캐너 호출
        Scanner sc = new Scanner(System.in);

        //N값 입력받기
        int N = sc.nextInt();

        //string으로 입력받기
        String sNum = sc.next();

        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for(int i=0; i<cNum.length; i++){
            sum += cNum[i] - '0'; // 문자를 숫자로 바꿀때
        }

        System.out.println(sum);

        **/
        /*
         //구간 합 구하기 백준11659
         BufferedReader bufferedReader =
         new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer stringTokenizer =
         new StringTokenizer(bufferedReader.readLine());
         int suNo = Integer.parseInt(stringTokenizer.nextToken());
         int quizNo = Integer.parseInt(stringTokenizer.nextToken());
         long[] s = new long[suNo + 1];
         stringTokenizer =
         new StringTokenizer(bufferedReader.readLine());
         for(int i=1; i<=suNo; i++){
         s[i] = s[i-1] + Integer.parseInt(stringTokenizer.nextToken());
         }

         for(int q=0; q<quizNo; q++){
         stringTokenizer =
         new StringTokenizer(bufferedReader.readLine());
         int i = Integer.parseInt(stringTokenizer.nextToken());
         int j = Integer.parseInt(stringTokenizer.nextToken());
         System.out.println(s[j] - s[i-1]);
         }
         **/
        /*
            //카드게임 (백준2164 큐)
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            q.add(i);
        }
        while (q.size() > 1){
            q.poll();
            q.add(q.poll());
        }
        System.out.println(q.poll());
        **/
        



    }
}