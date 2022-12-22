import java.util.ArrayList;
import java.util.Scanner;

public class YaguExample {

   public static void main(String[] args) {
      Solution sol = new Solution();
      ArrayList<Ball> baseball = new ArrayList<Ball>();
      Scanner scn = new Scanner(System.in);
      int cnt=1;
      while(true) {
         Ball ball = new Ball();
         System.out.print(cnt+"번째 공 : ");
         ball.setQuestion(scn.next());
         if(ball.getQuestion().equalsIgnoreCase("end")) { break; }
         if(ball.getQuestion().equalsIgnoreCase("check")) {
            sol.solution(baseball);
            continue;
         }
         ball.setStrike(scn.nextInt());
         ball.setBall(scn.nextInt());
         baseball.add(ball);
         cnt++;
      }
      System.out.println("가능한 답의 개수 : "+sol.solution(baseball));
   }
}