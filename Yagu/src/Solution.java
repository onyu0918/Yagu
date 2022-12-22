import java.util.ArrayList;

public class Solution {

    public int solution(ArrayList<Ball> baseball) {
        int answer = 0;
        for(int i=1; i<=9; i++) {
           for(int j=1; j<=9; j++) {
              for(int k=1; k<=9; k++) {
                 if(i==j || j==k || i==k) continue;
                 int cnt = 0;
                 for(int y=0; y<baseball.size(); y++) {
                    int gong = Integer.parseInt(baseball.get(cnt).getQuestion());
                    int one = gong/100;
                    int two = gong%100/10;
                    int three = gong%10;
                    int strike = 0;
                    int ball = 0;
                    if(one==i) {
                       strike++;
                    }
                    if(two==i || three==i) {
                       ball++;
                    }
                    if(two==j) {
                       strike++;
                    }
                    if(one==j || three==j) {
                       ball++;
                    }
                    if(three==k) {
                       strike++;
                    }

                    if(one==k || two==k) {
                       ball++;
                    }
                    if(baseball.get(cnt).getStrike()==strike && baseball.get(cnt).getBall()==ball) {
                       cnt++;
                    }
                 }
                 if(cnt==baseball.size()) {
                    answer++; 
                    System.out.println(i+", "+j+", "+k);
                 }
              }
           }
        }
        return answer;
    }
}