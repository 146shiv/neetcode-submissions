class Solution {
    public boolean checkInclusion(String s1, String s2) {
        

        if(s1.length() > s2.length()){
            return false;
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for (char ch : s1.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        int windowSize = s1.length();

        for(int i = 0; i<windowSize; i++){
            char ch = s2.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }

        if(map1.equals(map2)){
            return true;
        }
        for (int i = windowSize; i < s2.length(); i++) {
            char addChar = s2.charAt(i);
            map2.put(addChar, map2.getOrDefault(addChar, 0) + 1);
            char removeChar = s2.charAt(i - windowSize);
            map2.put(removeChar, map2.get(removeChar) - 1);

            if (map2.get(removeChar) == 0) {
                map2.remove(removeChar);
            }
            if (map1.equals(map2)) {
                return true;
            }
        }
        return false;

    }
}
