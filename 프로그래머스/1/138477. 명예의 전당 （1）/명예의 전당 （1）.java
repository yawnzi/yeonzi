import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        ArrayList<Integer> arr = new ArrayList(); 

        for(int i=0; i < score.length; i++) {
            if(i < k) {
                arr.add(score[i]);
            }
            else {
                if(score[i] >= arr.get(0)){
                    arr.remove(0);
                    arr.add(score[i]);
                }
            }
            Collections.sort(arr);
            answer[i] = arr.get(0);
        }
        return answer;
    }
}