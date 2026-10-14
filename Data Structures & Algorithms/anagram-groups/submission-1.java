class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        for(String input : strs) {

            int[] count = new int[26];
            for(char ch : input.toCharArray()) {
                /**
                 * 'a'-'a' = 98-98 = 0 i.e count[0] is incremented by 1. That means a is 1 in frequency
                 */
                count[ch - 'a']++;
            }
            String key = Arrays.toString(count);
            result.putIfAbsent(key, new ArrayList<>());
            result.get(key).add(input);
        }

        return new ArrayList<>(result.values());
    }

    
}
