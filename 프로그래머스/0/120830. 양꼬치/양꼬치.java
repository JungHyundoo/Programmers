class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int x = 0;
        if(n%10 <= 9) {
            x = n/10;
        }
        answer = n*12000 + k*2000 - x*2000;
        return answer;
    }
}