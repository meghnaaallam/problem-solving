class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //O(n) time & space complexity

        HashMap<Integer, Integer> mp = new HashMap<>();
        List<Integer> bucket[] = new ArrayList[nums.length + 1]; 
        //+1 to represent frequencies, and index 0 is not used

        //save the frequencies of each elem in the mp 
        for (int n : nums) {
            mp.put(n, mp.getOrDefault(n, 0) + 1);
        }

        //loop through the keys of mp 
        //get the value of each key 
        //if bucket index is empty create an array
        //if not -> add the key to that index
        for(int key : mp.keySet()){
            int freq = mp.get(key); //saving the value of the key 
            if(bucket[freq] == null)
                bucket[freq] = new ArrayList<>();
            
            bucket[freq].add(key);
        }

        int index = 0;
        int[] output = new int[k]; //output is the answer 

        //loop through nums array from right to left to get the top K elem 
        for(int i = nums.length; i >= 0; i--){
            if(bucket[i] != null){
                for(int val : bucket[i]){ //loop through the values in each position that has elem
                    output[index] = val; //save this value to output
                    index++;
                    if(index == k)
                        return output;
                }
            }
        }
        return output;
    }
}
