*/input: -1 0 2 3 7 0 3 1 0
-1 2 3 7 3 1 0 0 0
*/




public class MoveAllZerosToEnd {
public static void main(String[] args) {
int arr[] = {1,6,0,3,8,9,0,2};
int len = arr.length;
int count = 0;
//Traverse an array
for(int i = 0; i < len; i++) {
//If it is not zero, move forward
if(arr[i] != 0) {
arr[count++] = arr[i];
}			
}
//Put zeroes at the end of an array
while(count < len) {
arr[count++] = 0;
}
for(int j = 0; j < len; j++) {
System.out.println(arr[j]);
}
}
