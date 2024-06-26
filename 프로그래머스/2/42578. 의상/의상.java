//조합..?
import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        
        //map에 갯수 넣기
        for(int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1); 
        }
        
        for (String str : map.keySet()) {
            answer *= (map.get(str) + 1);
        }
        System.out.print(map);
        return answer-1;
    }
}