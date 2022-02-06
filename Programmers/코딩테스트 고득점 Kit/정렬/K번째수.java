import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int count = 0;
        
        for (int[] cc : commands) {
            int[] tmp = Arrays.copyOfRange(array, cc[0] - 1, cc[1]);
            Arrays.sort(tmp);
            answer[count++] = tmp[cc[2] - 1];
        }
        
        return answer;
    }
}
