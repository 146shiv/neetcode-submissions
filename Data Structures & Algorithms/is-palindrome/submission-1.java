class Solution {
    public boolean isPalindrome(String s) {
        
        // StringBuilder str = new StringBuilder();

        // for(char c : s.toCharArray()){
        //     if(Character.isLetterOrDigit(c)){
        //         str.append(Character.toLowerCase(c));
        //     }

        // }
        // String s1 = str.toString();
        // String reversed = new StringBuilder(s1).reverse().toString();

        // if(s1.equals(reversed)){
        //     return true;
        // }
        // return false;

        int left = 0;
        int right = s.length() - 1;

        while(left<right){

            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;

        


    }
}
