class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> charMap = new HashMap<>();

        if(s != null && t !=null && s.length() == t.length()) {
            for(int i = 0; i < s.length(); i++) {
                charMap.put(s.charAt(i), charMap.getOrDefault(s.charAt(i), 0) + 1);
            }

            for(int i = 0; i < t.length(); i++) {
                if(charMap.containsKey(t.charAt(i))) {
                    charMap.put(t.charAt(i), charMap.get(t.charAt(i)) - 1);
                    if(charMap.get(t.charAt(i)) == 0) {
                        charMap.remove(t.charAt(i));
                    }
                }
            }

        } else {
            return false;
        }

        if(charMap.size() == 0) {
            return true;
        }

        return false;
    }
}
