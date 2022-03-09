class Solution {
    public double solution(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        else {
            double sum = 0;
        
            for (int i : arr) {
                sum += i;
            }
            return sum / arr.length;
        }
    }
}
