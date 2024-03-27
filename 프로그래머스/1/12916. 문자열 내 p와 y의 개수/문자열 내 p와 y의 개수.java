class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        s = s.toLowerCase();
        int countP = 0;
        int countY = 0;
        
        for(int i=0; i<s.length(); i++) {
            
            char ch = s.charAt(i);
            
            if(ch == 'p') {
                countP++;
            } else if(ch == 'y') {
                countY++;
            } 
        }
        
        if(countP != countY) {
            answer = false;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}