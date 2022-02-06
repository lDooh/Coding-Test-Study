import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] score = { 0, 0, 0 };
        int[] person1 = { 1, 2, 3, 4, 5 };
        int[] person2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] person3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == person1[i % person1.length]) score[0]++;
            if (answers[i] == person2[i % person2.length]) score[1]++;
            if (answers[i] == person3[i % person3.length]) score[2]++;
        }
        
        int max = score[0];
        for (int m : score) {
            if (max < m) {
                max = m;
            }
        }
        
        List<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (score[i] == max) {
                answerList.add(i + 1);
            }
        }
        
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}
