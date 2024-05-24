class Solution {
    public String solution(String s) {
        // 공백 기준으로 문자열 자르기(마지막에 오는 빈 문자열도 포함하도록)
        String[] strArr = s.split(" ", -1);

        for(int i=0; i < strArr.length; i++) {
            // 한 글자 씩 자르기
            String[] str = strArr[i].split("");
            for(int j=0; j < str.length; j++) { 
                // 짝수인 경우 대문자로 변경
                if(j%2 ==0) {
                    str[j] = str[j].toUpperCase();
                } 
                // 홀수인 경우 소문자로 변경
                else {
                    str[j] = str[j].toLowerCase();
                }

            }
            // 문자열로 합치기
            strArr[i] = String.join("", str);
        }
        return String.join(" ", strArr);
    }
}