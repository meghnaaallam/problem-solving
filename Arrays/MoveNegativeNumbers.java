*/ input: 1 45 22 -45 -3 23 -2 11
output: -2 -3 -45 1 11 22 23 45
*/




public class Main {
public static void main(String[] args) {
int arr[] = {9,-1,0,-3,0,-1,1,1};
int len = arr.length;
rearrange(arr,len);
printArrange(arr,len);
}
public static void rearrange(int arr[], int len) {
  int temp;
  int j=0;
  for(int i=0;i<len;i++) {
    if(arr[i]<0) {
      if(i!=j) {
        temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
      }
      j++;
    }
  }
}
public static void printArrange(int arr[],int len) {
  for(int i=0;i<len;i++) {
    System.out.print(arr[i]+" ");
  }
}
}
