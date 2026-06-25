class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int n = numbers.length;

    //    for(int i =0; i<n; i++){
    //     for(int j = i+1; j<n; j++){
    //         if(numbers[i] + numbers[j] == target){
    //             return new int []{i+1,j+1};
    //         }
    //     }
    //    }

    //    return new int[] {-1,-1};

       HashMap<Integer,Integer> map = new HashMap<>();
        // int res = 0;

        for(int i = 0; i<n; i++){
           int res = target-numbers[i]; 
           
           if(map.containsKey(res)){
                return new int[]{map.get(res)+1,i+1};
           }

           map.put(numbers[i],i);
        }
        return new int[] {-1,-1};
       
        
    }
}
