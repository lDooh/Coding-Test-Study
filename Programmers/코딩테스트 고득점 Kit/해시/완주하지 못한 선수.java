import java.util.HashMap;
import java.util.Map.Entry;
//import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        /*Arrays.sort(participant);
        Arrays.sort(completion);
        
        int i = 0;
        for (i = 0; i < completion.length; i++) {
            if (!completion[i].equals(participant[i])) {
                break;
            }
        }

        return participant[i];*/
        
        HashMap<String, Integer> map = new HashMap<>();
        String answer = "";
        
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }
        
        for (Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                answer = entry.getKey();
                break;
            }
        }
        
        return answer;
    }
}
