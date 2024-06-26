import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < words.length; i++) {
            // 중복 단어 체크
            if (list.contains(words[i])) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                return answer;
            }
            // 끝말잇기 규칙 체크
            if (i > 0 && words[i].charAt(0) != words[i-1].charAt(words[i-1].length() - 1)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                return answer;
            }
            
            list.add(words[i]);
        }
        
        answer[0] = 0;
        answer[1] = 0;
        return answer;
    }
}
