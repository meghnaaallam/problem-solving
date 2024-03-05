class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int k = p.length();
        for(int i=0;i<k;i++) {
            char value = p.charAt(i);
            if(map.containsKey(value)) {
                map.put(value, map.get(value)+1);
            }
            else {
                map.put(value,1);
            }
        }
        int i=0,j=0;
         int count=map.size();
        while(j<s.length()) {
            char ch = s.charAt(j);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch)-1);
            if(map.get(ch)==0) {
                count --;
            }
            }
            if((j-i+1)< k) {
                j++;
            }
           else if((j-i+1) ==k) {
               if(count ==0) {
                   result.add(i);
               }
                char ch1 = s.charAt(i);
                if(map.containsKey(ch1)) {
                    map.put(ch1, map.get(ch1)+1);
                    if(map.get(ch1)==1) {
                        count++;
                    }
                }
                j++;
                i++;
            }
        }
        return result;
     }
}




// first count the occurrences of the pattern string and store it in a hashmap
// here we can identify this question as a hashmap because we need to find a pattern in the given string so we have a fixed window. so k will be the length of the pattern given
// inside while loop we check if the char matches the values in hashmap, if yes then decreement 
// decreement the count value as well where we are storing the size of the map (which means no.of distinct values in the hashmap)
// if the window size matches then we increement i and j both and before that we check if count == 0 to know that the string matches the pattern
// and also increement the hashmap values if i is present in the hashmap then increement (we are incrementing because we have found the exact match and will now proceed to find another string
which means we need to eliminate all the values and calculations related to i
