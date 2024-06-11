import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        for(int i=1;i<=yellow;i++) {
            for(int j=i;j<=yellow/i;j++) {
                if (i*j==yellow && i+i+j+j+4 == brown) {
                    answer[0] = j+2;
                    answer[1] = i+2;
                }
            }
        }
        return answer;
    }
}