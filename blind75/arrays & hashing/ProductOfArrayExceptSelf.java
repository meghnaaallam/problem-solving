//Approach: product of arrays excluding the current element. to achieve this we can have two arrays left, right 
// leftaraay[0]=1;   rightarray[nums.length-1] = 1;
//left array can be calculated by multiplying all the elements and right array can be done by traversing the array from the end and calculating the product
// then the left array and right array can be multiplied and the result is put into a new array
// this approach is right but we're wasting space by having two arrays. instead we can reduce all the calculations to one result array 


//method -1
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arrRighttoLeft[] = new int[nums.length];
        int arrleftoRight[] = new int[nums.length];
        arrleftoRight[0]=1;
        for(int i=1;i<nums.length;i++) {
        arrleftoRight[i]= arrleftoRight[i-1] * nums[i-1];
        }
        arrRighttoLeft[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--) {
            arrRighttoLeft[i] = arrRighttoLeft[i+1] * nums[i+1];
            
        }
        int[] answer = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            answer[i] = arrleftoRight[i]*arrRighttoLeft[i];
        }
       
        return answer;
    }
}



//method-2
class Solution {
 public int[] productExceptSelf(int[] nums) {
   int arr[] = new int[nums.length];
   int right=1,left=1;
   for(int i=0;i<nums.length;i++) {
     arr[i] = left;
     left= left * nums[i];
   }
   for(int i= nums.length-1; i>=0; i--) {
     arr[i] = arr[i] * right;
     right = right * nums[i];
   }
   return arr;
 }
