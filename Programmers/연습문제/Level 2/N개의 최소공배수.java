class Solution {
    // 최대공약수를 구하는 유클리드 호제법
    public static int euclidean(int a, int b) {
        if (b == 0) {
            return a;
        }
        else {
            return euclidean(b, a % b);
        }
    }
    
    // 두 자연수의 최소공배수 계산
    public static int calLCM(int a, int b) {
        return (a * b) / euclidean(a, b);
    }
    
    public int solution(int[] arr) {
        int answer = arr[0];
        
        for (int i = 0; i < arr.length; i++ ) {
            answer = calLCM(answer, arr[i]);
        }
        
        return answer;
    }
}
