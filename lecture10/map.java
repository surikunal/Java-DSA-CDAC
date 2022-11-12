import java.util.HashMap;

public class map {
    public static void main(String[] args) {
        String keyboard = "abcdefghijklmnopqrstuvwxyz";
        String word = "cba";
        System.out.println(calculateTime(keyboard, word));
    }

    // Leetcode 1165 =====================================================
    public static int calculateTime(String keyboard, String word) {
        HashMap<Character, Integer> map = new HashMap<>();

        // build a hashmap
        for (int i = 0; i < keyboard.length(); i++) {
            char c = keyboard.charAt(i);
            map.put(c, i);
        }

        // main logic
        int ans = 0;
        int prev = 0;
        for (int i = 0; i < word.length(); ++i) {
            int curr = map.get( word.charAt(i) );
            ans += Math.abs(curr - prev);
            prev = curr;
        }
        return ans;
    }
    

    // Leetcode 1570 =====================================================
    class SparseVector {
        HashMap<Integer, Integer> map;
        SparseVector(int[] nums) {
            map = new HashMap<>();
    
            for (int i = 0; i < nums.length; i++) {
                if ( nums[i] != 0 ) {
                    map.put( i, nums[i] );
                }
            }
        }
        
        // Return the dotProduct of two sparse vectors
        public int dotProduct(SparseVector vec) {
            int ans = 0;
    
            for (int i: map.keySet()) {
                if ( vec.map.containsKey(i) ) {
                    ans += map.get(i) * vec.map.get(i);
                }
            }
    
            return ans;
        }
    }
}
