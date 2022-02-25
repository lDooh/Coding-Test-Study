class Solution {
    public boolean solution(int x) {
        String numberStr = Integer.toString(x);
        
        int sum = 0;
        for (int i = 0; i < numberStr.length(); i++) {
            sum += Character.getNumericValue(numberStr.charAt(i));
        }
        
        return (x % sum == 0);
    }
}
