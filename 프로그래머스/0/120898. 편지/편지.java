class Solution {
    public int solution(String message) {
        int answer = 0;
        if(0 < message.length() && message.length() <= 50) {
            for(int i=0; i<message.length(); i++) {
                answer += 2;
            }
        }
        return answer;
    }
}