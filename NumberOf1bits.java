public class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            // Check the least significant bit
            if ((n & 1) != 0) { 
                count++;
            }
            // Use unsigned right shift to avoid infinite loops with negative numbers
            n = n >> 1; 
        }
        return count;
    }
}
