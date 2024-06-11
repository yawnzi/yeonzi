//스택사용
//isEmpty() 를 잊지말자...
import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;

        Stack<Character> stack = new Stack<>();
        
        for (int i=0;i<s.length();i++) {
            if(!stack.isEmpty() && stack.peek() == s.charAt(i)) {
                stack.pop();
            }
            else {
                stack.push(s.charAt(i));
            }
        }
        
        if (stack.isEmpty()) {
            return 1;
        }
        else {
            return 0;
        }
    }
}