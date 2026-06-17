class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder str = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                str.append(Character.toLowerCase(c));
            }

        }

        String s1 = str.toString();
        String reversed = new StringBuilder(s1).reverse().toString();

        if(s1.equals(reversed)){
            return true;
        }
        return false;
    }
}
